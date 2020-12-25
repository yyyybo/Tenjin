package com.yibo.data.controller;

import com.yibo.data.api.ApiResult;
import com.yibo.data.biz.ItemBiz;
import com.yibo.data.dto.ItemListDTO;
import com.yibo.data.param.ItemAddParam;
import com.yibo.data.param.ItemQueryListParam;
import com.yibo.data.param.ItemUpdateParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Web层: 检查项配置
 *
 * @author 莫问
 * @date 2020-11-18
 */
@RestController
@RequestMapping(value = "/data/item")
public class ItemController {

    /**
     * 业务层: 检查项配置
     */
    @Resource
    private ItemBiz itemBiz;

    /**
     * 新增检查项配置
     *
     * @param param 新增检查项配置参数
     * @return true:配置成功 false: 配置失败
     */
    @PostMapping(value = "add")
    public ApiResult<Boolean> add(ItemAddParam param) {
        return ApiResult.success(itemBiz.add(param));
    }

    /**
     * 更新检查项配置
     *
     * @param param 更新检查项配置参数
     * @return true:配置成功 false: 配置失败
     */
    @PostMapping(value = "update")
    public ApiResult<Boolean> update(ItemUpdateParam param) {
        return ApiResult.success(itemBiz.update(param));
    }

    /**
     * 查询检查项配置列表
     *
     * @param param 查询检查项配置参数
     * @return 检查项配置列表
     */
    @PostMapping(value = "/list")
    public ApiResult<List<ItemListDTO>> list(ItemQueryListParam param) {
        return ApiResult.success(itemBiz.list(param));
    }
}
