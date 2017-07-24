package com.company.service.iservice;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface ILoginService extends IBaseService<Login, Integer>{
	String login(Login login);

	String registry(Login login, Detail detail);
}
