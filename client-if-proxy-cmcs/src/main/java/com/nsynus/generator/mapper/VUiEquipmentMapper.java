package com.nsynus.generator.mapper;

import com.nsynus.generator.domain.VUiEquipment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nsynus.generator.domain.VUiEquipmentMap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
* @author N01010031
* @description 针对表【V_UI_EQUIPMENT】的数据库操作Mapper
* @createDate 2024-02-22 16:53:38
* @Entity com.nsynus.generator.domain.VUiEquipment
*/
public interface VUiEquipmentMapper extends BaseMapper<VUiEquipment> {
    public List<VUiEquipmentMap> selectRemoteEquipmentMap();
}




