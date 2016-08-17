package com.fan.service;

import java.util.List;

import com.fan.model.Article;


public interface IArticleService {
	void save(Article operator);
	void update(Article operator);
	void delete(Article operator);
	void delete(Integer id);
	Article find(Integer id);
	Article find(Integer id, String[] parameters);
	List<Article> load();
	List<Article> load(String[] parameters);
	List<Article> load(String condition, Object[] values);
	List<Article> load(String[] parameters, String condition, Object[] values);
	List<Article> load(int curPage, int limit);
	List<Article> load(String[] parameters, int curPage, int limit);
	List<Article> load(String condition, Object[] values, int curPage, int limit);
	List<Article> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Article> load(String condition, Object[] values, String order, String sort);
	List<Article> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Article> load(String order, String sort, int curPage, int limit);
	List<Article> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Article> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Article> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
	long count();
	long count(String condition, Object[] values);
	long count(String[] parameters, boolean isDistinct);
	long count(String[] parameters, String condition, Object[] values, boolean isDistinct);
	double sum(String parameter);
	double sum(String parameter, String condition, Object[] values);
	double sum(String parameter, String order, String sort, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit);
	double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct);
	
}
