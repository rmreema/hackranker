package com.fibanocci.fibanocci;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/fibanocci/")
@ResponseBody


public class FibanocciController {
	
	@Autowired
	FibanocciService fibanocciService;
	@GetMapping(value = "{Number}", produces = MediaType.TEXT_PLAIN_VALUE)
	@ResponseBody
	public String saveRestaurant (@PathVariable("Number") String number) {
		return fibanocciService.isFibanocci(number);

	}

	}
	 

