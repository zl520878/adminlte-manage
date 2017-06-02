package com.adminlte.controller;

import com.adminlte.commons.utils.ResponseVo;
import com.adminlte.service.IGoodInfoService;
import com.adminlte.service.IShopInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhangliang2 on 2017/5/22.
 *
 */
@Controller
@RequestMapping("/out")
public class ShopInfoController extends BaseController {

    @Autowired
    IShopInfoService iShopInfoService;

    @Autowired
    IGoodInfoService iGoodInfoService;

    @RequestMapping(value = "/shopinfo", method = RequestMethod.GET)
    public ResponseEntity<ResponseVo> getShopInfoData(){
        return ResponseEntity.ok(getResponseData(true, "获取成功！", iShopInfoService.selectById(1)));
    }

    @RequestMapping(value = "/getUserSession", method = RequestMethod.GET)
    public ResponseEntity<ResponseVo> getUserSession(HttpServletResponse response, HttpServletRequest request){
        request.getSession().setAttribute("rd_session", request.getSession().getId());
        Map<String, Object> mp = new HashMap<>();
        mp.put("rd_session",request.getSession().getId());
        return ResponseEntity.ok(getResponseData(true, "获取成功！", mp));
    }

    @RequestMapping(value = "/uploadImage", method = RequestMethod.GET)
    public ResponseEntity<ResponseVo> uploadImage(HttpServletRequest request){


        return ResponseEntity.ok(getResponseData(true, "获取成功！", 11));
    }

    @RequestMapping(value = "/getGoodsInfo", method = RequestMethod.GET)
    public ResponseEntity<ResponseVo> getGoodsInfo(HttpServletRequest request){
        return ResponseEntity.ok(getResponseData(true, "获取成功！", iGoodInfoService.selectById(1)));
    }

}
