package com.kk.think.user.domain;

public class Account {
	private Long id;
	private String name;
	private String password;
	private String budgetExpenseType;
	private Integer budgetExpenseAmount;
	private String budgetIncomeType;
	private Integer budgetIncomeAmount;
	private Integer initialValue;
//	private List<Category> categoryList;
//	private Group group;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
