package com.yibo.data.service;

import com.yibo.data.entity.GroupEntity;
import org.springframework.data.repository.CrudRepository;

/**
 * 数据层: 巡检组
 *
 * @author 莫问
 * @date 2020/12/24
 */
public interface GroupService extends CrudRepository<GroupEntity, Integer> {
}
