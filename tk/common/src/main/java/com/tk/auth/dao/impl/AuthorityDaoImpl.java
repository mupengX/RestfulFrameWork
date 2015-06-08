package com.tk.auth.dao.impl;

import org.springframework.stereotype.Repository;

import com.tk.framework.dao.impl.BaseDaoImpl;
import com.tk.orm.auth.dao.AuthorityDao;
import com.tk.orm.auth.model.AuthorityModel;
import com.tk.orm.auth.model.AuthorityQueryModel;

@Repository(value="authorityDao")
public class AuthorityDaoImpl extends BaseDaoImpl implements AuthorityDao {
}
