package com.polytech;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.polytech.bean.Personne;

public class database {

	private List<Personne> pers = new ArrayList<Personne>();
	
	public List<Personne> personnes() {

		try {
			Class.forName("com.mysql.jdbc.Driver");

		} catch (ClassNotFoundException e) {
			System.out.println("Erreur de connexion a la base de données");
		}

		//connection a la base 

		Connection connection = null;
		Statement  statement =null;
		ResultSet resultat = null;

		try {

			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/etudiants", "root", "root");
			statement = connection.createStatement();
			pers.add(new Personne("junior", "mengue", 21));

			resultat =statement.executeQuery("SELECT * FROM etudiants.etudiants;");
			pers.add(new Personne("junior", "mengue", 22));

			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				int age = resultat.getInt("age");
				pers.add(new Personne("junior", "mengue", 23));

				Personne p = new Personne();
				p.setNom(nom);
				p.setAge((int) age);
				p.setPrenom(prenom);

				pers.add(p);
			}
		} catch (Exception e) {
			e.printStackTrace();
			pers.add(new Personne("junior", "erreurrrrrrr!!!!!!", 21));

		}
		finally {
			try {
				if (resultat!=null)	resultat.close();
				if (statement!=null)statement.close();
				if (connection!=null) 	connection.close();
				
				pers.add(new Personne("junior", "mengue", 24));

			}
			catch (SQLException e2) {
				// TODO: handle exception
			}
		}


		return pers; 
	}
}
