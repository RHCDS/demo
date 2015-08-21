package com.egov.service;

import java.util.List;

import com.egov.model.Article;

public interface ArticleService {
	public List<Article> selectArticleByTitle(String title);
	public int publishArticle(Article article);
}
