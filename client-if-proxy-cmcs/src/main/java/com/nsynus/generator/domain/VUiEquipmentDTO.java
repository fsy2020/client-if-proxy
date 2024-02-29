package com.nsynus.generator.domain;


import com.nsynus.enums.PmMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class VUiEquipmentDTO {
    private String equipmentId;
    private String displayName;
    private String remoteEquipmentId;
    private String remoteDisplayName;
    private PmMode pmMode;
    private Long emptySize;
    private Long occupiedSize;
    private Long reservedSize;
    private Float utilization;

}
