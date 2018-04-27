package com.jlcindia.spring.mvc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@EnableWebMvc
@Configuration
@ComponentScan({"com.jlcindia.spring.mvc"})
public class JlcConfig {
	@Bean
	public TilesViewResolver tilesViewResolver(){
		TilesViewResolver viewResolver=new TilesViewResolver();
		return viewResolver;
	}
	@Bean
	public TilesConfigurer tilesConfigurer(){
		TilesConfigurer configurer=new TilesConfigurer();
		configurer.setDefinitions("/WEB-INF/pages/tiles.xml");
	  return configurer;
	}
	

}
