package com.mybatis.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mybatis.dao.OrderItemDao;
import com.mybatis.entity.OrderItemEntity;
import com.mybatis.service.OrderItemService;
import com.mybatis.utils.PageUtils;
import com.mybatis.utils.Query;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("orderItemService")
public class OrderItemServiceImpl extends ServiceImpl<OrderItemDao, OrderItemEntity> implements OrderItemService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<OrderItemEntity> page = this.page(
                new Query<OrderItemEntity>().getPage(params),
                new QueryWrapper<OrderItemEntity>()
        );

        return new PageUtils(page);
    }


//    /**
//     * queues：声明需要监听的队列
//     * channel：当前传输数据的通道
//     */
//    //@RabbitListener(queues = {"hello-java-queue"})
//    public void revieveMessage(Message message,
//                               OrderReturnReasonEntity content) {
//        //拿到主体内容
//        byte[] body = message.getBody();
//        //拿到的消息头属性信息
//        MessageProperties messageProperties = message.getMessageProperties();
//        System.out.println("接受到的消息...内容" + message + "===内容：" + content);
//
//    }

}