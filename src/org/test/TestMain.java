package org.test;

import java.util.ArrayList;

import org.countries.CountriesDTO;
import org.countries.CoutriesDAO;
import org.employees.EmployeesDAO;
import org.regions.RegionsDAO;
import org.regions.RegionsDTO;
import org.regions.RegionsView;
import org.untill.DBconnector;

public class TestMain {

//	public static void main(String[] args) throws Exception {
//		// TODO Auto-generated method stub
//		
////		DBconnector con = new DBconnector();
//		
////		try {// con 연결되었는지 확인 
////			con.getConnection();
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
//		RegionsDAO regionsDAO = new RegionsDAO();
//		
////		try {
////			regionsDAO.getList();
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//		
//		try {
//			regionsDAO.getDegail(2);// 내가 보고 싶은 목록의 숫자를 입력
//			// 결과 값: 2 , Americas
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		CoutriesDAO coutriesDAO = new CoutriesDAO();
////		try {
////			coutriesDAO.getList();
////		} catch (Exception e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
//		
//	
//		RegionsView regionsView = new RegionsView();
//		RegionsDTO regionsDTO =regionsDAO.getDegail(1);
//		regionsView.view(regionsDTO);
//		coutriesDAO.getDetail("KO");
			
public static void main(String[] args) {
	
		EmployeesDAO employeesDAO = new EmployeesDAO();
		RegionsDAO regionsDAO = new RegionsDAO();
		CoutriesDAO countriesDAO = new CoutriesDAO();
		RegionsView regionsView = new RegionsView();
		try {
			ArrayList<RegionsDTO> ar = regionsDAO.getList();
			
			//regionsView.view(ar);
			//countriesDAO.getList();
			//RegionsDTO regionsDTO = regionsDAO.getDetail(2);
			//regionsView.view(regionsDTO);
			//countriesDAO.getDetail("KO");
			// employeesDAO.getSalaryInfo();
			
			
			//--------------------------------------------
//			RegionsDTO regionsDTO =new RegionsDTO();
//			regionsDTO.setRegion_id(8);
//			regionsDTO.setRegion_name("aaa"); // 한번 넣을때마다 다른 값을 넣어줘야함 , 같은 값을 또 넣으면 무결성 제야ㄱ조건 (hr.reg_id_pk)에 위배된다고 뜸 
//			int result = regionsDAO.setRegion(regionsDTO); //1 이면 성공 
//			
//			if (result >0 ) {
//				
//				System.out.println("성공");
//			}else
//				System.out.println("실패");
			//-------------------------------------------------------
			
					CountriesDTO countriesDTO = new CountriesDTO();
					countriesDTO.setCountry_id("AS");
					countriesDTO.setCountry_name("a deade");
					countriesDTO.setRegion_id(3);
					int result1 = countriesDAO.setCoutries(countriesDTO);
			
					if(result1>0) {
						
						System.out.println("성공");
						
						
					} else {
						
						System.out.println("실패");
					}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
	
	}

	}


