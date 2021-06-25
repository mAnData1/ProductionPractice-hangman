package com.example.demo.web;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.HangmanService;
import com.example.demo.service.IHangmanService;
//import HangmaModel;

@Controller
public class HangmanController {
	
	@Autowired
	private IHangmanService hangmanService ;

	@RequestMapping(value = "/index",method = RequestMethod.GET)
	public String Test(Model model)
	{ 
		return "index.html";
	}
	
	
	@RequestMapping(value = "/game",method = RequestMethod.POST)
	public String Paly(Model model)
	{ 
		String word = hangmanService.GetWord();
		
		model.addAttribute("hiddenword", hangmanService.PrintHiddnework(word));
		model.addAttribute("word", word);
		return "index2.html";
		
	}
	
	
	
}
