package com.springboot.web.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springboot.web.model.Todo;

@Service
public class TodoService {
	 private static int todoCount = 3;
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		
		todos.add(new Todo(1, "in28Minutes", "Learn Spring MVC", false));
		todos.add(new Todo(2, "in28Minutes", "Learn Struts", false));
        todos.add(new Todo(3, "in28Minutes", "Learn Hibernate",false));
	    }
	
	public List<Todo> retrieveTodos(String user)
	{
		List<Todo> listUser= new ArrayList<Todo>();
		for(Todo todo:todos)
		{
			if(todo.getUser().equals(user))
			{
				listUser.add(todo);
			}
		}
		return listUser;
	}

	
	

}
