package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

public class College extends OrganizationComponent {

	public College(String name, String desc) {
		super(name, desc);
	}

	// 存放的是department
	List<OrganizationComponent> components = new ArrayList<OrganizationComponent>();

	@Override
	protected void add(OrganizationComponent organizationComponent) {
		components.add(organizationComponent);
	}

	@Override
	protected void remove(OrganizationComponent organizationComponent) {
		components.remove(organizationComponent);
	}

	@Override
	public String getName() {
		return super.getName();
	}

	@Override
	public String getDesc() {
		return super.getDesc();
	}

	/**
	 * 输出College包含的院系
	 */
	@Override
	protected void print() {
		System.out.println("########" + getName());
		for (OrganizationComponent organizationComponent : components) {
			organizationComponent.print();
		}
	}
}