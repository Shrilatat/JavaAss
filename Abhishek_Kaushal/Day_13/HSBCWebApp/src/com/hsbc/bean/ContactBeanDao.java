package com.hsbc.bean;

import java.util.ArrayList;
import java.util.List;

public class ContactBeanDao {

	static List<ContactBean> list = new ArrayList<>();

	public void addList(ContactBean cb) {
		list.add(cb);
	}
	
	public void deleteList(ContactBean cb) {
		list.remove(cb);
	}

	public List<ContactBean> getList() {
		return list;
	}

	public void setList(List<ContactBean> list) {
		this.list = list;
	}

}
