package com.yibo.data.biz;

import com.yibo.data.dto.ConnListDTO;
import com.yibo.data.param.ConnAddParam;
import com.yibo.data.param.ConnQueryListParam;
import com.yibo.data.param.ConnUpdateParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 业务层: 数据库连接配置
 *
 * @author 莫问
 * @date 2020/9/18
 */
@Slf4j
@Component
public class ConnBiz {

    /**
     * 新增数据库链接配置
     *
     * @param param 添加数据库链接配置参数
     * @return true:成功 false:失败
     */
    public Boolean add(ConnAddParam param) {
        return null;
    }

    /**
     * 更新数据库链接配置
     *
     * @param param 更新数据库链接配置参数
     * @return true:成功 false:失败
     */
    public Boolean update(ConnUpdateParam param) {
        return null;
    }

    /**
     * 查询数据库链接配置列表
     *
     * @param param 查询数据库链接配置参数
     * @return 数据库链接配置列表
     */
    public List<ConnListDTO> list(ConnQueryListParam param) {
        return null;
    }
}
