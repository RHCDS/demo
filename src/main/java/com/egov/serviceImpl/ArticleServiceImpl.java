package com.egov.serviceImpl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.egov.dao.ArticleDAO;
import com.egov.model.Article;
import com.egov.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService{
	
	@Resource
	private ArticleDAO articleDAO;

	@Override
	public List<Article> selectArticleByTitle(String title) {
		// TODO Auto-generated method stub
		return articleDAO.selectArticleByTitle(title);
	}

	@Override
	public int publishArticle(Article article) {
		return articleDAO.publishArticle(article);
	}
	
}
