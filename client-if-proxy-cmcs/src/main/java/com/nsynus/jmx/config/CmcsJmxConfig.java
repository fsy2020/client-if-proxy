package com.nsynus.jmx.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author N01010030
 */

@Component
@ConfigurationProperties(prefix = "cmcs.jmx.config")
@Data
public class CmcsJmxConfig {

    private String proxyUrl;

    private String proxyPort;
    
}
