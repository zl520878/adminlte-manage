package com.adminlte.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.adminlte.pojo.Role;
import com.adminlte.pojo.UserRole;
import com.baomidou.mybatisplus.mapper.BaseMapper;

public interface UserRoleMapper extends BaseMapper<UserRole> {
	
	 List<Long> selectRoleIdListByUserId(@Param("userId") Long userId);
}
