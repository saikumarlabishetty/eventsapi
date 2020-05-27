package com.saikumarl.service.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.saikumarl.model.Event;
import com.saikumarl.service.AppService;

@Service
public class AppServiceImpl implements AppService {
	String url = "https://api.github.com/repos/{owner}/{repo}/events";

	@Override
	public ModelAndView renderEvents(String owner, String repo) {
		StringBuilder sb = new StringBuilder();
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Event[]> response = restTemplate.getForEntity(url, Event[].class, owner, repo);
		Event[] events = response.getBody();
		ModelAndView model = new ModelAndView("index");
		for (Event event : events) {
			System.out.println("#################" + event.getId());
			sb.append("<tr><td>" + event.getId() + "</td><td>" + event.getType() + "</td><td>" + event.getCreatedAt()
					+ "</td></tr>");
		}
		model.addObject("data", sb);
		return model;
	}
}
