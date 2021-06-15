package com.springboot.web.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.GetMapping;

import com.springboot.web.service.TodoService;



@Controller
@RequestMapping("/welcome")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/list-todos",method=RequestMethod.GET)
	public String showTodo(ModelMap model)
	{
		String name=(String)model.get("name");
		model.put("todos", service.retrieveTodos(name));
		return "list-todos";
	}
	
	@GetMapping(path="/")
	public String getWelcome(Model model) {
		model.addAttribute("Message","Hello World");
	
		return "Welcome";
	}

}
