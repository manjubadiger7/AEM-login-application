package com.adobe.aem.core.dao.impl;

import java.sql.Connection;

import com.adobe.aem.core.dao.LoginDao;
import com.adobe.aem.core.utility.DButil;

public class LoginDaoImpl implements LoginDao {

	@Override
	public boolean checkLogin(String userName, String password) {

		Connection connection = DButil.getConnection();

		return false;

	}

}
