package com.saikumarl.service;

import org.springframework.web.servlet.ModelAndView;

public interface AppService {

	ModelAndView renderEvents(String owner, String repo);
	
}