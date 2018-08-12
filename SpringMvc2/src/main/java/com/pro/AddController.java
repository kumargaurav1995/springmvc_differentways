package com.pro;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AddController {

	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int i,@RequestParam("t2") int j){
		
		
		int k=i+j;
		 
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Display");
		mv.addObject("result",k);
		return mv;
	}
}
