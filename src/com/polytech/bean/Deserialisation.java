package com.polytech.bean;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Deserialisation {

	public static void main(String[] args) {

		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\axelm\\Projet 4A\\Projet_4A_Sys_Dis\\personne.xml");
			System.out.println("s");
			XMLDecoder dec = new XMLDecoder(fis);
			System.out.println("s");
			Personne p = (Personne) dec.readObject();
			System.out.println("objet personne: "+ p);
			dec.close();
			fis.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
