package org.countries;

import java.nio.ReadOnlyBufferException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.regions.RegionsDTO;
import org.untill.DBconnector;

public class CoutriesDAO {

	
				//set Country 
	
		public int setCoutries(CountriesDTO countriesDTO) throws Exception{
			
			//1. DB 연결
			
			Connection con = DBconnector.getConnection();

			
			//2. SQL문 작성
			
			String sql = "INSERT INTO COUNTRIES VALUES(?,?,?)";
			
			// 3. 미리 전송
			
			PreparedStatement  st = con.prepareStatement(sql);
			
			//4. ? 셋팅
			
			 st.setString(1, countriesDTO.getCountry_id());
			 st.setString(2, countriesDTO.getCountry_name());
			 st.setInt(3, countriesDTO.getRegion_id());
			 
			 int result1 =st.executeUpdate();
			 
			 
			// 6. 자원해제 
			 DBconnector.disConnect(st, con);
			 return result1;
			 
			
		}
	
	
	
	
	

			//getDetail : countris_id

	public CountriesDTO getDetail(String Country_id) throws Exception {
		
		CountriesDTO countriesDTO =null;
		
		//디비연결
		Connection con = DBconnector.getConnection();
		
		
		//SQL 작성
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_ID= ?";
		
		//미리보기
		PreparedStatement st =con.prepareStatement(sql);
		
		//갑세팅
		 st.setString( 1, Country_id); 
		 // 최종 전송 및 결과처리
			ResultSet rs =st.executeQuery();

			if (rs.next()) {
				
			 countriesDTO = new CountriesDTO();
			
			countriesDTO.setCountry_id(rs.getString("country_id"));
			countriesDTO.setCountry_name(rs.getString("country_name"));
			countriesDTO.setRegion_id(rs.getInt("region_id"));
			
			
//				String id = rs.getString("Country_id");  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
//				String name = rs.getString("Country_name");  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
//				int r_id = rs.getInt("Region_id");  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
				
//				System.out.println(id);
//				System.out.println(name);
//				System.out.println(r_id);
				
			}
		 DBconnector.disconnect(rs, st, con);
		 
			return countriesDTO;
	}
	
	
	
	
//	public void getList()  throws Exception{
//		
//		//1. DB 연결
//		//2. SQL 작성
//		//3. 미리보내기
//		//4.최종전성후 결과처리 
//		
//		
//		Connection con = DBconnector.getConnection();  //DB 연결 STATIC 메서드라 생성자없이 객체 생성
//		
//		String sql = "SELECT * FROM COUNTRIES"; // 		//2. SQL 작성
//		
//		PreparedStatement st = con.prepareStatement(sql); // 미리보내기 
//		
//	//	System.out.println(st);
//		
//		ResultSet rs = st.executeQuery(); //4.최종전성후 결과처리
//	//	최종결과는 ResultSet에 담고 쿼리를 execute(실행) 한다
//		
//	while ( rs.next()) {// next 한 줄 읽어오기 
//		
//		String cid =rs.getString("Country_id");		
//		String cname =rs.getString("Country_name");		
//		int rid =rs.getInt("Region_id");		
//		
//		System.out.println(cid);
//		System.out.println(cname);
//		System.out.println(rid);
//		
//	}// console 결과가 꺼내올때마다 순서가 다름 유지되지 않음  / 원하는대로 꺼내려면 정렬해야함 
//		
//	
//	DBconnector.disconnect(rs, st, con);

	public ArrayList<CountriesDTO> getList(String search) throws Exception {
		ArrayList<CountriesDTO> ar = new ArrayList();
		
		//1. DB 연결
		Connection con = DBconnector.getConnection();
		
		//2. SQL 작성
		String sql = "SELECT * FROM COUNTRIES WHERE COUNTRY_NAME KIKE ?";
		
		//3. 미리보내기
		PreparedStatement st = con.prepareStatement(sql);
		
		st.setString(1,"%+ search +%");
		
		//4. 최종전송 후 결과 처리
		ResultSet rs = st.executeQuery();
		
		while(rs.next()) {
			CountriesDTO countriesDTO = new CountriesDTO();
			countriesDTO.setCountry_id(rs.getString("country_id"));
			countriesDTO.setCountry_name(rs.getString("country_name"));
			countriesDTO.setRegion_id(rs.getInt("region_id"));
			ar.add(countriesDTO);
			
		}
		
		DBconnector.disconnect(rs, st, con);
		
		return ar;
	
	
	
	
	}
	
	
	}

