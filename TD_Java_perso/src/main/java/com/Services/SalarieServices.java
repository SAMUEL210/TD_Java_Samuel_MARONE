package com.Services;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import com.Model.Salarie;

public class SalarieServices implements Serializable {
	
	public boolean create(Salarie ss, Session s)
	{
		s.save(ss); // INSERT INTO Client (nom, prenom) VALUES (c.getNom(), c.getPrenom());
		
		return true;
	}
	
	public void delete(Session s, int id)
	{
		Salarie ss = s.get(Salarie.class, id);
		s.delete(ss); 
	}
	
	public void update(Session s, int id)
	{
		Salarie ss = s.get(Salarie.class, id);
		ss.setPrenom("Paul");
		s.update(ss);
	}
	
	public Salarie findById(Session s, int id)
	{
		Salarie ss = s.get(Salarie.class, id); // SELECT * FROM client where id = id;
		return ss;
	}
	
	public List<Salarie> findAll(Session s)
	{
		Query q = s.createQuery("from Client");
		List<Salarie> listeS = q.list();
		
		return listeS;
	}

}
