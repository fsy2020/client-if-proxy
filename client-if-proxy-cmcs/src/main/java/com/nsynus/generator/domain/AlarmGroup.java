package com.nsynus.generator.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @TableName ALARM_GROUP
 */
@TableName(value ="ALARM_GROUP")
@Data
@NoArgsConstructor
public class AlarmGroup implements Serializable {
    /**
     * 
     */
    @TableId(value = "ALARM_GROUP")
    private String ALARM_GROUP;

    /**
     * 
     */
   /* @TableField(value = "HOST_SENT_TIME")
    private String HOST_SENT_TIME;*/

   /* @TableField(exist = false)*/
    private static final long serialVersionUID = 1L;


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ALARM_GROUP=").append(ALARM_GROUP);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}