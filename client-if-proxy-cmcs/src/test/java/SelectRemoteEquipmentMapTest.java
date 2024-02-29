import com.nsynus.generator.domain.VUiEquipment;
import com.nsynus.generator.mapper.VUiEquipmentMapper;
import org.apache.ibatis.session.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Connection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SelectRemoteEquipmentMapTest {
    @Autowired
    private VUiEquipmentMapper vUiEquipmentMapper;

    @Test
    public void testSelectRemoteEquipmentMap() {

//
//        // 创建查询参数
//        Map<String, Object> map = new HashMap<>();
//        // 调用Mapper方法
//        List<VUiEquipment> resultList = vUiEquipmentMapper.selectRemoteEquipmentMap(map);
//
//        // 打印结果
//        for (VUiEquipment equipment : resultList) {
//            System.out.println("Equipment ID: " + equipment.getEquipmentId());
////            System.out.println("Remote Equipment ID: " + equipment.getRemoteEquipmentId());
//        }

        // 在这里可以添加断言来验证结果是否符合预期
    }

}
