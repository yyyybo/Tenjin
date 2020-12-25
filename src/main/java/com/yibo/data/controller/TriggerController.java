package com.yibo.data.controller;

import com.yibo.data.api.ApiResult;
import com.yibo.data.biz.TriggerBiz;
import com.yibo.data.dto.TriggerListDTO;
import com.yibo.data.param.TriggerAddParam;
import com.yibo.data.param.TriggerQueryListParam;
import com.yibo.data.param.TriggerUpdateParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Web层: 触发器配置
 *
 * @author 莫问
 * @date 2020-11-18
 */
@RestController
@RequestMapping(value = "/data/trigger")
public class TriggerController {

    /**
     * 业务层: 触发器配置
     */
    @Resource
    private TriggerBiz triggerBiz;

    /**
     * 新增触发器配置
     *
     * @param param 新增触发器配置参数
     * @return true:配置成功 false: 配置失败
     */
    @PostMapping(value = "add")
    public ApiResult<Boolean> add(TriggerAddParam param) {
        return ApiResult.success(triggerBiz.add(param));
    }

    /**
     * 更新触发器配置
     *
     * @param param 更新触发器配置参数
     * @return true:配置成功 false: 配置失败
     */
    @PostMapping(value = "update")
    public ApiResult<Boolean> update(TriggerUpdateParam param) {
        return ApiResult.success(triggerBiz.update(param));
    }

    /**
     * 查询触发器配置列表
     *
     * @param param 查询触发器配置参数
     * @return 触发器配置列表
     */
    @PostMapping(value = "/list")
    public ApiResult<List<TriggerListDTO>> list(TriggerQueryListParam param) {
        return ApiResult.success(triggerBiz.list(param));
    }
}
