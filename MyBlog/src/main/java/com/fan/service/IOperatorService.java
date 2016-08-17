package com.fan.service;

import java.util.List;

import com.fan.model.Operator;

public interface IOperatorService {
	void save(Operator operator);
	void update(Operator operator);
	void delete(Operator operator);
	void delete(Integer id);
	Operator find(Integer id);
	Operator find(Integer id, String[] parameters);
	List<Operator> load();
	List<Operator> load(String[] parameters);
	List<Operator> load(String condition, Object[] values);
	List<Operator> load(String[] parameters, String condition, Object[] values);
	List<Operator> load(int curPage, int limit);
	List<Operator> load(String[] parameters, int curPage, int limit);
	List<Operator> load(String condition, Object[] values, int curPage, int limit);
	List<Operator> load(String[] parameters, String condition, Object[] values, int curPage, int limit);
	List<Operator> load(String condition, Object[] values, String order, String sort);
	List<Operator> load(String[] parameters, String condition, Object[] values, String order, String sort);
	List<Operator> load(String order, String sort, int curPage, int limit);
	List<Operator> load(String[] parameters, String order, String sort, int curPage, int limit);
	List<Operator> load(String condition, Object[] values, String order, String sort, int curPage, int limit);
	List<Operator> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit);
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
	
	Operator findByAccountAndPassword(String account, String password);
}
