package com.xldeng.concurrency.threadHolder;

/**
 * @program: concurrency
 * @description:
 * @author: dengxinlin
 * @create: 2021-12-30 22:16
 */
public class RequestHolder {
    private final static ThreadLocal<Long> requestHolder = new ThreadLocal<>();
    public static void add(Long id){
        requestHolder.set(id);
    }

    public static Long getId(){
        return requestHolder.get();
    }
    public static void remove(){
        requestHolder.remove();
    }
}