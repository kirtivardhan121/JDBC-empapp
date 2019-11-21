package com.ustglobal.empapp.dao;

import java.util.List;

import com.ustglobal.empapp.dto.EmployeeBean;

public interface EmployeeDAO {

	public List<EmployeeBean> getAllEmployeeData();
	public EmployeeBean searchEmployeeData(int id);
	public void insertEmployeeData(int id, String name, int sal, String gender);
	public int updateEmployeeData(EmployeeBean bean);
	public int deleteEmployeeData(int id);
}
