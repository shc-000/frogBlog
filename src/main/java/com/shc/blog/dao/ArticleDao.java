package com.shc.blog.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import com.shc.blog.dao.impl.ArticleDaoImpl;

public class ArticleDao implements ArticleDaoImpl{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
		sf.getCurrentSession().save(obj);
	}

	public void update(Object obj) {
		
		sf.getCurrentSession().update(obj);
	}
	
	public void delete(Object obj) {
		
		sf.getCurrentSession().delete(obj);
	}
}
