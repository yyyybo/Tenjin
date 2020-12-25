package com.yibo.data.biz;

import com.yibo.data.dto.ItemListDTO;
import com.yibo.data.param.ItemAddParam;
import com.yibo.data.param.ItemQueryListParam;
import com.yibo.data.param.ItemUpdateParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 业务层: 检查项配置
 *
 * @author 莫问
 * @date 2020/9/18
 */
@Slf4j
@Component
public class ItemBiz {

    /**
     * 新增检查项配置
     *
     * @param param 新增检查项配置参数
     * @return true:配置成功 false: 配置失败
     */
    public Boolean add(ItemAddParam param) {
        return null;
    }

    /**
     * 更新检查项配置
     *
     * @param param 更新检查项配置参数
     * @return true:配置成功 false: 配置失败
     */
    public Boolean update(ItemUpdateParam param) {
        return null;
    }

    /**
     * 查询检查项配置列表
     *
     * @param param 查询检查项配置参数
     * @return 检查项配置列表
     */
    public List<ItemListDTO> list(ItemQueryListParam param) {
        return null;
    }
}
