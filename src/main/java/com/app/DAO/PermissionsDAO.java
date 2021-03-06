package com.app.DAO;

import java.util.List;

import com.app.pojo.Permissions;


public interface PermissionsDAO {
	
	public void create(Permissions permissions);
	public void update(Permissions teacher);
	public Permissions edit(int id);
	public void delet(int id );
	public Permissions find(int id);
	public List<Permissions> getall();
	

}
