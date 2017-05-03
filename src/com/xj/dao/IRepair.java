package com.xj.dao;

import java.util.List;

import com.xj.vo.Repair;

public interface IRepair {

	public List<Repair> QueryAllRepair();

	public Repair QueryRepairByID(String id);

	public void InsertRepair(Repair r);

	public void DeleteRepair(String id);

	public void UpdateRepair(Repair r);
	
	public List<Repair> QueryByUser(String u);
	
	public List<Repair> querryAllNo();
	
	public List<Repair> querryAllU(String u);
	
	public boolean updateOne(Object a,Object b,String c);
	
}
