package com.adminlte.controller;

import com.adminlte.commons.utils.ResponseVo;
import com.adminlte.pojo.ShopInfo;
import com.adminlte.service.impl.ShopInfoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by zhangliang2 on 2017/5/22.
 *
 */
@Controller
@RequestMapping("/out")
public class ShopInfoController extends BaseController {

    @Autowired
    ShopInfoServiceImpl shopInfoService;

    @RequestMapping(value = "/shopinfo", method = RequestMethod.GET)
    public ResponseEntity<ResponseVo> getShopInfoData(){
        ShopInfo shopInfo = shopInfoService.selectById(1);
        return ResponseEntity.ok(getResponseData(true, "获取成功！", shopInfoService.selectById(1)));
    }
}
