package com.adminlte.controller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.netease.cloud.auth.BasicCredentials;
import com.netease.cloud.auth.Credentials;
import com.netease.cloud.services.nos.NosClient;
import com.netease.cloud.services.nos.model.ObjectMetadata;
import com.sun.corba.se.spi.activation.Server;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.adminlte.result.PicUploadResult;
import com.adminlte.service.IProfileService;
import com.fasterxml.jackson.databind.ObjectMapper;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static sun.management.snmp.jvminstr.JvmThreadInstanceEntryImpl.ThreadStateMap.Byte1.other;

/**
 * 上传管理
 * @author zhangliang
 *
 */
@Controller
@RequestMapping("pic")
public class PicUploadController extends BaseController{

	Logger logger = LoggerFactory.getLogger(PicUploadController.class);

	private static final ObjectMapper mapper = new ObjectMapper();

	@Autowired
	private IProfileService profileService;

	// 允许上传的格式
	private static final String[] IMAGE_TYPE = new String[] { ".bmp", ".jpg", ".jpeg", ".gif", ".png" };



	@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String upload(@RequestParam("imgUp") MultipartFile uploadFile, HttpServletRequest request) throws Exception {

		// 校验图片格式
		boolean isLegal = false;
		for (String type : IMAGE_TYPE) {
			if (StringUtils.endsWithIgnoreCase(
					uploadFile.getOriginalFilename(), type)) {
				isLegal = true;
				break;
			}
		}


		// 封装Result对象，并且将文件的byte数组放置到result对象中
		PicUploadResult fileUploadResult = new PicUploadResult();

		// 状态
		fileUploadResult.setError(isLegal ? 0 : 1);


		// 文件新路径
		String filePath = getFilePath(uploadFile,request.getParameter("picType"));


		fileUploadResult.setUrl(filePath);

		// 状态
		fileUploadResult.setError(isLegal ? 0 : 1);


		//保存url到数据库
		profileService.updateImgById(getUserId(), filePath);
		
		// 将java对象序列化为json字符串
		return mapper.writeValueAsString(fileUploadResult);
	}

	private String getFilePath(MultipartFile uploadFile, String picType) { //picType: 0:店铺logo,1:商品图片

		String filePath;
		if ("0".equals(picType)) {
			filePath = "shop-logo";
		} else if ("1".equals(picType)) {
			filePath = "goods-img";
		} else {
			filePath = "other";
		}

		//网易蜂巢OSS

		String endPoint = "http://nos-eastchina1.126.net";
		String accessKey = "ed6a9afa6f2d4931be9c498b916771ad";
		String secretKey = "bc4b62305aa14b07869cbfc5f4b08950";
		Credentials credentials = new BasicCredentials(accessKey, secretKey);
		NosClient nosClient = new NosClient(credentials);
		nosClient.setEndpoint(endPoint);

		try {
			int streamLength;
			streamLength = uploadFile.getInputStream().available();
			ObjectMetadata objectMetadata = new ObjectMetadata();
			//设置流的长度，你还可以设置其他文件元数据信息
			objectMetadata.setContentLength(streamLength);
			nosClient.putObject(
					filePath,
					uploadFile.getOriginalFilename(),
					uploadFile.getInputStream(),
					objectMetadata);
		} catch (Exception e) {
			logger.error(e.getMessage());
		}

		return endPoint.split("http://")[0] + filePath + "." + endPoint.split("http://")[1] + "/" + uploadFile.getOriginalFilename();
	}
}