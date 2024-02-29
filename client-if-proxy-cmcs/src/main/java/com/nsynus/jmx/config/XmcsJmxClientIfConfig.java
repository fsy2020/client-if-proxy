package com.nsynus.jmx.config;

import com.nsynus.jmx.constans.JmxConfigConstants;
import jp.co.daifuku.xmcs.client.jmx.ObjectNames;
import jp.co.daifuku.xmcs.client.remote.ClientInterface;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.jmx.access.MBeanProxyFactoryBean;
import org.springframework.jmx.support.MBeanServerConnectionFactoryBean;

import javax.annotation.Resource;
import javax.management.MalformedObjectNameException;
import java.net.MalformedURLException;


/**
 * Xmcs的jmx相关配置
 *
 * @author N01010030
 */
@Configuration
public class XmcsJmxClientIfConfig {

    @Resource
    private XmcsJmxConfig xmcsJmxConfig;


    @Bean
    public MBeanServerConnectionFactoryBean mbeanServerConnectionFactoryBean() throws MalformedURLException {
        MBeanServerConnectionFactoryBean factoryBean = new MBeanServerConnectionFactoryBean();
        // jmx的url格式化，变成类似： service:jmx:rmi:///jndi/rmi://localhost:20104/jmxrmi
        String realJmxUrl = String.format(JmxConfigConstants.JMX_URL_STRING, xmcsJmxConfig.getProxyUrl(), xmcsJmxConfig.getProxyPort());
        factoryBean.setServiceUrl(realJmxUrl);
        return factoryBean;
    }

    @Bean
    public MBeanProxyFactoryBean clientInterface() throws MalformedObjectNameException, MalformedURLException {
        MBeanProxyFactoryBean factoryBean = new MBeanProxyFactoryBean();
        factoryBean.setObjectName(ObjectNames.CLIENT_IF_OBJECT_NAME);
        factoryBean.setProxyInterface(ClientInterface.class);
        factoryBean.setServer(mbeanServerConnectionFactoryBean().getObject());
        factoryBean.afterPropertiesSet();
        return factoryBean;
    }
}
