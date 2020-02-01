package com.kk.test;

import java.util.ArrayList;
import java.util.List;

import com.kk.bean.User;

public class CommonTest {
	
	private static List<User> userCache = new ArrayList<User>();

	public static void main(String[] args) {
		User user = new User();
		user.setName("kang");
		user.setAge(12);
		userCache.add(user);
		System.out.println(userCache);

	}

}
