package com.fan.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import com.fan.model.Operator;
import com.fan.util.DataUtil;
import com.fan.util.XSSUtil;

public class OperatorDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer id;
	@NotEmpty
	@Length(min = 1, max = 16)
	private String name;
	@Length(min = 32, max = 32)
	private String password;
	@NotNull
	private Integer roleId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : XSSUtil.htmlspecialchars(name.trim());
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : DataUtil.stringMD5(password.trim());
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Operator toModel() {
		Operator model = new Operator();
		model.setId(id);
		model.setName(name);
		model.setPassword(password);
		model.setRoleId(roleId);
		return model;
	}
}
