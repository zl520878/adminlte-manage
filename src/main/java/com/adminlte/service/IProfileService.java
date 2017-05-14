package com.adminlte.service;

import com.adminlte.pojo.Profile;
import com.baomidou.mybatisplus.service.IService;

public interface IProfileService extends IService<Profile>{

	void updateImgById(Long userId, String picUrl);

}
