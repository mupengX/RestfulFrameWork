package com.tk.framework.rest.framework.doctool.swaggerconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.mangofactory.swagger.configuration.SpringSwaggerConfig;
import com.mangofactory.swagger.plugin.EnableSwagger;
import com.mangofactory.swagger.plugin.SwaggerSpringMvcPlugin;
import com.wordnik.swagger.model.ApiInfo;

/**
 * <pre> 
 *  
 *  File: SwaggerConfig.java
 *  , Inc.
 *  Copyright (C): 2014
 *  Description: Swagger配置类
 *  TODO
 * 
 *  Notes:
 *  $Id: SwaggerConfig.java  2014-12-24 23:59:59Z \TK $ 
 * 
 * @Revision History:
 * <<2014年12月25日下午3:22:25>>, <<Who>>, <<what>>  
 *  2014年12月25日		TK		Initial.
 * </pre>
 */
@Configuration
@EnableSwagger
public class SwaggerConfig
{
	private SpringSwaggerConfig springSwaggerConfig;

	/**
	 * Required to autowire SpringSwaggerConfig
	 */
	@Autowired
	public void setSpringSwaggerConfig(SpringSwaggerConfig springSwaggerConfig)
	{
		this.springSwaggerConfig = springSwaggerConfig;
	}

	/**
	 * Every SwaggerSpringMvcPlugin bean is picked up by the swagger-mvc framework - allowing for multiple swagger
	 * groups i.e. same code base multiple swagger resource listings.
	 */
	@Bean
	public SwaggerSpringMvcPlugin customImplementation()
	{
		SwaggerSpringMvcPlugin ssmp = new SwaggerSpringMvcPlugin(this.springSwaggerConfig).apiInfo(apiInfo())
				.swaggerGroup("api-docs").build();
		return ssmp;
	}

	private ApiInfo apiInfo()
	{
		ApiInfo apiInfo = new ApiInfo(
				"TK团队接口说明以及规范文档.",
				"这里是TK团队接口说明文档站点,在这里你可以点击API了解详细内容并且对它们进行测试.",
				"", "", "", "");
		return apiInfo;
	}
}
