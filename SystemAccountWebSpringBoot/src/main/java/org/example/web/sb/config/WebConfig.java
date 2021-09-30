package org.example.web.sb.config;

//import org.example.logic.config.LogicConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Import({LogicConfig.class})
@Configuration
@ComponentScan(basePackages = {
        "org.example.web.sb.controller",
        "org.example.web.sb.exception"
})

public class WebConfig {
}
