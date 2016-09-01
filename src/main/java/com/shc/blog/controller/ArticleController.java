package com.shc.blog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shc.blog.bean.Article;
import com.shc.blog.service.impl.ArticleServiceImpl;

/**
 * 文章管理
 * @author shc
 */
@Controller
@RequestMapping("/article")
public class ArticleController {

	@Autowired
	@Qualifier("articleService")
	private ArticleServiceImpl articleService;
	
	 @RequestMapping("/add")
	public void saveArticle(Article article){
		articleService.save(article);
	}
	
}
