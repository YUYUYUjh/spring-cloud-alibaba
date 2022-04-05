package com.yy.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yy.common.utils.PageUtils;
import com.yy.mall.order.entity.OrderEntity;

import java.util.List;
import java.util.Map;

public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<OrderEntity>  listByUserId(Integer userId);
}

