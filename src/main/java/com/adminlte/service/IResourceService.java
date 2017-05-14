package com.adminlte.service;

import com.adminlte.pojo.Resource;
import com.adminlte.shiro.ShiroUser;
import com.baomidou.mybatisplus.service.IService;

public interface IResourceService extends IService<Resource>{

	Object selectTree(ShiroUser shiroUser);

}
