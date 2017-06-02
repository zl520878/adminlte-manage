package com.adminlte.service.impl;

import com.adminlte.mapper.ShopInfoMapper;
import com.adminlte.pojo.ShopInfo;
import com.adminlte.service.IShopInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by zhangliang2 on 2017/5/22.
 *
 */

@Service
public class ShopInfoServiceImpl extends ServiceImpl<ShopInfoMapper, ShopInfo> implements IShopInfoService {
}
