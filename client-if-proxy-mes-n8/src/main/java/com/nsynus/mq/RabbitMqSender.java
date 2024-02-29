package com.nsynus.mq;

import com.nsynus.config.MesConfig;
import com.nsynus.common.utils.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author N01010030
 */
@Component
@Slf4j
public class RabbitMqSender {
    @Autowired
    private RabbitTemplate amqpTemplate;

    @Resource
    private MesConfig mesConfig;


    /**
     * This method sends a message to a queue given a queue name and message
     * 此处为了模拟上位mes系统，不采取手动确认的方式
     */
    public void sendMessage(String queueName, String message) {
        log.info("sendMessage queueName {}:=====message is \n {}", queueName, message);
        if (StringUtils.isEmpty(queueName)) {
            queueName = mesConfig.getDefaultQueue();
            log.warn("sendMessage queueName is empty,use default queue {}", queueName);
        }
        amqpTemplate.convertAndSend(queueName, message);
        log.info("sendMessage success =====");
    }

    public void sendMessage(String message) {
        sendMessage(mesConfig.getDefaultQueue(), message);
    }
}
