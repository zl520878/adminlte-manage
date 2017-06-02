package com.adminlte.service.impl;

import com.adminlte.mapper.GoodsInfoMapper;
import com.adminlte.pojo.GoodsInfo;
import com.adminlte.service.IGoodInfoService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * Created by zhangliang2 on 2017/5/27.
 *
 */
@Service
public class GoodsInfoServiceImpl extends ServiceImpl<GoodsInfoMapper, GoodsInfo> implements IGoodInfoService {
}
