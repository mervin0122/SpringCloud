package com.cn.bee.service;

import org.springframework.stereotype.Component;

/**
 * Created by yyzc on 2017/11/17.
 */
@Component
public class SchedualServiceHiHystric implements  SchedualServiceHi{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name+"，服务已断开！";
    }

}
