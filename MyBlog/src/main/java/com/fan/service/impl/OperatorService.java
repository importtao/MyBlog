package com.fan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fan.dao.OperatorDAO;
import com.fan.model.Operator;
import com.fan.service.IOperatorService;
import com.fan.util.SQLUtil;

@Service
public class OperatorService implements IOperatorService {
	@Autowired
	private OperatorDAO operatorDAO;
	
	@Override
	public void save(Operator operator) {
		operatorDAO.insert(operator);
	}
	
	@Override
	public void update(Operator operator) {
		operatorDAO.updateByPrimaryKeySelective(operator);
	}
	
	@Override
	public void delete(Operator operator) {
		operatorDAO.deleteByPrimaryKey(operator.getId());
	}
	
	@Override
	public void delete(Integer id) {
		operatorDAO.deleteByPrimaryKey(id);
	}
	
	@Override
	public Operator find(Integer id) {
		return operatorDAO.selectByPrimaryKey(id);
	}
	
	@Override
	public Operator find(Integer id, String[] parameters) {
		return operatorDAO.find(id, SQLUtil.formatParameters(parameters));
	}
	
	@Override
	public List<Operator> load() {
		return operatorDAO.select(null, null, null, null, -1, -1);
	}
	
	@Override
	public List<Operator> load(String[] parameters) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), null, null, null, -1, -1);
	}
	
	@Override
	public List<Operator> load(String condition, Object[] values) {
		return operatorDAO.select(null, SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}
	
	@Override
	public List<Operator> load(String[] parameters, String condition, Object[] values) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, -1, -1);
	}
	
	@Override
	public List<Operator> load(int curPage, int limit) {
		return operatorDAO.select(null, null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String[] parameters, int curPage, int limit) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), null, null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String condition, Object[] values, int curPage, int limit) {
		return operatorDAO.select(null, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String[] parameters, String condition, Object[] values, int curPage, int limit) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String condition, Object[] values, String order, String sort) {
		return operatorDAO.select(null, SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}
	
	@Override
	public List<Operator> load(String[] parameters, String condition, Object[] values, String order, String sort) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, -1, -1);
	}
	
	@Override
	public List<Operator> load(String order, String sort, int curPage, int limit) {
		return operatorDAO.select(null, null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String[] parameters, String order, String sort, int curPage, int limit) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), null, order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return operatorDAO.select(null, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public List<Operator> load(String[] parameters, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return operatorDAO.select(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit);
	}
	
	@Override
	public long count() {
		return operatorDAO.count(null, null, false);
	}
	
	@Override
	public long count(String condition, Object[] values) {
		return operatorDAO.count(null, SQLUtil.fillCondition(condition, values), false);
	}
	
	@Override
	public long count(String[] parameters, boolean isDistinct) {
		return operatorDAO.count(SQLUtil.formatParameters(parameters), null, isDistinct);
	}
	
	@Override
	public long count(String[] parameters, String condition, Object[] values, boolean isDistinct) {
		return operatorDAO.count(SQLUtil.formatParameters(parameters), SQLUtil.fillCondition(condition, values), isDistinct);
	}
	
	@Override
	public double sum(String parameter) {
		return operatorDAO.sum(parameter, null, null, null, -1, -1, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values) {
		return operatorDAO.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, -1, -1, false);
	}
	
	@Override
	public double sum(String parameter, String order, String sort, int curPage, int limit) {
		return operatorDAO.sum(parameter, null, order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values, int curPage, int limit) {
		return operatorDAO.sum(parameter, SQLUtil.fillCondition(condition, values), null, null, SQLUtil.getOffset(curPage, limit), limit, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit) {
		return operatorDAO.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, false);
	}
	
	@Override
	public double sum(String parameter, String condition, Object[] values, String order, String sort, int curPage, int limit, boolean isDistinct) {
		return operatorDAO.sum(parameter, SQLUtil.fillCondition(condition, values), order, sort, SQLUtil.getOffset(curPage, limit), limit, isDistinct);
	}
	
	@Override
	public Operator findByAccountAndPassword(String account, String password) {
		return operatorDAO.findByAccountAndPassword(account, password);
	}
}
