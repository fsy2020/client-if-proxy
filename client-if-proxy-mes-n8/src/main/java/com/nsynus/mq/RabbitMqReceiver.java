package com.nsynus.mq;

import com.rabbitmq.client.Channel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.amqp.support.AmqpHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@Slf4j
public class RabbitMqReceiver {

    /**
     * https://docs.spring.io/spring-boot/docs/current/reference/html/messaging.html#messaging.amqp
     * 也可以自己指定mq的连接工厂，覆盖默认属性，包括消息格式转换等
     */
    @RabbitListener(queues = "test",ackMode = "MANUAL",concurrency ="4")
    public void processMessage(String data, @Header(AmqpHeaders.DELIVERY_TAG) long deliveryTag, Channel channel) throws IOException, InterruptedException {
        log.info("processMessage content is \n {}", data);
        // todo mcs这边的正常处理走 success 逻辑
        channel.basicAck(deliveryTag, false);
       /* if (data.contains("success")) {
            // RabbitMQ的ack机制中，第二个参数返回true，表示需要将这条消息投递给其他的消费者重新消费
            channel.basicAck(deliveryTag, false);
        } else {
            // 第三个参数true，表示这个消息会重新进入队列
            Thread.sleep(10000);
            channel.basicNack(deliveryTag, false, true);
        }*/

    }
}
