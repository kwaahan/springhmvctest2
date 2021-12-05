package com.spring.controlller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = {"","employee"})
public class PageController {
@GetMapping
public String index()
{
	return "index";
}

}
