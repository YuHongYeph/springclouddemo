package com.yhy.application.handler;

import com.yhy.application.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author YuHongYe
 * @create 2019-04-10-13:47
 */
@RestController
public class ApiHandler {

    @Resource
    private ApiService apiService;

    @RequestMapping("/index")
    public String index() {
        return apiService.index();
    }
}
