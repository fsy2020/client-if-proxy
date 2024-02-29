package com.nsynus.web.service;


import com.nsynus.mq.RabbitMqSender;
import com.nsynus.mq.dto.batchcancle.BatchCancelRequest;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.InputStream;

/**
 * @author N01010030
 */
@Service
@Slf4j
public class MqService {

    @Resource
    private RabbitMqSender rabbitMqSender;

    public void sendMesMsgBatchCancelRequestByMq() {
        XStream xStream = new XStream();
        xStream.processAnnotations(new Class[]{BatchCancelRequest.class});
        // 需开启权限
        xStream.addPermission(AnyTypePermission.ANY);
        xStream.setClassLoader(MqService.class.getClassLoader());
        InputStream inputStream = MqService.class.getResourceAsStream("/BatchCancelRequest.xml");
        BatchCancelRequest batchCancelRequest = (BatchCancelRequest) xStream.fromXML(inputStream);
        log.info("batchCancelRequestTest batchCancelRequest is \n {}", batchCancelRequest);
        String xmlString = xStream.toXML(batchCancelRequest);
        log.info("batchCancelRequestTest xmlString is \n {}", xmlString);
        rabbitMqSender.sendMessage(null, xmlString);
    }

}
