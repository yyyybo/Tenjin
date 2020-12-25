package com.yibo.data.service;

import com.yibo.data.entity.ConnEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 数据层: 数据库连接配置
 *
 * @author 莫问
 * @date 2020/12/24
 */
public interface CnnService extends CrudRepository<ConnEntity, Integer> {
}
