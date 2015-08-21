package com.egov.dao;

import java.util.List;

import com.egov.model.Article;

public interface ArticleDAO {
	public int publishArticle(Article article);
	public List<Article> selectArticleByTitle(String title);
}
