package com.mandeep.jacoco.configure;

import com.mandeep.jacoco.controller.SampleController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AutoConfigure {

	@Bean
	public SampleController sampleController() {

		return new SampleController();
	}
}
