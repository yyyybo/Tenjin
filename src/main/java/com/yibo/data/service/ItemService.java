package com.yibo.data.service;

import com.yibo.data.entity.ItemEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 数据层: 检查项配置
 *
 * @author 莫问
 * @date 2020/12/24
 */
public interface ItemService extends CrudRepository<ItemEntity, Integer> {
}
