package com.hsnam.sample.restapi.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *
 */
@Configuration
@EnableSwagger2 @Slf4j
public class SwaggerConfiguration {

    /**
     * SwaggerAPI
     * Config Swagger
     * @return Docket
     */
    @Bean
    public Docket swaggerAPI(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(swaggerApiInfo()).select()
                .apis(RequestHandlerSelectors.basePackage("com.hsnam.sample.restapi"))
                .paths(PathSelectors.any())
                .build()
                .useDefaultResponseMessages(false);
    }//end of swaggerAPI

    /**
     * Swagger API Information
     * @return ApiInfo
     */
    private ApiInfo swaggerApiInfo(){
        return new ApiInfoBuilder().title("REST API Sample")
                .description("REST API SAMPLE")
                .license("UST21").version("1").build();
    }//end of swaggerApiInfo

    /**
     * Initialize Swagger
     */
    public void initialize(){
        log.info("Initialize Swagger Configuration");
    }

}
