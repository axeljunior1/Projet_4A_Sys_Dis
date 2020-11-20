package com.polytech.servlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.mysql.cj.xdevapi.PreparableStatement;
import com.polytech.bean.Personne;

public class testJdbc {
    /* La liste qui contiendra tous les résultats de nos essais */
    private List<Personne> pers = new ArrayList<Personne>();

	Statement  statement =null;
	ResultSet resultat = null;
   	Connection connexion = null;
   	
   	
   private void seConnecterr() {
	   try {
   	    Class.forName( "com.mysql.cj.jdbc.Driver" );
   	} catch ( ClassNotFoundException e ) {
   	    /* Gérer les éventuelles erreurs ici. */
   	}
	   
	   String url = "jdbc:mysql://127.0.0.1:3306/etudiants?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
   	String utilisateur = "root";
   	String motDePasse = "root";
	
   	try {
   	    connexion = DriverManager.getConnection( url, utilisateur, motDePasse );
   	    statement = connexion.createStatement();
   	}catch (Exception e) {
		// TODO: handle exception
	}

	   
   }
    
    
    public List<Personne> ajout_etudiant( HttpServletRequest request ) {
    	seConnecterr();
    	try {
    	    resultat =statement.executeQuery("SELECT * FROM etudiants.etudiants;");
			System.out.println(resultat);

			while (resultat.next()) {
				String nom = resultat.getString("nom");
				String prenom = resultat.getString("prenom");
				int age = resultat.getInt("age");
				System.out.println("test");
				Personne p = new Personne(nom,prenom,age);

				pers.add(p);
			}
    	} catch ( SQLException e ) {
			System.out.println(e.getMessage());

    		System.out.println("pas de connexion");
    	    /* Gérer les éventuelles erreurs ici */
    	} finally {
    	    if ( connexion != null )
    	        try {
    	            /* Fermeture de la connexion */
    	            connexion.close();
    	        } catch ( SQLException ignore ) {
    	            /* Si une erreur survient lors de la fermeture, il suffit de l'ignorer. */
    	        }
    	}
        return pers;
    }
    
    PreparedStatement preparestat = null;
    
    public void a_etudiant( Personne personne ) {
		seConnecterr();
		try {
			seConnecterr();
			
			
			 preparestat = connexion.prepareStatement("INSERT INTO `etudiants`.`etudiants` (`nom`, `prenom`, `age`) VALUES (?,?,?);");
			 preparestat.setString(1, personne.getNom());
			 preparestat.setString(2, personne.getPrenom());
			 preparestat.setInt(3, personne.getAge());
			 
			 preparestat.execute();
			 
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(preparestat==null)
				try {
					preparestat.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
			
	}
    
    
}