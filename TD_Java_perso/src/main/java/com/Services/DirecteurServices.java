package com.Services;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.Directeur;
import com.Model.Salarie;
import com.smarone.TD_Java_perso.HibernateUtil;

public class DirecteurServices implements Serializable {
	
	public boolean create(Directeur d, Session s)
	{
		s.save(d);
		
		return true;
	}
	
	public void delete(Session s, int id)
	{
		Directeur d = s.get(Directeur.class, id);
		s.delete(d); 
	}
	
	public void update(Session s, int id)
	{
		Directeur d = s.get(Directeur.class, id);
		d.setPrenom("Paul");
		s.update(d);
	}
	
	public Directeur findById(Session s, int id)
	{
		Directeur d = s.get(Directeur.class, id); // SELECT * FROM client where id = id;
		return d;
	}
	
	public List<Directeur> findAll(Session s)
	{
		Query q = s.createQuery("from Client");
		List<Directeur> listeD = q.list();
		
		return listeD;
	}

}

