package com.nsynus.web.controller.cmcs.proxy;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import com.nsynus.common.annotation.Anonymous;
import com.nsynus.common.core.domain.AjaxResult;
import com.nsynus.generator.domain.AlarmGroup;
import com.nsynus.generator.domain.AlarmSetting;
import com.nsynus.generator.mapper.AlarmGroupMapper;
import com.nsynus.generator.service.AlarmGroupService;
import com.nsynus.generator.service.AlarmSettingService;
import com.nsynus.generator.service.MpTestService;
import com.nsynus.jmx.config.XmcsJmxConfig;
import jp.co.daifuku.xmcs.client.exception.MCSRemoteMethodException;
import jp.co.daifuku.xmcs.client.remote.ClientInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.rmi.RemoteException;


@Anonymous
@RestController
@RequestMapping("/cmcs")
public class CmcsConfigController {


    @Resource
    private XmcsJmxConfig xmcsJmxConfig;

    /**
     * 注意这里引用的xmcs的api，因为测试环境暂时只是部署了
     */
    @Resource
    private ClientInterface clientInterface;

    @Resource
    private MpTestService mpTestService;

    @Resource
    private AlarmGroupService alarmGroupService;

    @Resource
    private AlarmGroupMapper alarmGroupMapper;

    @Resource
    private AlarmSettingService alarmSettingService;


    @GetMapping("/xmcsJmxConfig")
    public AjaxResult getCode() {
        AjaxResult ajax = AjaxResult.success(xmcsJmxConfig);
        return ajax;
    }

    @GetMapping("/xmcsClientInterface")
    public AjaxResult xmcsClientInterface() throws RemoteException, MCSRemoteMethodException {
        AjaxResult ajax = AjaxResult.success(clientInterface.getJDBCProperties().toString());
        return ajax;
    }

    @GetMapping("/mpTest")
    public AjaxResult mpTest() {
        AjaxResult ajax = AjaxResult.success(mpTestService.getById(1));
        return ajax;
    }

    @GetMapping("/AlarmGroup")
    @DS("oracle")
    public AjaxResult AlarmGroup() {
        System.err.println(DynamicDataSourceContextHolder.peek());
        AlarmGroup alarmGroup = alarmGroupService.getById(11);
        AlarmGroup alarmGroup1 = alarmGroupMapper.selectById("11");
        AlarmSetting alarmSetting =alarmSettingService.getById(1);
        AjaxResult ajax = AjaxResult.success(alarmSetting);
        return ajax;
    }

}
