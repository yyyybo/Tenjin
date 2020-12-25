package com.yibo.data.controller;

import com.yibo.data.api.ApiResult;
import com.yibo.data.biz.ConnBiz;
import com.yibo.data.dto.ConnListDTO;
import com.yibo.data.param.ConnAddParam;
import com.yibo.data.param.ConnQueryListParam;
import com.yibo.data.param.ConnUpdateParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Web层: 数据库链接配置
 *
 * @author 莫问
 * @date 2020-11-18
 */
@RestController
@RequestMapping(value = "/data/conn")
public class ConnController {

    /**
     * 业务层: 数据库链接配置
     */
    @Resource
    private ConnBiz connBiz;

    /**
     * 新增数据库链接配置
     *
     * @param param 添加数据库链接配置参数
     * @return true:成功 false:失败
     */
    @PostMapping(value = "/add")
    public ApiResult<Boolean> add(ConnAddParam param) {
        return ApiResult.success(connBiz.add(param));
    }

    /**
     * 更新数据库链接配置
     *
     * @param param 更新数据库链接配置参数
     * @return true:成功 false:失败
     */
    @PostMapping(value = "/update")
    public ApiResult<Boolean> update(ConnUpdateParam param) {
        return ApiResult.success(connBiz.update(param));
    }

    /**
     * 查询数据库链接配置列表
     *
     * @param param 查询数据库链接配置参数
     * @return 数据库链接配置列表
     */
    @PostMapping(value = "/list")
    public ApiResult<List<ConnListDTO>> list(ConnQueryListParam param) {
        return ApiResult.success(connBiz.list(param));
    }
}
