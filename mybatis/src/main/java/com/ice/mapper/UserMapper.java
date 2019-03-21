package com.ice.mapper;

import com.ice.entity.User;

import java.util.List;

/**
 * @author ice
 * @date 19-3-21
 */
public interface UserMapper {

    /**
     * 插入数据
     * @param users 用户列表
     */
    void insert(User users);
}
