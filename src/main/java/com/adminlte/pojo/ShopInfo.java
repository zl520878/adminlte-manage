package com.adminlte.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;

import java.io.Serializable;

/**
 * Created by zhangliang2 on 2017/5/22.
 *
 */
@TableName("wx_mp_shop_info")
public class ShopInfo implements Serializable {

    @TableId(type = IdType.AUTO)
    private int id;

    @TableField("shop_name")
    private String shopName;

    @TableField("shop_logo_url")
    private String shopLogoUrl;

    @TableField("shop_desc")
    private String shopDesc;

    @TableField("shop_notice")
    private String shopNotice;

    @TableField("add_time")
    private String addTime;

    @TableField("update_time")
    private String updateTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopLogoUrl() {
        return shopLogoUrl;
    }

    public void setShopLogoUrl(String shopLogoUrl) {
        this.shopLogoUrl = shopLogoUrl;
    }

    public String getShopDesc() {
        return shopDesc;
    }

    public void setShopDesc(String shopDesc) {
        this.shopDesc = shopDesc;
    }

    public String getShopNotice() {
        return shopNotice;
    }

    public void setShopNotice(String shopNotice) {
        this.shopNotice = shopNotice;
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ShopInfo{" +
                "id=" + id +
                ", shopName='" + shopName + '\'' +
                ", shopLogoUrl='" + shopLogoUrl + '\'' +
                ", shopDesc='" + shopDesc + '\'' +
                ", shopNotice='" + shopNotice + '\'' +
                ", addTime='" + addTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                '}';
    }
}
