package agk.bootsecurity.swagger;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.paths.PathMappingAdjuster;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {                                    
    @Bean
    public Docket api() { 
        return new Docket(DocumentationType.SWAGGER_2)  
          .select()                                  
          .apis(RequestHandlerSelectors.basePackage("agk.bootsecurity"))              
          .paths(PathSelectors.regex("/.*"))
          .build()
          .apiInfo(apiInfo());
          /*.apis(RequestHandlerSelectors.any())
          .paths(PathSelectors.any())
          .build()
          .pathMapping("/*")
          .apiInfo(apiInfo());    */                                       
    }
    private ApiInfo apiInfo() {
        return new ApiInfo(
          "Demo REST API", 
          "Demo API's", 
          "API for demonstration", 
          "Terms of service", 
          new Contact("Anand K", "anandkadekar12@gmail.com", "anandkadekar123@gmail.com"), 
          "License of API", "API license URL", Collections.emptyList());
    }
}