package com.yy.mall.user.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yy.common.utils.PageUtils;
import com.yy.mall.user.entity.UserEntity;

import java.util.Map;

/**
 * 
 *
 * @author Yu#
 * @date 2021-01-28 15:53:24
 */
public interface UserService extends IService<UserEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

