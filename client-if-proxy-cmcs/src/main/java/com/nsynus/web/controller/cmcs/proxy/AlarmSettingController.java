package com.nsynus.web.controller.cmcs.proxy;


import com.baomidou.dynamic.datasource.annotation.DS;
import com.nsynus.common.annotation.Anonymous;
import com.nsynus.common.core.controller.BaseController;
import com.nsynus.common.core.domain.AjaxResult;
import com.nsynus.common.core.page.TableDataInfo;
import com.nsynus.generator.domain.AlarmSetting;
import com.nsynus.generator.service.AlarmSettingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author N01010030
 */
@Anonymous
@RestController
@RequestMapping("/alarmSetting")
@DS("oracle")
public class AlarmSettingController extends BaseController {

    @Resource
    private AlarmSettingService alarmSettingService;

    /**
     * list查询，无分页
     * @return
     */
    @GetMapping("/list")
    public AjaxResult list() {
        List<AlarmSetting> alarmSetting =alarmSettingService.list();
        // 可以直接返回，让大家看的更明白一点
        AjaxResult ajax = AjaxResult.success(alarmSetting);
        return ajax;
    }

    /**
     * 分页查询
     *
     * @return
     */
    @PostMapping ("/listByPage")
    public TableDataInfo listByPage() {
        startPage();  // 此方法配合前端完成自动分页
        List<AlarmSetting> alarmSetting =alarmSettingService.list();
        return getDataTable(alarmSetting);
    }


}
