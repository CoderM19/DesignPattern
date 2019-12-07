package com.example.demo.composite;

import java.util.ArrayList;
import java.util.List;

//university就是composite，可以管理college
public class University extends OrganizationComponent {

	public University(String name, String desc) {
		super(name, desc);
	}

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
	 * 输出University包含的学院
	 */
	@Override
	protected void print() {
		System.out.println("####" + getName());
		for (OrganizationComponent organizationComponent : components) {
			organizationComponent.print();
		}
	}
}
