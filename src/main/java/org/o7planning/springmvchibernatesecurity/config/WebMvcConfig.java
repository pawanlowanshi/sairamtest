package org.o7planning.springmvchibernatesecurity.config;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;
 
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
 
@Configuration
@EnableWebMvc
public class WebMvcConfig extends WebMvcConfigurerAdapter {
 
    private static final Charset UTF8 = Charset.forName("UTF-8");
 
    // Config UTF-8 Encoding.
    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
	System.out.println("configureMessageConverters()=====WebMvcConfig");
        StringHttpMessageConverter stringConverter = new StringHttpMessageConverter();
        stringConverter.setSupportedMediaTypes(Arrays.asList(new MediaType("text", "plain", UTF8)));
        converters.add(stringConverter);
 
        // Add other converters ...
    }
 
      
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
	System.out.println("addResourceHandlers()=====WebMvcConfig");
	registry
        .addResourceHandler("/resources/**")
        .addResourceLocations("/resources/");
    }
  
    @Override
    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("configureDefaultServletHandling()=====WebMvcConfig");
        configurer.enable();
    }
 
}
