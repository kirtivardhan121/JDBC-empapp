package com.ustglobal.empapp;

import java.util.List;
import java.util.Scanner;

import com.ustglobal.empapp.dao.EmployeeDAO;
import com.ustglobal.empapp.dao.EmployeeDAOImpl;
import com.ustglobal.empapp.dto.EmployeeBean;
import com.ustglobal.empapp.util.EmployeeManager;

public class App {

	public static void main(String[] args) {

		System.out.println("Press 1 to get all Employee data");
		System.out.println("Press 2 to insert all Employee data");
		System.out.println("Press 3 to update all Employee data");
		System.out.println("Press 4 to delete all Employee data");
		System.out.println("Press 5 to search single Employee data");

		Scanner scn = new Scanner(System.in);
		int ch = scn.nextInt();

		switch (ch) {

		case 1:

			/* UP-Casting EmployeeDAOImpl class object to EmployeeDAO interface 
			 * by calling factory method getEmployeeDAO() present in factory 
			 * class EmployeeManager.
			 */

			EmployeeDAO dao = EmployeeManager.getEmployeeDAO();
			List<EmployeeBean> result = dao.getAllEmployeeData();

			for(EmployeeBean bean : result) {
				System.out.println("Id: " +bean.getId());
				System.out.println("Name: " +bean.getName());
				System.out.println("Salary: " +bean.getSal());
				System.out.println("Gender: " +bean.getGender());
				System.out.println("****************************");
			}
			break;

		case 2:

			/* UP-Casting EmployeeDAOImpl class object to EmployeeDAO interface 
			 * by calling factory method getEmployeeDAO() present in factory 
			 * class EmployeeManager.
			 */

			EmployeeDAO dao2 = EmployeeManager.getEmployeeDAO();

			System.out.println("Enter data");
			System.out.println("Enter Id:");
			int insertId = scn.nextInt();
			System.out.println("Enter Name: ");
			String insertName = scn.next();
			System.out.println("Enter Salary: ");
			int insertSal = scn.nextInt();
			System.out.println("Enter Gender: ");
			String insertGender = scn.next();

			dao2.insertEmployeeData(insertId, insertName, insertSal, insertGender);
			break;

		case 3:

			break;

		case 4:

			break;

		case 5:

			/* UP-Casting EmployeeDAOImpl class object to EmployeeDAO interface 
			 * by calling factory method getEmployeeDAO() present in factory 
			 * class EmployeeManager.
			 */

			EmployeeDAO dao5 = EmployeeManager.getEmployeeDAO();
			System.out.println("Enter id to fetch the data: ");
			int id = scn.nextInt();
			EmployeeBean bean = dao5.searchEmployeeData(id);

			if(bean!=null) {
				System.out.println("Id: " +bean.getId());
				System.out.println("Name: " +bean.getName());
				System.out.println("Salary: " +bean.getSal());
				System.out.println("Gender: " +bean.getGender());
				System.out.println("****************************");

			} else {
				System.out.println("No Data Found");
			}

			break;

		}//end of switch case


	}//end of main()
}//end of APP
