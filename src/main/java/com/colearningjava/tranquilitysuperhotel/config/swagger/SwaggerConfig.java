package com.colearningjava.tranquilitysuperhotel.config.swagger;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
@EnableSwagger2
@EnableWebMvc
public class SwaggerConfig {

    private static  final String AUTHORIZATION_HEADER = "Authorization";
    private  ApiKey apikey(){
        return  new ApiKey("JWT", AUTHORIZATION_HEADER, "header");
    }

    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.colearningjava.tranquilitysuperhotel"))
                .build()
                .apiInfo(apiDetails())
                .securitySchemes(Arrays.asList(apikey()))
                .securityContexts(Arrays.asList(securityContext()));
    }

    private ApiInfo apiDetails(){
        return new ApiInfo(
                "Tranquility Super Hotel",
                "An hotel management application",
                "1.0",
                "This version is  available to all",
                new springfox.documentation.service.Contact("Tranquility Group",
                        "http://transquilitysuperhotel.com",
                        "tran.superhotel@.com"),
                "Api License",
                "http://tranquility.io",
                Collections.emptyList()
        );
    }

    private SecurityContext securityContext(){
        return SecurityContext.builder()
                .securityReferences(defaultAuth())
                .build();
    }

    private List<SecurityReference> defaultAuth(){
        AuthorizationScope authorizationScope = new AuthorizationScope("global", "totalAccess");
        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
        authorizationScopes[0] = authorizationScope;

        return List.of(new SecurityReference("JWT", authorizationScopes));
    }
}
