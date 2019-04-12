package com.yhy.application.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author YuHongYe
 * @create 2019-04-08-16:02
 */
@FeignClient(value = "eurekasclient", fallback = ApiServiceError.class)
public interface ApiService {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    String index();
}
