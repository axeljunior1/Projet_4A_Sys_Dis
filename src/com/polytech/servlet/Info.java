package com.polytech.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polytech.bean.ConnectionForm;

@WebServlet("/Info")

public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Info() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
        this.getServletContext().getRequestDispatcher("/WEB-INF/fileJsp.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ConnectionForm cf = new ConnectionForm();
		cf.verifictionIdentifiants(request);
		request.setAttribute("cf", cf);
		this.getServletContext().getRequestDispatcher("/WEB-INF/fileJsp.jsp").forward(request, response);
	}

}
