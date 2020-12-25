package com.yibo.data.controller;

import com.yibo.data.api.ApiResult;
import com.yibo.data.biz.DataGroupBiz;
import com.yibo.data.dto.DataGroupListDTO;
import com.yibo.data.param.DataGroupAddParam;
import com.yibo.data.param.DataGroupQueryListParam;
import com.yibo.data.param.DataGroupUpdateParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Web层: 数据巡检组
 *
 * @author 莫问
 * @date 2020-11-18
 */
@RestController
@RequestMapping(value = "/data/group")
public class DataGroupController {

    /**
     * 业务层: 巡检组
     */
    @Resource
    private DataGroupBiz dataGroupBiz;

    /**
     * 新增巡检组
     *
     * @param param 添加数据巡检参数
     * @return true:成功 false:失败
     */
    @PostMapping(value = "/add")
    public ApiResult<Boolean> add(DataGroupAddParam param) {
        return ApiResult.success(dataGroupBiz.add(param));
    }

    /**
     * 更新巡检组
     *
     * @param param 更新数据巡检参数
     * @return true:成功 false:失败
     */
    @PostMapping(value = "/update")
    public ApiResult<Boolean> update(DataGroupUpdateParam param) {
        return ApiResult.success(dataGroupBiz.update(param));
    }

    /**
     * 查询巡检组列表
     *
     * @param param 查询巡检数据参数
     * @return 巡检组列表
     */
    @PostMapping(value = "/list")
    public ApiResult<List<DataGroupListDTO>> list(DataGroupQueryListParam param) {
        return ApiResult.success(dataGroupBiz.list(param));
    }
}
