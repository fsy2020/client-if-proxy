package com.nsynus.jmx.config;

import cn.com.nsynus.cmcs.client.remote.ClientInterface;
import org.springframework.jmx.access.MBeanProxyFactoryBean;
import org.springframework.jmx.support.MBeanServerConnectionFactoryBean;

import javax.management.MalformedObjectNameException;
import java.net.MalformedURLException;

/**
 * @author N01010030
 */
public class CmcsJmxClientIfConfig {

    public MBeanServerConnectionFactoryBean mbeanServerConnectionFactoryBean() throws MalformedURLException {
        MBeanServerConnectionFactoryBean factoryBean = new MBeanServerConnectionFactoryBean();
        factoryBean.setServiceUrl("service:jmx:rmi:///jndi/rmi://localhost:20104/jmxrmi");
        return factoryBean;
    }

    /*@Bean*/
    public MBeanProxyFactoryBean clientInterface() throws MalformedObjectNameException, MalformedURLException {
        MBeanProxyFactoryBean factoryBean = new MBeanProxyFactoryBean();
        factoryBean.setObjectName("cMCS1_5:type=ClientInterface");
        factoryBean.setProxyInterface(ClientInterface.class);
        factoryBean.setServer(mbeanServerConnectionFactoryBean().getObject());
        factoryBean.afterPropertiesSet();
        return factoryBean;
    }
}
