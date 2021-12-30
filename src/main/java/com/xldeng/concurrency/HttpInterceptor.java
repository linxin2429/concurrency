package com.xldeng.concurrency;

import com.xldeng.concurrency.threadHolder.RequestHolder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: concurrency
 * @description:
 * @author: dengxinlin
 * @create: 2021-12-30 22:26
 */
@Slf4j
public class HttpInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("prehandle");
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        RequestHolder.remove();
        log.info("afterCompletion");
        return;
    }
}