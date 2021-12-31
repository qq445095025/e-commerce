package com.imooc.ecommerce.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class NacosClientService {

    private final DiscoveryClient discoveryClient;

    public NacosClientService(DiscoveryClient discoveryClient) {
        this.discoveryClient = discoveryClient;
    }

    /**
     * <h2>打印Nocas Client 信息到日志中</h2>
     * */
    public List<ServiceInstance> getNacosClientInfo(String serviceId){
        log.info("Nocas服务信息：[{}]",serviceId);
        return discoveryClient.getInstances(serviceId);
    }
}
