package com.saikumarl.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.saikumarl.service.AppService;

@Controller
public class AppController {

	@Autowired
	AppService appService;

	@RequestMapping(value = "/events", method = RequestMethod.GET)
	public ModelAndView getEvents(HttpServletRequest request) {
		return appService.renderEvents(request.getParameter("owner"), request.getParameter("repo"));
	}

}