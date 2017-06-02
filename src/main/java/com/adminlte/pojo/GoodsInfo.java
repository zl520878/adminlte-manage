package com.adminlte.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * Created by zhangliang2 on 2017/5/27.
 *
 */
@TableName("wx_mp_goods_info")
public class GoodsInfo implements Serializable {

    @TableField("goods_id")
    private int goodsId;

    @TableField("goods_name")
    private String goodsName;

    @TableField("goods_price")
    private double goodsPrice;

    @TableField("goods_image_url")
    private String goodsImageUrl;

    @TableField("goods_sold")
    private int goodsSold;

    @TableField("goods_status")
    private int goodsStatus;

    @TableField("add_time")
    private String addTime;

    @TableField("update_time")
    private String updateTime;

}
