package com.fcx.dao;

import com.fcx.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: fancaixing
 * @Date: 2019/7/21 13:59
 * @Version 1.0
 */
@Mapper
public interface UserMapper {
    /**
     * 根据用户名查询用户结果集
     *
     * @param id
     * @return 查询结果
     */
    @Select("SELECT * FROM user WHERE id = #{id}")
    List<User> findById(@Param("id") int id);

    /**
     * 保存用户信息
     *
     * @param user 用户信息
     * @return 成功 1 失败 0
     */
    int insert(User user);
}
