package com.xldeng.concurrency;

import com.xldeng.concurrency.threadHolder.RequestHolder;
import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * @program: concurrency
 * @description:
 * @author: dengxinlin
 * @create: 2021-12-30 22:19
 */
@Slf4j
public class HttpFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        log.info("do filter, {},{}",Thread.currentThread().getId(),((HttpServletRequest) request).getServletPath());
        RequestHolder.add(Thread.currentThread().getId());
        chain.doFilter(httpServletRequest, response);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
    }
}