package com.smarone.TD_Java_perso;

import org.hibernate.Session;

import com.Model.Directeur;
import com.Model.Hotel;
import com.Model.Salarie;
import com.Services.DirecteurServices;
import com.Services.HotelServices;
import com.Services.SalarieServices;

public class Principale {

	public static void main(String[] args) {
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		
		SalarieServices Ss = new SalarieServices();
		DirecteurServices Ds = new DirecteurServices();
		HotelServices Hs = new HotelServices();

		Salarie s1 = new Salarie("Warning", "Thomson ", 2500.00, 6);
		
		Directeur d1 = new Directeur("MARONE", "Joel");
		
		Hotel h1 = new Hotel("Hotel 5 Etoile", "39 Rue de la Présidence", "04000400");
		
		h1.setDirecteur(d1);
		d1.setHotel(h1);
		Hs.create(h1, session);
		Ds.create(d1, session);
		
		
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
