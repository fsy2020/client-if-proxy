package com.nsynus.generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nsynus.generator.domain.VUiEquipment;
import com.nsynus.generator.domain.VUiEquipmentMap;
import com.nsynus.generator.service.VUiEquipmentService;
import com.nsynus.generator.mapper.VUiEquipmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author N01010031
* @description 针对表【V_UI_EQUIPMENT】的数据库操作Service实现
* @createDate 2024-02-22 16:53:38
*/
@Service
public class VUiEquipmentServiceImpl extends ServiceImpl<VUiEquipmentMapper, VUiEquipment>
    implements VUiEquipmentService{
    @Autowired
    VUiEquipmentMapper vUiEquipmentMapper;
    @Override
    public List<VUiEquipmentMap> selectRemoteEquipmentMap() {
        return vUiEquipmentMapper.selectRemoteEquipmentMap();
    }
}




