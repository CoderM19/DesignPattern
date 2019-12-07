package com.example.demo.composite;

public class Department extends OrganizationComponent {

	public Department(String name, String desc) {
		super(name, desc);
	}

	// add,remove方法不用写，因为它是叶子节点
	@Override
	public String getDesc() {
		return super.getDesc();
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	protected void print() {
		System.out.println("###############" + getName());
	}

}
