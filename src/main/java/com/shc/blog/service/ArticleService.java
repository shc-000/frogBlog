package com.shc.blog.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.shc.blog.dao.impl.ArticleDaoImpl;
import com.shc.blog.service.impl.ArticleServiceImpl;

@Service
public class ArticleService implements ArticleServiceImpl{

	@Autowired
	@Qualifier("articleDao")
	private ArticleDaoImpl articleDao;
	
	@Override
	public void save(Object obj) {
		// TODO Auto-generated method stub
	}
}
