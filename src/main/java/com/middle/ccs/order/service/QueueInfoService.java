package com.middle.ccs.order.service;

import com.middle.ccs.order.entity.po.OrderInfo;
import com.middle.ccs.order.entity.po.QueueInfo;
import org.springframework.validation.annotation.Validated;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * (QueueInfo)表服务接口
 *
 * @author makejava
 * @since 2025-01-01 12:44:45
 */
@Validated
public interface QueueInfoService {


    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 成功为1，失败为0
     */
    int update(@NotNull QueueInfo entity);

    /**
     * 查询队列信息列表
     * @return 出参
     */
    List<QueueInfo> queryQueueList();
}