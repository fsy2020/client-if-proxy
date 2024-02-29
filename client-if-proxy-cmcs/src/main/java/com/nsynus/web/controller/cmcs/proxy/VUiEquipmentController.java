package com.nsynus.web.controller.cmcs.proxy;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.github.pagehelper.PageHelper;
import com.nsynus.common.annotation.Anonymous;
import com.nsynus.common.core.controller.BaseController;
import com.nsynus.common.core.domain.AjaxResult;
import com.nsynus.common.core.page.TableDataInfo;
import com.nsynus.common.utils.bean.BeanUtils;
import com.nsynus.enums.PmMode;
import com.nsynus.generator.domain.VUiEquipment;
import com.nsynus.generator.domain.VUiEquipmentDTO;
import com.nsynus.generator.domain.VUiEquipmentMap;
import com.nsynus.generator.service.VUiEquipmentService;
import com.nsynus.utils.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


@Anonymous
@RestController
@RequestMapping("/vUiEquipment")
@DS("oracle")
public class VUiEquipmentController extends BaseController {
    @Autowired
    RedisUtils redisUtils;

    @Autowired
    private VUiEquipmentService vUiEquipmentService;


    @GetMapping("/list")
    public TableDataInfo list(){
        startPage();
        List<VUiEquipment> list = vUiEquipmentService.list();
        List<VUiEquipmentDTO> listDTO = new ArrayList<>();

        HashSet<String> hashSet= new HashSet<>();
        for(int i = 0; i<list.size(); i++){
            hashSet.add(list.get(i).getEquipmentId());
        }

        List<VUiEquipmentMap> vUiEquipmentMaps =redisUtils.getCacheObject("vUiEquipmentMaps");

        for(VUiEquipment vUiEquipment:list){

            VUiEquipmentDTO vUiEquipmentDTO = new VUiEquipmentDTO();
            BeanUtils.copyBeanProp(vUiEquipmentDTO , vUiEquipment);
            for (VUiEquipmentMap map : vUiEquipmentMaps) {

                if(map == null){
                    continue;
                }
                if(hashSet.contains(map.getEID())){
                    vUiEquipmentDTO.setRemoteEquipmentId(map.getReID());
                    System.out.println("正在填充");
                }

            }
            listDTO.add(vUiEquipmentDTO);

        }

        TableDataInfo tableDataInfo = getDataTable(list);
        tableDataInfo.setRows(listDTO);

        return tableDataInfo;//将得到的list封装成PageInfo的对象
    }

    @PostMapping("/save")
    public AjaxResult save(@RequestBody VUiEquipment vUiEquipment){
        AjaxResult ajax = AjaxResult.success(vUiEquipmentService.save(vUiEquipment));
        return ajax;
    }

    @PostMapping("/remove")
    public AjaxResult remove(@RequestBody VUiEquipment vUiEquipment){
        AjaxResult ajax = AjaxResult.success(vUiEquipmentService.save(vUiEquipment));
        return ajax;
    }

    @PostMapping("/update")
    public AjaxResult update(@RequestBody VUiEquipment vUiEquipment){
        AjaxResult ajax = AjaxResult.success(vUiEquipmentService.save(vUiEquipment));
        return ajax;
    }


    @GetMapping("/test")
    public void test(){
        List<VUiEquipmentMap> vUiEquipmentMaps = vUiEquipmentService.selectRemoteEquipmentMap();
        redisUtils.setCacheObject("vUiEquipmentMaps" , vUiEquipmentMaps);
        System.out.println("已存入Redis");
    }


}
