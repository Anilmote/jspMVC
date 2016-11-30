package com.mankraft;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginBean")
public class LoginBean extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String name,password;
	

	public void setName(String name) {
		this.name=name;

	}
	public String getName()
	{
		return name;
	}

	public void setPassword(String password) {
      this.password=password;		
	}
	public String getPassword()
	{
		return password;
	}

	public boolean validate() {
		if(password.equals("sri"))
		{
		return true;
		}
		else
		{
		return false;
	}
	}
}
