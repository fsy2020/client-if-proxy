package com.nsynus.web.controller;


import com.nsynus.common.annotation.Anonymous;
import com.nsynus.web.service.MqService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Anonymous
@RestController
@RequestMapping("/mqController")
@Slf4j
public class MqController {

    @Resource
    private MqService mqService;

    @GetMapping("/sendBatchCancelRequest")
    public void sendBatchCancelRequest() {
        log.info("sendBatchCancelRequest  start");
        mqService.sendMesMsgBatchCancelRequestByMq();
    }

/*    public void sendBatchCancelRequest(@RequestParam(defaultValue = "test") String queueName,
                                       @RequestParam(defaultValue = "wss")String message){

        log.info("batchCancelRequestTest xmlString is \n {}", xmlString);
        mqService.sendMesMsgBatchCancelRequestByMq();
    }*/


}
