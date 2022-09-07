package com.jack.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "seata-storage")
public interface StorageFeign {
    @GetMapping("/test222")
    public Integer test();
}
