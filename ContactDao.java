package com.hsbc.bean;

import java.util.*;

public class ContactDao {
	List<ContactBean> cb = new ArrayList();
	
	
	public List<ContactBean> addContact(ContactBean c)
	{
		cb.add(c);
		return cb;
	}
}
