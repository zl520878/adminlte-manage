package com.adminlte.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.adminlte.pojo.User;
import com.adminlte.pojo.vo.UserVo;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

public interface UserMapper extends BaseMapper<User> {

	User selectUserVoById(@Param("id") Long id);

	List<UserVo> selectUserVo();
}
