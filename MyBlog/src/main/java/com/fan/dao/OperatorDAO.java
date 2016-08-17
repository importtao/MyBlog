package com.fan.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.fan.model.Operator;

public interface OperatorDAO {
	/**
	 * 删除实体
	 * @param id 实体ID
	 * @return 影响行数
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * 插入实体（可插入null）
	 * @param record 实体对象
	 * @return 影响行数
	 */
	int insert(Operator record);

	/**
	 * 插入实体
	 * @param record 实体对象
	 * @return 影响行数
	 */
	int insertSelective(Operator record);

	/**
	 * 查询实体
	 * @param id 实体ID
	 * @return 实体
	 */
	Operator selectByPrimaryKey(Integer id);

	/**
	 * 更新实体
	 * @param record 实体对象
	 * @return 影响行数
	 */
	int updateByPrimaryKeySelective(Operator record);

	/**
	 * 更新实体（可插入null）
	 * @param record 实体对象
	 * @return 影响行数
	 */
	int updateByPrimaryKey(Operator record);

	/**
	 * 查询
	 * @param parameters 查询字段
	 * @param condition 条件
	 * @param order 排序字段
	 * @param sort 排序方式
	 * @param offset 起始位置
	 * @param limit 查询条数
	 * @return 实体列表
	 */
	List<Operator> select(@Param("parameters") String parameters, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit);

	/**
	 * 计数
	 * @param parameters 统计字段
	 * @param condition 条件
	 * @param isDistinct 是否去重
	 * @return 计数结果
	 */
	long count(@Param("parameters") String parameters, @Param("condition") String condition, @Param("isDistinct") boolean isDistinct);

	/**
	 * 求和
	 * @param parameter 统计字段
	 * @param condition 条件
	 * @param order 排序字段
	 * @param sort 排序方式
	 * @param offset 起始位置
	 * @param limit 查询条数
	 * @param isDistinct 是否去重
	 * @return 求和结果
	 */
	double sum(@Param("parameter") String parameter, @Param("condition") String condition, @Param("order") String order, @Param("sort") String sort, @Param("offset") int offset, @Param("limit") int limit, @Param("isDistinct") boolean isDistinct);

	/**
	 * 查询实体
	 * @param id 实体ID
	 * @param parameters 查询字段
	 * @return 实体
	 */
	Operator find(@Param("id") Integer id, @Param("parameters") String parameters);

	Operator findByAccountAndPassword(@Param("account") String account, @Param("password") String password);
}
