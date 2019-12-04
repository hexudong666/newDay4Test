package com.hexudong.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hexudong.entity.User;

public interface UserMapper {

	@Select("select * from ddd")
	List<User> getList();

}
