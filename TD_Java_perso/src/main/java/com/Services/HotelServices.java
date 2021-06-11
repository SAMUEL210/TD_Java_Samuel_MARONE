package com.Services;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.Model.Hotel;

@SuppressWarnings("deprecation")
public class HotelServices implements Serializable {
	
	public boolean create(Hotel h, Session s)
	{
		s.save(h);
		
		return true;
	}
	
	public void delete(Session s, int id)
	{
		Hotel h = s.get(Hotel.class, id);
		s.delete(h); 
	}
	
	public void update(Session s, int id)
	{
		Hotel h = s.get(Hotel.class, id);
		h.setNom("BB");
		s.update(h);
	}
	
	public Hotel findById(Session s, int id)
	{
		Hotel h = s.get(Hotel.class, id); // SELECT * FROM client where id = id;
		return h;
	}
	
	public List<Hotel> findAll(Session s)
	{
		Query q = s.createQuery("from Client");
		List<Hotel> listeH = q.list();
		
		return listeH;
	}

}

