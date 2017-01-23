package com.opusmagus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.opusmagus.entity.Match;
import com.opusmagus.models.MatchModel;

@Controller
@RequestMapping("/match")
public class MatchController {
	
	@RequestMapping("/index")
	public ModelAndView welcome() {
		return new ModelAndView("match-index");
	}
	
	@Autowired
	public MatchModel matchModel;
	
	@RequestMapping(value = "/stats", method = RequestMethod.POST)
	public @ResponseBody Match playNext(long teamId) {
		return matchModel.getMatch(teamId);
	}
}
