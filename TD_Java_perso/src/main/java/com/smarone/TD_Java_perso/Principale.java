package com.smarone.TD_Java_perso;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;

import com.Model.Directeur;
import com.Model.Salarie;
import com.Services.DirecteurServices;
import com.Services.SalarieServices;

public class Principale {

	public static void main(String[] args) {
		
		SalarieServices Ss = new SalarieServices();
		DirecteurServices Sd = new DirecteurServices();

		Salarie s1 = new Salarie("MARONE", "Samuel ibou", 5000.00, 1);
		
		Directeur d1 = new Directeur("James", "Gordon");
		
		s1.setDirecteur(d1);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		Sd.create(d1, session);

		Ss.create(s1, session);
		
////		cs.delete(session, 3);
////		c1.setPrenom("Paul");
////		cs.update(session, 2);
//		Client c2 = cs.findById(session, 1);
//		System.out.println("nom : " + c2.getNom() + ", prenom : " + c2.getPrenom() + ", liste produits : " + c2.getProduits().toString());
//		
//		List<Client> listeC = cs.findAll(session);
//
//		for(Client cli : listeC)
//		{
//			System.out.println("nom : " + cli.getNom() + ", prenom : " + cli.getPrenom());
//		}
//		
//		ProduitService ps = new ProduitService();
//		Produit prod1 = ps.findById(session, 1);
//		
//		System.out.println("reference : " + prod1.getReference() + ", prix : " + prod1.getPrix());
//		
//		List<Produit> listeProd = ps.findAll(session);
//
//		for(Produit pr : listeProd)
//		{
//			System.out.println("reference : " + pr.getReference() + ", prix : " + pr.getPrix());
//		}
//		
//		
//		Compte cpt1 = new Compte("test@test.com", "test");
//		Client c3 = new Client("Sophie", "Marie");
//		
//		session.saveOrUpdate(cpt1);
//		c3.setCompte(cpt1);
//		session.saveOrUpdate(c3);
		
		
		session.getTransaction().commit();
		HibernateUtil.shutdown();

	}

}
