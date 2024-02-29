package com.nsynus.generator.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nsynus.generator.domain.AlarmGroup;
import com.nsynus.generator.service.AlarmGroupService;
import com.nsynus.generator.mapper.AlarmGroupMapper;
import org.springframework.stereotype.Service;

/**
* @author N01010030
* @description 针对表【ALARM_GROUP】的数据库操作Service实现
* @createDate 2024-01-30 18:11:05
*/
@Service
public class AlarmGroupServiceImpl extends ServiceImpl<AlarmGroupMapper, AlarmGroup>
    implements AlarmGroupService{

}




