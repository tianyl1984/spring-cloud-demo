package com.tianyl.springCloudDemo.service1.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.StringVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket createDocket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .select().apis(RequestHandlerSelectors.basePackage("com.tianyl.springCloudDemo.service1.controller")).paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        List<VendorExtension> list = new ArrayList<>();
        list.add(new StringVendorExtension("ext1", "ext1-value"));
        return new ApiInfo("Service1 API 文档", "文档描述信息", "1.0", "http://127.0.0.1:6666/",
                new Contact("tyl", "http://tyl.com", "tyl@abc.com"), "license", "http://tyl.com/license",
                list);
    }
}
