package org.countries;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.untill.DBconnector;

public class CoutriesDAO {




	public void getDeail2(String Country_id) throws Exception {
		
		CountriesDTO countriesDTO = new CountriesDTO();
		
		Connection con = DBconnector.getConnection();
		
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID= ?";
		
		
		PreparedStatement st =con.prepareStatement(sql);

		 st.setString( 1, Country_id); 
		 
			ResultSet rs =st.executeQuery();

			if (rs.next()) {
				
				
				String id = rs.getString("Country_id");  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
				String name = rs.getString("Country_name");  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
				int r_id = rs.getInt("Region_id");  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
				
				System.out.println(id);
				System.out.println(name);
				System.out.println(r_id);
				
			}
		 DBconnector.disconnect(rs, st, con);
		 
			
	}
	
	
	
	
	public void getList()  throws Exception{
		
		//1. DB 연결
		//2. SQL 작성
		//3. 미리보내기
		//4.최종전성후 결과처리 
		
		
		Connection con = DBconnector.getConnection();  //DB 연결 STATIC 메서드라 생성자없이 객체 생성
		
		String sql = "SELECT * FROM COUNTRIES"; // 		//2. SQL 작성
		
		PreparedStatement st = con.prepareStatement(sql); // 미리보내기 
		
	//	System.out.println(st);
		
		ResultSet rs = st.executeQuery(); //4.최종전성후 결과처리
	//	최종결과는 ResultSet에 담고 쿼리를 execute(실행) 한다
		
	while ( rs.next()) {// next 한 줄 읽어오기 
		
		String cid =rs.getString("Country_id");		
		String cname =rs.getString("Country_name");		
		int rid =rs.getInt("Region_id");		
		
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(rid);
		
	}// console 결과가 꺼내올때마다 순서가 다름 유지되지 않음  / 원하는대로 꺼내려면 정렬해야함 
		
	
	DBconnector.disconnect(rs, st, con);
	}
	
	
	
}
