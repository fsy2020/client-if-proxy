package com.nsynus.generator.domain;

import cn.com.nsynus.cmcs.cluster.enums.PMMode;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import com.nsynus.enums.PmMode;
import lombok.Data;

/**
 * 
 * @TableName V_UI_EQUIPMENT
 */
@TableName(value ="V_UI_EQUIPMENT")
@Data
public class VUiEquipment implements Serializable {
    /**
     * 
     */
    @TableField(value = "EQUIPMENT_ID")
    private String equipmentId;

    /**
     * 
     */
    @TableField(value = "DISPLAY_NAME")
    private String displayName;

    /**
     * 
     */
    @TableField(value = "EQUIPMENT_TYPE")
    private Integer equipmentType;

    /**
     * 
     */
    @TableField(value = "SUB_EQUIPMENT_TYPE")
    private Integer subEquipmentType;


    /**
     * PmMode枚举类,
     */
    @TableField(value = "PM_MODE")
    private PmMode pmMode;



    /**
     * 
     */
    @TableField(value = "CONTROL_STATUS")
    private Integer controlStatus;

    /**
     * 
     */
    @TableField(value = "AMHS_STATUS")
    private Integer amhsStatus;

    /**
     * 
     */
    @TableField(value = "TARGET_AMHS_STATUS")
    private Integer targetAmhsStatus;

    /**
     * 
     */
    @TableField(value = "COMM_STATUS")
    private Integer commStatus;

    /**
     * 
     */
    @TableField(value = "SYNC_STATUS")
    private Integer syncStatus;

    /**
     * 
     */
    @TableField(value = "TOTAL_SIZE")
    private Long totalSize;

    /**
     * 
     */
    @TableField(value = "RESERVED_SIZE")
    private Long reservedSize;

    /**
     * 
     */
    @TableField(value = "OCCUPIED_SIZE")
    private Long occupiedSize;

    /**
     * 
     */
    @TableField(value = "EMPTY_SIZE")
    private Long emptySize;

    /**
     * 
     */
    @TableField(value = "UTILIZATION")
    private Float utilization;

    /**
     * 
     */
    @TableField(value = "ZONE_FULL_COUNT")
    private Long zoneFullCount;

    /**
     * 
     */
    @TableField(value = "PARTITION_FULL_COUNT")
    private Long partitionFullCount;

    /**
     * 
     */
    @TableField(value = "CRANE_OUT_OF_SERVICE_COUNT")
    private Long craneOutOfServiceCount;

    /**
     * 
     */
    @TableField(value = "PORT_OUT_OF_SERVICE_COUNT")
    private Long portOutOfServiceCount;

    /**
     * 
     */
    @TableField(value = "STATION_OUT_OF_SERVICE_COUNT")
    private Long stationOutOfServiceCount;

    /**
     * 
     */
    @TableField(value = "ALARM_UNIT_COUNT")
    private Long alarmUnitCount;

    /**
     * 
     */
    @TableField(value = "MICRO_COMMAND_COUNT")
    private Long microCommandCount;

    /**
     * 
     */
    @TableField(value = "PURGE_TYPE")
    private Integer purgeType;

    /**
     * 
     */
    @TableField(value = "SORTER_TYPE")
    private Integer sorterType;

    /**
     * 
     */
    @TableField(value = "CLEANER_BUFFER")
    private Integer cleanerBuffer;

    /**
     * 
     */
    @TableField(value = "EQ_BUFFER")
    private Integer eqBuffer;

    /**
     * 
     */
    @TableField(value = "EMPTY_CARRIER_SUPPLY_AREA")
    private String emptyCarrierSupplyArea;

    /**
     * 
     */
    @TableField(value = "ECS_AREA_LIST_AS_DEST")
    private String ecsAreaListAsDest;

    /**
     * 
     */
    @TableField(value = "TRANSIT_USE_ENABLED")
    private Integer transitUseEnabled;

    /**
     * 
     */
    @TableField(value = "PM_REASON")
    private String pmReason;

    /**
     * 
     */
    @TableField(value = "STBC_EQUIPMENT_ID")
    private String stbcEquipmentId;

    /**
     * 
     */
    @TableField(value = "PM_MODE_OPTION")
    private Integer pmModeOption;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        VUiEquipment other = (VUiEquipment) that;
        return (this.getEquipmentId() == null ? other.getEquipmentId() == null : this.getEquipmentId().equals(other.getEquipmentId()))
            && (this.getDisplayName() == null ? other.getDisplayName() == null : this.getDisplayName().equals(other.getDisplayName()))
            && (this.getEquipmentType() == null ? other.getEquipmentType() == null : this.getEquipmentType().equals(other.getEquipmentType()))
            && (this.getSubEquipmentType() == null ? other.getSubEquipmentType() == null : this.getSubEquipmentType().equals(other.getSubEquipmentType()))
            && (this.getPmMode() == null ? other.getPmMode() == null : this.getPmMode().equals(other.getPmMode()))
            && (this.getControlStatus() == null ? other.getControlStatus() == null : this.getControlStatus().equals(other.getControlStatus()))
            && (this.getAmhsStatus() == null ? other.getAmhsStatus() == null : this.getAmhsStatus().equals(other.getAmhsStatus()))
            && (this.getTargetAmhsStatus() == null ? other.getTargetAmhsStatus() == null : this.getTargetAmhsStatus().equals(other.getTargetAmhsStatus()))
            && (this.getCommStatus() == null ? other.getCommStatus() == null : this.getCommStatus().equals(other.getCommStatus()))
            && (this.getSyncStatus() == null ? other.getSyncStatus() == null : this.getSyncStatus().equals(other.getSyncStatus()))
            && (this.getTotalSize() == null ? other.getTotalSize() == null : this.getTotalSize().equals(other.getTotalSize()))
            && (this.getReservedSize() == null ? other.getReservedSize() == null : this.getReservedSize().equals(other.getReservedSize()))
            && (this.getOccupiedSize() == null ? other.getOccupiedSize() == null : this.getOccupiedSize().equals(other.getOccupiedSize()))
            && (this.getEmptySize() == null ? other.getEmptySize() == null : this.getEmptySize().equals(other.getEmptySize()))
            && (this.getUtilization() == null ? other.getUtilization() == null : this.getUtilization().equals(other.getUtilization()))
            && (this.getZoneFullCount() == null ? other.getZoneFullCount() == null : this.getZoneFullCount().equals(other.getZoneFullCount()))
            && (this.getPartitionFullCount() == null ? other.getPartitionFullCount() == null : this.getPartitionFullCount().equals(other.getPartitionFullCount()))
            && (this.getCraneOutOfServiceCount() == null ? other.getCraneOutOfServiceCount() == null : this.getCraneOutOfServiceCount().equals(other.getCraneOutOfServiceCount()))
            && (this.getPortOutOfServiceCount() == null ? other.getPortOutOfServiceCount() == null : this.getPortOutOfServiceCount().equals(other.getPortOutOfServiceCount()))
            && (this.getStationOutOfServiceCount() == null ? other.getStationOutOfServiceCount() == null : this.getStationOutOfServiceCount().equals(other.getStationOutOfServiceCount()))
            && (this.getAlarmUnitCount() == null ? other.getAlarmUnitCount() == null : this.getAlarmUnitCount().equals(other.getAlarmUnitCount()))
            && (this.getMicroCommandCount() == null ? other.getMicroCommandCount() == null : this.getMicroCommandCount().equals(other.getMicroCommandCount()))
            && (this.getPurgeType() == null ? other.getPurgeType() == null : this.getPurgeType().equals(other.getPurgeType()))
            && (this.getSorterType() == null ? other.getSorterType() == null : this.getSorterType().equals(other.getSorterType()))
            && (this.getCleanerBuffer() == null ? other.getCleanerBuffer() == null : this.getCleanerBuffer().equals(other.getCleanerBuffer()))
            && (this.getEqBuffer() == null ? other.getEqBuffer() == null : this.getEqBuffer().equals(other.getEqBuffer()))
            && (this.getEmptyCarrierSupplyArea() == null ? other.getEmptyCarrierSupplyArea() == null : this.getEmptyCarrierSupplyArea().equals(other.getEmptyCarrierSupplyArea()))
            && (this.getEcsAreaListAsDest() == null ? other.getEcsAreaListAsDest() == null : this.getEcsAreaListAsDest().equals(other.getEcsAreaListAsDest()))
            && (this.getTransitUseEnabled() == null ? other.getTransitUseEnabled() == null : this.getTransitUseEnabled().equals(other.getTransitUseEnabled()))
            && (this.getPmReason() == null ? other.getPmReason() == null : this.getPmReason().equals(other.getPmReason()))
            && (this.getStbcEquipmentId() == null ? other.getStbcEquipmentId() == null : this.getStbcEquipmentId().equals(other.getStbcEquipmentId()))
            && (this.getPmModeOption() == null ? other.getPmModeOption() == null : this.getPmModeOption().equals(other.getPmModeOption()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEquipmentId() == null) ? 0 : getEquipmentId().hashCode());
        result = prime * result + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        result = prime * result + ((getEquipmentType() == null) ? 0 : getEquipmentType().hashCode());
        result = prime * result + ((getSubEquipmentType() == null) ? 0 : getSubEquipmentType().hashCode());
        result = prime * result + ((getPmMode() == null) ? 0 : getPmMode().hashCode());
        result = prime * result + ((getControlStatus() == null) ? 0 : getControlStatus().hashCode());
        result = prime * result + ((getAmhsStatus() == null) ? 0 : getAmhsStatus().hashCode());
        result = prime * result + ((getTargetAmhsStatus() == null) ? 0 : getTargetAmhsStatus().hashCode());
        result = prime * result + ((getCommStatus() == null) ? 0 : getCommStatus().hashCode());
        result = prime * result + ((getSyncStatus() == null) ? 0 : getSyncStatus().hashCode());
        result = prime * result + ((getTotalSize() == null) ? 0 : getTotalSize().hashCode());
        result = prime * result + ((getReservedSize() == null) ? 0 : getReservedSize().hashCode());
        result = prime * result + ((getOccupiedSize() == null) ? 0 : getOccupiedSize().hashCode());
        result = prime * result + ((getEmptySize() == null) ? 0 : getEmptySize().hashCode());
        result = prime * result + ((getUtilization() == null) ? 0 : getUtilization().hashCode());
        result = prime * result + ((getZoneFullCount() == null) ? 0 : getZoneFullCount().hashCode());
        result = prime * result + ((getPartitionFullCount() == null) ? 0 : getPartitionFullCount().hashCode());
        result = prime * result + ((getCraneOutOfServiceCount() == null) ? 0 : getCraneOutOfServiceCount().hashCode());
        result = prime * result + ((getPortOutOfServiceCount() == null) ? 0 : getPortOutOfServiceCount().hashCode());
        result = prime * result + ((getStationOutOfServiceCount() == null) ? 0 : getStationOutOfServiceCount().hashCode());
        result = prime * result + ((getAlarmUnitCount() == null) ? 0 : getAlarmUnitCount().hashCode());
        result = prime * result + ((getMicroCommandCount() == null) ? 0 : getMicroCommandCount().hashCode());
        result = prime * result + ((getPurgeType() == null) ? 0 : getPurgeType().hashCode());
        result = prime * result + ((getSorterType() == null) ? 0 : getSorterType().hashCode());
        result = prime * result + ((getCleanerBuffer() == null) ? 0 : getCleanerBuffer().hashCode());
        result = prime * result + ((getEqBuffer() == null) ? 0 : getEqBuffer().hashCode());
        result = prime * result + ((getEmptyCarrierSupplyArea() == null) ? 0 : getEmptyCarrierSupplyArea().hashCode());
        result = prime * result + ((getEcsAreaListAsDest() == null) ? 0 : getEcsAreaListAsDest().hashCode());
        result = prime * result + ((getTransitUseEnabled() == null) ? 0 : getTransitUseEnabled().hashCode());
        result = prime * result + ((getPmReason() == null) ? 0 : getPmReason().hashCode());
        result = prime * result + ((getStbcEquipmentId() == null) ? 0 : getStbcEquipmentId().hashCode());
        result = prime * result + ((getPmModeOption() == null) ? 0 : getPmModeOption().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", equipmentId=").append(equipmentId);
        sb.append(", displayName=").append(displayName);
        sb.append(", equipmentType=").append(equipmentType);
        sb.append(", subEquipmentType=").append(subEquipmentType);
        sb.append(", pmMode=").append(pmMode);
        sb.append(", controlStatus=").append(controlStatus);
        sb.append(", amhsStatus=").append(amhsStatus);
        sb.append(", targetAmhsStatus=").append(targetAmhsStatus);
        sb.append(", commStatus=").append(commStatus);
        sb.append(", syncStatus=").append(syncStatus);
        sb.append(", totalSize=").append(totalSize);
        sb.append(", reservedSize=").append(reservedSize);
        sb.append(", occupiedSize=").append(occupiedSize);
        sb.append(", emptySize=").append(emptySize);
        sb.append(", utilization=").append(utilization);
        sb.append(", zoneFullCount=").append(zoneFullCount);
        sb.append(", partitionFullCount=").append(partitionFullCount);
        sb.append(", craneOutOfServiceCount=").append(craneOutOfServiceCount);
        sb.append(", portOutOfServiceCount=").append(portOutOfServiceCount);
        sb.append(", stationOutOfServiceCount=").append(stationOutOfServiceCount);
        sb.append(", alarmUnitCount=").append(alarmUnitCount);
        sb.append(", microCommandCount=").append(microCommandCount);
        sb.append(", purgeType=").append(purgeType);
        sb.append(", sorterType=").append(sorterType);
        sb.append(", cleanerBuffer=").append(cleanerBuffer);
        sb.append(", eqBuffer=").append(eqBuffer);
        sb.append(", emptyCarrierSupplyArea=").append(emptyCarrierSupplyArea);
        sb.append(", ecsAreaListAsDest=").append(ecsAreaListAsDest);
        sb.append(", transitUseEnabled=").append(transitUseEnabled);
        sb.append(", pmReason=").append(pmReason);
        sb.append(", stbcEquipmentId=").append(stbcEquipmentId);
        sb.append(", pmModeOption=").append(pmModeOption);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}