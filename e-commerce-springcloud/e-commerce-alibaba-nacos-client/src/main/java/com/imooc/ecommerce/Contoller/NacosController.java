package com.imooc.ecommerce.Contoller;

import com.imooc.ecommerce.service.NacosClientService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/nacos-client")
public class NacosController {

    private final NacosClientService nacosClientService;

    public NacosController(NacosClientService nacosClientService) {
        this.nacosClientService = nacosClientService;
    }

    /**
     * <h2>根据service id 获取服务所有的实例信息</h2>
     */
    @GetMapping("/service-intance")
    public List<ServiceInstance> logNacosClientInfo(
            @RequestParam(defaultValue = "e-commerce-alibaba-nacos-client") String serviceId) {
        log.info("coming in log nacos client info :[{}]", serviceId);
        return nacosClientService.getNacosClientInfo(serviceId);
    }
}
