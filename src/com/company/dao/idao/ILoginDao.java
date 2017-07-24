package com.company.dao.idao;

import com.company.dao.pojo.Detail;
import com.company.dao.pojo.Login;

public interface ILoginDao extends IBaseDao<Login,Integer>{
	String login(Login login);

	String registry(Login login, Detail detail);
}
