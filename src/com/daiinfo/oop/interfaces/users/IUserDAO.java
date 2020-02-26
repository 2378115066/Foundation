package com.daiinfo.oop.interfaces.users;

import java.beans.DefaultPersistenceDelegate;
import java.util.List;
import java.util.concurrent.Delayed;

public interface IUserDAO {
	public int add();

	public int delete();

	public int update();

	public List query();

}
