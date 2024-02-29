package com.nsynus.mq.dto.batchcancle;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

/**
 * <p>
 * TODO
 * </p>
 * @author ${USER}
 * @since 2024-02-36 14:39:12
 **/
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchCancelRequestMsgHeader implements Serializable {

    /**
     * 
     */
    private String srvAddr;

    /**
     * 
     */
    private String reqAddr;

    /**
     * 
     */
    private String msgOwner;

    /**
     * 
     */
    private String srvMethod;

    /**
     * 
     */
    private String srvId;

    /**
     * 
     */
    private String timeStamp;

    /**
     * 
     */
    private Integer timeOut;

    /**
     * 
     */
    private String txId;

    /**
     * 
     */
    private String locale;

    /**
     * 
     */
    private String retCode;

    /**
     * 
     */
    private String retMsg;

}