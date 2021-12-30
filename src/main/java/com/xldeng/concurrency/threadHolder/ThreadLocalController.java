package com.xldeng.concurrency.threadHolder;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: concurrency
 * @description:
 * @author: dengxinlin
 * @create: 2021-12-30 22:30
 */
@Controller
@RequestMapping("/threadLocal")
public class ThreadLocalController {
    @RequestMapping("/test")
    @ResponseBody
    public Long test() {
        return RequestHolder.getId();
    }
}