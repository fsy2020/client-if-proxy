package com.nsynus.mq.mes.msg;

import com.nsynus.mq.dto.batchcancle.BatchCancelRequest;
import com.nsynus.mq.dto.batchcancle.BatchCancelRequestRvHeader;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

@Slf4j
public class BeanToXmlTest {

    @Test
    public void batchCancelRequestTest() {
        XStream xStream = new XStream();
        // 对类开启注解
        xStream.autodetectAnnotations(true);

        BatchCancelRequest batchCancelRequest = new BatchCancelRequest();
        BatchCancelRequestRvHeader batchCancelRequestRvHeader = new BatchCancelRequestRvHeader();
        batchCancelRequest.setRvHeader(batchCancelRequestRvHeader);
        
        String xmlString = xStream.toXML(batchCancelRequest);
        log.info("batchCancelRequestTest is \n {}", xmlString);
        Assert.isTrue(xmlString.contains("msg"), "xmlString is not contains msg tag!");

    }


}
