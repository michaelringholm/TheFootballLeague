package com.opusmagus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.opusmagus.entity.League;
import com.opusmagus.models.LeagueModel;

@Controller
@RequestMapping("/league")
public class LeagueController {
	@RequestMapping("/index")
	public ModelAndView welcome() {
		return new ModelAndView("league-index");
	}
	
	@Autowired
	public LeagueModel leagueModel;
	
	@RequestMapping(value = "/division", method = RequestMethod.POST)
	public @ResponseBody League getLeague(int divisionIndex) {
		return leagueModel.getLeague(divisionIndex);
	}
}
