package fileWorks;

import java.io.Serializable;

public class Hatem_Ben_Tayeb implements Serializable{
	private String nom;
	private String prenom;
	private int Age;
	
	
	
	public Hatem_Ben_Tayeb(String nom, String prenom, int age) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		Age = age;
		
	}


	@Override
	public String toString() {
		return "Hatem_Ben_Tayeb [nom=" + nom + ", prenom=" + prenom + ", Age=" + Age + "]";
	}
	
	
	
	

}
