package com.adminlte.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.adminlte.mapper.UserMapper;
import com.adminlte.mapper.UserRoleMapper;
import com.adminlte.pojo.User;
import com.adminlte.pojo.vo.UserVo;
import com.adminlte.result.DatatablesResult;
import com.adminlte.service.IUserService;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.baomidou.mybatisplus.toolkit.StringUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private UserRoleMapper userRoleMapper;

	@Override
	public List<User> selectByLoginName(UserVo userVo) {
		User user = new User();
		user.setLoginName(userVo.getLoginName());
		EntityWrapper<User> wrapper = new EntityWrapper<User>(user);
		if (null != userVo.getId()) {
			wrapper.where("id != {0}", userVo.getId());
		}
		List<User> selectList = userMapper.selectList(wrapper);
		return selectList;
	}
	
	@Override
	public DatatablesResult<UserVo> selectUserVo(UserVo userVo, Integer page, Integer rows, Integer draw) {
		PageHelper.startPage(page, rows);
		List<UserVo> userVos = this.userMapper.selectUserVo();
		PageInfo<UserVo> pageInfo = new PageInfo<UserVo>(userVos);
		DatatablesResult pageResult = new DatatablesResult<UserVo>();
		pageResult.setData(userVos);
		pageResult.setDraw(draw);
		pageResult.setRecordsTotal((int)pageInfo.getTotal());
		pageResult.setRecordsFiltered(pageResult.getRecordsTotal());
		return pageResult;
	}

	@Override
	public Boolean deleteUserById(String id) {
		User user = new User();
		user.setId(Long.valueOf(id));
		return deleteById(user);
	}

}
