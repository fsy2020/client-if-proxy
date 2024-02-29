package com.nsynus.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * 
 * @TableName ALARM_SETTING
 */
@TableName(value ="ALARM_SETTING")
@Data
public class AlarmSetting implements Serializable {
    /**
     * 
     */
    @TableId(value = "ALARM_ID")
    private Long alarmId;

    /**
     * 
     */
    @TableField(value = "CONTROLLER_SPEC")
    private String controllerSpec;

    /**
     * 
     */
    @TableField(value = "ALARM_CODE")
    private Integer alarmCode;

    /**
     * 
     */
    @TableField(value = "ALARM_TEXT")
    private String alarmText;

    /**
     * 
     */
    @TableField(value = "HOST_SEND_FLAG")
    private Integer hostSendFlag;

    /**
     * 
     */
    @TableField(value = "STATISTICS_FLAG")
    private Integer statisticsFlag;

    /**
     * 
     */
    @TableField(value = "DOWN_FLAG")
    private Integer downFlag;

    /**
     * 
     */
    @TableField(value = "SEVERITY")
    private Integer severity;

    /**
     * 
     */
    @TableField(value = "ALARMCD")
    private String alarmcd;

    /**
     * 
     */
    @TableField(value = "ALARM_GROUP")
    private String alarmGroup;

    /**
     * 
     */
    @TableField(value = "MESSAGE_J")
    private String messageJ;

    /**
     * 
     */
    @TableField(value = "MESSAGE_E")
    private String messageE;

    /**
     * 
     */
    @TableField(value = "HOST_SENT_TIME")
    private Timestamp hostSentTime;

    /**
     * 
     */
    @TableField(value = "HYPERLINK")
    private String hyperlink;

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
        AlarmSetting other = (AlarmSetting) that;
        return (this.getAlarmId() == null ? other.getAlarmId() == null : this.getAlarmId().equals(other.getAlarmId()))
            && (this.getControllerSpec() == null ? other.getControllerSpec() == null : this.getControllerSpec().equals(other.getControllerSpec()))
            && (this.getAlarmCode() == null ? other.getAlarmCode() == null : this.getAlarmCode().equals(other.getAlarmCode()))
            && (this.getAlarmText() == null ? other.getAlarmText() == null : this.getAlarmText().equals(other.getAlarmText()))
            && (this.getHostSendFlag() == null ? other.getHostSendFlag() == null : this.getHostSendFlag().equals(other.getHostSendFlag()))
            && (this.getStatisticsFlag() == null ? other.getStatisticsFlag() == null : this.getStatisticsFlag().equals(other.getStatisticsFlag()))
            && (this.getDownFlag() == null ? other.getDownFlag() == null : this.getDownFlag().equals(other.getDownFlag()))
            && (this.getSeverity() == null ? other.getSeverity() == null : this.getSeverity().equals(other.getSeverity()))
            && (this.getAlarmcd() == null ? other.getAlarmcd() == null : this.getAlarmcd().equals(other.getAlarmcd()))
            && (this.getAlarmGroup() == null ? other.getAlarmGroup() == null : this.getAlarmGroup().equals(other.getAlarmGroup()))
            && (this.getMessageJ() == null ? other.getMessageJ() == null : this.getMessageJ().equals(other.getMessageJ()))
            && (this.getMessageE() == null ? other.getMessageE() == null : this.getMessageE().equals(other.getMessageE()))
            && (this.getHostSentTime() == null ? other.getHostSentTime() == null : this.getHostSentTime().equals(other.getHostSentTime()))
            && (this.getHyperlink() == null ? other.getHyperlink() == null : this.getHyperlink().equals(other.getHyperlink()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAlarmId() == null) ? 0 : getAlarmId().hashCode());
        result = prime * result + ((getControllerSpec() == null) ? 0 : getControllerSpec().hashCode());
        result = prime * result + ((getAlarmCode() == null) ? 0 : getAlarmCode().hashCode());
        result = prime * result + ((getAlarmText() == null) ? 0 : getAlarmText().hashCode());
        result = prime * result + ((getHostSendFlag() == null) ? 0 : getHostSendFlag().hashCode());
        result = prime * result + ((getStatisticsFlag() == null) ? 0 : getStatisticsFlag().hashCode());
        result = prime * result + ((getDownFlag() == null) ? 0 : getDownFlag().hashCode());
        result = prime * result + ((getSeverity() == null) ? 0 : getSeverity().hashCode());
        result = prime * result + ((getAlarmcd() == null) ? 0 : getAlarmcd().hashCode());
        result = prime * result + ((getAlarmGroup() == null) ? 0 : getAlarmGroup().hashCode());
        result = prime * result + ((getMessageJ() == null) ? 0 : getMessageJ().hashCode());
        result = prime * result + ((getMessageE() == null) ? 0 : getMessageE().hashCode());
        result = prime * result + ((getHostSentTime() == null) ? 0 : getHostSentTime().hashCode());
        result = prime * result + ((getHyperlink() == null) ? 0 : getHyperlink().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", alarmId=").append(alarmId);
        sb.append(", controllerSpec=").append(controllerSpec);
        sb.append(", alarmCode=").append(alarmCode);
        sb.append(", alarmText=").append(alarmText);
        sb.append(", hostSendFlag=").append(hostSendFlag);
        sb.append(", statisticsFlag=").append(statisticsFlag);
        sb.append(", downFlag=").append(downFlag);
        sb.append(", severity=").append(severity);
        sb.append(", alarmcd=").append(alarmcd);
        sb.append(", alarmGroup=").append(alarmGroup);
        sb.append(", messageJ=").append(messageJ);
        sb.append(", messageE=").append(messageE);
        sb.append(", hostSentTime=").append(hostSentTime);
        sb.append(", hyperlink=").append(hyperlink);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}