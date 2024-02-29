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
public class BatchCancelRequestRvHeader implements Serializable {

    /**
     * 
     */
    private BatchCancelRequestRvHeaderSource source;

    /**
     * 
     */
    private BatchCancelRequestRvHeaderDestination destination;

    /**
     * 
     */
    private BatchCancelRequestRvHeaderReplyApplication replyApplication;

}