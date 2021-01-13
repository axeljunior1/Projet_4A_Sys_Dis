package com.polytech.bean;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileOutputStream;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Serialisation {

	public static void main(String[] args) {
		
		try {

			//date datenaiss = new date(2,04,2000);
			Personne p1 = new Personne("mengue", "axel", 10);
			FileOutputStream fos = new FileOutputStream(new File("./personne.xml"));
			XMLEncoder enc = new XMLEncoder(fos);
			enc.writeObject(p1);
			enc.flush();
			enc.close();
			fos.close();
			System.out.println("top");
			
//			JAXBContext jc = JAXBContext.newInstance("Personne.class");
//			date datenaiss = new date(2,04,2000);
//			Personne p1 = new Personne("mengue", "axel", 10.0, datenaiss);
//			Marshaller m = jc.createMarshaller();
//			m.marshal(p1, new File("resultat.xml"));
//			System.out.println("cool");
		} catch (Exception e) {
			
		}
	}

}
