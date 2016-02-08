package s10338;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.mvc.multiaction.InternalPathMethodNameResolver;


@Configuration
@EnableWebMvc
public class AppConfig extends WebMvcConfigurationSupport {
    @Bean
    public InternalPathMethodNameResolver viewResolver() {
        InternalPathMethodNameResolver internalPathMethodNameResolver = new InternalPathMethodNameResolver();
        internalPathMethodNameResolver.setPrefix("/");
        internalPathMethodNameResolver.setSuffix(".jsp");
        return internalPathMethodNameResolver;
    }

    @Override
    protected void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
        configurer.enable();
    }
}
