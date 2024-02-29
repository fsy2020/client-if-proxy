package com.nsynus.generator.service;

import com.nsynus.generator.domain.VUiEquipment;
import com.baomidou.mybatisplus.extension.service.IService;
import com.nsynus.generator.domain.VUiEquipmentMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author N01010031
* @description 针对表【V_UI_EQUIPMENT】的数据库操作Service
* @createDate 2024-02-22 16:53:38
*/
public interface VUiEquipmentService extends IService<VUiEquipment> {
    public List<VUiEquipmentMap> selectRemoteEquipmentMap();

}
