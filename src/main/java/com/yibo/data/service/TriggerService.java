package com.yibo.data.service;

import com.yibo.data.entity.TriggerEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 数据层: 触发器配置
 *
 * @author 莫问
 * @date 2020/12/24
 */
public interface TriggerService extends CrudRepository<TriggerEntity, Integer> {
}
