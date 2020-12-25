package com.yibo.data.biz;

import com.yibo.data.dto.DataGroupListDTO;
import com.yibo.data.param.DataGroupAddParam;
import com.yibo.data.param.DataGroupQueryListParam;
import com.yibo.data.param.DataGroupUpdateParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 业务层: 数据巡检组
 *
 * @author 莫问
 * @date 2020/9/18
 */
@Slf4j
@Component
public class DataGroupBiz {

    /**
     * 新增巡检组
     *
     * @param param 添加数据巡检参数
     * @return true:成功 false:失败
     */
    public Boolean add(DataGroupAddParam param) {
        return null;
    }

    /**
     * 更新巡检组
     *
     * @param param 更新数据巡检参数
     * @return true:成功 false:失败
     */
    public Boolean update(DataGroupUpdateParam param) {
        return null;
    }

    /**
     * 查询巡检组列表
     *
     * @param param 查询巡检数据参数
     * @return 巡检组列表
     */
    public List<DataGroupListDTO> list(DataGroupQueryListParam param) {
        return null;
    }
}
