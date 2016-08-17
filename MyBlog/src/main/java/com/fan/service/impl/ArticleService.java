package com.fan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fan.dao.ArticleDAO;
import com.fan.model.Article;
import com.fan.service.IArticleService;
import com.fan.util.SQLUtil;

@Service
public class ArticleService implements IArticleService {
	@Autowired
	private ArticleDAO articleDAO;
	
	@Override
	public void save(Article article) {
		articleDAO.insert(article);
	}
	
	@Override
	public void update(Article article) {
		articleDAO.updateByPrimaryKeySelective(article);
	}
	
	@Override
	public void delete(Article article) {
		articleDAO.deleteByPrimaryKey(article.getId());
	}
	
	@Override
	public void delete(Integer id) {
		articleDAO.deleteByPrimaryKey(id);
	}
	
	@Override
	public Article find(Integer id) {
		return articleDAO.selectByPrimaryKey(id);
	}
	
	@Override
	public Article find(Integer id, String[] parameters) {
		return articleDAO.find(id, SQLUtil.formatParameters(parameters));
	}
	
	@Override
	public List<Article> load() {
		return articleDAO.select(null, null, null, null, -1, -1);
	}
	
	@Override
	public List<Article> load(String[] parameters) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}
	
	@Override
	public List<Article> load(String condition, Object[] values) {
		return articleDAO.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}
	
	@Override
	public List<Article> load(String[] parameters, String condition, Object[] values) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}
	
	@Override
	public List<Article> load(int curPage, int limit) {
		return articleDAO.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String[] parameters, int curPage, int limit) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String condition, Object[] values, int curPage, int limit) {
		return articleDAO.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String condition, Object[] values, String order, String sort) {
		return articleDAO.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}
	
	@Override
	public List<Article> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}
	
	@Override
	public List<Article> load(String order, String sort, int curPage, int limit) {
		return articleDAO.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return articleDAO.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Article> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return articleDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public long count() {
		return articleDAO.count(null, null, false);
	}
	
	@Override
	public long count(String condition, Object[] values) {
		return articleDAO.count(null, SQLUtil.fillCondition(condition, values), false);
	}
	
	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return articleDAO.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}
	
	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return articleDAO.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}
	
	@Override
	public double sum(String parameter) {
		return articleDAO.sum(parameter, null, null, null, -1, -1, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return articleDAO.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}
	
	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return articleDAO.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return articleDAO.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return articleDAO.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return articleDAO.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}
}
