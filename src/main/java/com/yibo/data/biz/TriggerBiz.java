package com.yibo.data.biz;

import com.yibo.data.dto.TriggerListDTO;
import com.yibo.data.param.TriggerAddParam;
import com.yibo.data.param.TriggerQueryListParam;
import com.yibo.data.param.TriggerUpdateParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 业务层: 触发器配置
 *
 * @author 莫问
 * @date 2020/9/18
 */
@Slf4j
@Component
public class TriggerBiz {

    /**
     * 新增触发器配置
     *
     * @param param 新增触发器配置参数
     * @return true:配置成功 false: 配置失败
     */
    public Boolean add(TriggerAddParam param) {
        return null;
    }

    /**
     * 更新触发器配置
     *
     * @param param 更新触发器配置参数
     * @return true:配置成功 false: 配置失败
     */
    public Boolean update(TriggerUpdateParam param) {
        return null;
    }

    /**
     * 查询触发器配置列表
     *
     * @param param 查询触发器配置参数
     * @return 触发器配置列表
     */
    public List<TriggerListDTO> list(TriggerQueryListParam param) {
        return null;
    }
}
