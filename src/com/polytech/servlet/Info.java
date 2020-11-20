package com.polytech.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.polytech.database;
import com.polytech.bean.Personne;

@WebServlet("/Info")

public class Info extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Info() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		database dtb = new database();
//		System.out.println(dtb.personnes().toString());
//		request.setAttribute("persones", dtb.personnes());
		
		testJdbc test = new testJdbc();
		//test.a_etudiant();
		request.setAttribute("etudiants", test.ajout_etudiant(request));
       this.getServletContext().getRequestDispatcher("/WEB-INF/fileJsp.jsp").forward(request, response);

		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		ConnectionForm cf = new ConnectionForm();
//		cf.verifictionIdentifiants(request);
//		request.setAttribute("cf", cf);
//		this.getServletContext().getRequestDispatcher("/WEB-INF/fileJsp.jsp").forward(request, response);
		
		Personne personne = new Personne();
		
		personne.setNom(request.getParameter("nom"));
		personne.setPrenom(request.getParameter("prenom"));
		personne.setAge( Integer.parseInt(request.getParameter("age")));
		
		testJdbc test= new testJdbc();
		test.a_etudiant(personne);
		request.setAttribute("etudiants", test.ajout_etudiant(request));
		this.getServletContext().getRequestDispatcher("/WEB-INF/fileJsp.jsp").forward(request, response);

		
	}

}
