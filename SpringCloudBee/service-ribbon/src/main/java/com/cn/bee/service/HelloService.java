package com.cn.bee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by yyzc on 2017/11/17.
 */
@Service
public class HelloService {
    /**
     * 测试类HelloService，通过之前注入ioc容器的restTemplate来消费service-hi服务的“/hi”接口，
     * 在这里我们直接用的程序名替代了具体的url地址，在ribbon中它会根据服务名来选择具体的服务实例，根据服务实例在请求的时候会用具体的url替换掉服务名
     */
    @Autowired
    RestTemplate restTemplate;

    /**
     * RestTemplate的getForObject完成get请求、postForObject完成post请求、put对应的完成put请求、delete完成delete请求；
     * 还有execute可以执行任何请求的方法，需要你设置RequestMethod来指定当前请求类型。
     */
    public String hiService(String name) {
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}
