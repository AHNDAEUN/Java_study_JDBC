package org.test;

import org.countries.CoutriesDAO;
import org.regions.RegionsDAO;
import org.regions.RegionsDTO;
import org.regions.RegionsView;
import org.untill.DBconnector;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
//		DBconnector con = new DBconnector();
		
//		try {// con 연결되었는지 확인 
//			con.getConnection();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
		RegionsDAO regionsDAO = new RegionsDAO();
		
//		try {
//			regionsDAO.getList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		try {
			regionsDAO.getDegail(2);// 내가 보고 싶은 목록의 숫자를 입력
			// 결과 값: 2 , Americas
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		CoutriesDAO coutriesDAO = new CoutriesDAO();
//		try {
//			coutriesDAO.getList();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	
		RegionsView regionsView = new RegionsView();
		RegionsDTO regionsDTO =regionsDAO.getDegail(1);
		regionsView.view(regionsDTO);
	
			//coutriesDAO.getDegail2("AU");
		
	
	}

	}


