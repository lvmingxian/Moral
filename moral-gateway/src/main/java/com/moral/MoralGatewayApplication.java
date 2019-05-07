package com.moral;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;

/**
 * @AUTHOR letterXian
 * @DATE 2019/5/7 14:44
 * @DESC 育德评价 网关
 **/
@SpringCloudApplication
public class MoralGatewayApplication {
    public static void main(String[] args) {
        SpringApplication.run(MoralGatewayApplication.class,args);
    }
}
