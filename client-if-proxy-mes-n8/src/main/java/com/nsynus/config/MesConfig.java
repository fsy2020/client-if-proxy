package com.nsynus.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author N01010030
 */
@Component
@ConfigurationProperties(prefix = "n8.mes.config")
@Data
public class MesConfig {

    private String defaultQueue;

}

