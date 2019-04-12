package com.yhy.application.service;

import org.springframework.stereotype.Component;

/**
 * @author YuHongYe
 * @create 2019-04-10-13:43
 */
@Component
public class ApiServiceError implements ApiService {
    @Override
    public String index() {
        return "服务器发生故障";
    }
}
