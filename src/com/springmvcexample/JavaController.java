package com.springmvcexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class JavaController 
{
	@RequestMapping("/welcome")//(/welcome) which is mentioned in the index.xml
	public ModelAndView helloWorld(ModelMap model, HttpServletRequest request) 
	{

	   String message =  "Welcome to my 2nd Spring Project MVC Sessions";
	   message += "<br>You Did it....!";
	 
	   System.out.println(message);
       model.addAttribute("message", message);
     
	   return new ModelAndView("welcomePage", "welcomeMessage", message);//"welcomeMessage" which is in the welcomePage
	}//ModelAndView closed
	}
 
