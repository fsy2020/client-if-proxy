package com.nsynus.mq.mes.msg;

import com.nsynus.mq.dto.batchcancle.BatchCancelRequest;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.security.AnyTypePermission;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

import java.io.InputStream;

/**
 * 将xml转换成java对象的测试类
 */
@Slf4j
public class XmlToBeanTest {

    @Test
    public void batchCancelRequestTest() {
        XStream xStream = new XStream();
        xStream.processAnnotations(new Class[]{BatchCancelRequest.class});
        // 需开启权限
        xStream.addPermission(AnyTypePermission.ANY);
        InputStream inputStream = XmlToBeanTest.class.getResourceAsStream("/BatchCancelRequest.xml");
        BatchCancelRequest batchCancelRequest = (BatchCancelRequest) xStream.fromXML(inputStream);
        log.info("batchCancelRequestTest is \n {}", batchCancelRequest);
        Assert.isTrue(batchCancelRequest.getRvHeader().getSource().getApplication().equals("MES"), "batchCancelRequest getApplication is not equals BatchCancelRequest.xml ");

        String xmlString = xStream.toXML(batchCancelRequest);
        log.info("batchCancelRequestTest xmlString is \n {}", xmlString);

    }


}
