package com.springmvcexample;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	@RequestMapping("/login")
	private ModelAndView login(ModelMap model,HttpServletRequest request, HttpServletResponse response) 
			throws SQLException, IOException, ServletException {
//		PrintWriter pw=response.getWriter();
//		response.setContentType("text/html");
		String message=null;
		String user=request.getParameter("username");
		String pass=request.getParameter("password");
		System.out.println(user);
		System.out.println(pass);
//		pw.print("<font face='verdana'>");
//
	        if(user.equals("vasavi")&&pass.equals("java4s")){
//			pw.println("Login Success...!");
	        	message="Welcome Spring MVC "+ user;
	        }
			else{
//			pw.println("Login Failed...!");
				message="Login failed "+ user;
			}
//	        
//	    pw.print("</font>");
//		pw.close();
		return new ModelAndView("loginPage", "welcomeMessage", message);
		
	}

}
