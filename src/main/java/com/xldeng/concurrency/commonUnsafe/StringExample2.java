package com.xldeng.concurrency.commonUnsafe;

import com.xldeng.concurrency.Util.ConcurrentTestUtil;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: concurrency
 * @description:
 * @author: dengxinlin
 * @create: 2021-12-30 23:04
 */
@Slf4j
public class StringExample2 {
    // 请求总数
    public static int clientTotal = 5000;

    // 同时并发执行的线程数
    public static int threadTotal = 200;
    
    public static StringBuffer stringBuilder = new StringBuffer();

    public static void main(String[] args) throws Exception {
        ConcurrentTestUtil.run(() -> {
            stringBuilder.append(1);
        });
        log.info("size:{}", stringBuilder.length());
    }

    private static void update() {
        stringBuilder.append(1);
    }
}