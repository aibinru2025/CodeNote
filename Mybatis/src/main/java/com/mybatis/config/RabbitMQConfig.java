package com.mybatis.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @author aibinru:am19136754034@gmail.com
 * @date 24-3-4 17:08
 * @description:
 */
@Configuration
public class RabbitMQConfig {

    private static final String MARKET = "market";
    private static final String ORDER = "order";
    private static final String EXCHANGE = "market.exChanges";

    @Bean
    public Queue queue01(){
        return new Queue(MARKET);
    }

    @Bean
    public Queue queue02(){
        return new Queue(ORDER);
    }

    @Bean
    public DirectExchange fanoutExchange(){
        return new DirectExchange(EXCHANGE);
    }

    // 绑定交换机和队列
    @Bean
    public Binding binding01(){
        return BindingBuilder.bind(queue01()).to(fanoutExchange()).with("market");
    }

    @Bean
    public Binding binding02(){
        return BindingBuilder.bind(queue02()).to(fanoutExchange()).with("order");
    }

}

