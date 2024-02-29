package com.nsynus.framework.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * <p>日志拦截器</p>
 * @author N01010030
 */
@Component
public class LogInterceptor extends HandlerInterceptorAdapter {
    private final Logger log = LoggerFactory.getLogger(this.getClass());
    /**
     * 日志跟踪标识
     */
    private static final String X_REQUEST_ID = "x-request-id";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) {
        String traceId = UUID.randomUUID().toString();
        if (StringUtils.isEmpty(MDC.get(X_REQUEST_ID))) {
            MDC.put(X_REQUEST_ID, traceId);
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {
        MDC.remove(X_REQUEST_ID);
    }
}
