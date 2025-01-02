package com.middle.ccs.order.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.middle.ccs.order.entity.po.QueueInfo;
import com.middle.ccs.order.dao.QueueInfoMapper;
import com.middle.ccs.order.service.QueueInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

import java.util.List;

import static com.github.pagehelper.page.PageMethod.startPage;

/**
 * (QueueInfo)表服务实现类
 *
 * @author makejava
 * @since 2025-01-01 12:44:45
 */
@Service("queueInfoService")
public class QueueInfoServiceImpl implements QueueInfoService {

    @Resource
    private QueueInfoMapper queueInfoMapper;


    /**
     * 修改数据
     *
     * @param entity 实例对象
     * @return 实例对象
     */
    @Override
    public int update(QueueInfo entity) {
        return this.queueInfoMapper.updateById(entity);
    }

    @Override
    public List<QueueInfo> queryQueueList() {
        QueueInfo queueInfo = new QueueInfo();
        QueryWrapper<QueueInfo> wrapper= new QueryWrapper<>(queueInfo);
        return queueInfoMapper.selectList(wrapper);
    }

}