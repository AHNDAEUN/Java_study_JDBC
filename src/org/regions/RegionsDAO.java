package org.regions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.untill.DBconnector;

public class RegionsDAO {

	//2. Region에서 하나의 결과 (row)
	public RegionsDTO getDegail (int region_id) throws Exception {
	
		RegionsDTO regionsDTO =new RegionsDTO();
		//	RegionsDTO regionsDTO = null; -리턴 준비
		
		//1. DB 연결
		
		Connection con = DBconnector.getConnection();
		
	
		//2. SQL 문 작성
		
		
		String sql = "SELECT * FROM REGIONS WHERE REGION_ID = ? ";
																	// 고정되지 않은 숫자를 매개변수를 통해 불러옴 들어올 값은 ?로 처리 "
																	// "	"+region"; 를 통한 연결연산자는 하면안됨 해킹당함
		
				//3. 미리 전송
				
				PreparedStatement st =con.prepareStatement(sql);
		
		
		// 4. 물음표의 값을 세팅 
				
		 st.setInt( 1, region_id);  // st에 가서 값을 넣어줌 집어넣는건 set 
		 
		 //1) ?가 몇번째 ?인지 몇번째 순서번호(인덱스번호) 입력 ex) WHERE NUM BWTEEN ?(1) AND ?(2);
		 //oracle은 1부터 시작 
		 //2) 1번 ?의 실제 값
				
				
		//5. 초종 전송 후 결과 처리 
		
		ResultSet rs =st.executeQuery();
		// 결과값이 1개 아니면 0 이기때문에 while은 들어 올 수 없고 if를 통해 데이터를 꺼냄
		
		
		int rId;
		String rName;
		if (rs.next()) {
			
			 rId = rs.getInt(1);
			 rName = rs.getNString(2);  // 인덱스 번호나 컬럼명을 꺼내 올 수 있음 
			 
			regionsDTO.setRegion_id(rId);
			regionsDTO.setReion_name(rName);
			
			
//			System.out.println(rid);
//			System.out.println(rname);
			
			
			
			
			
		}
		// 자원해제 
		
		DBconnector.disconnect(rs, st, con);
		return regionsDTO;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	//1. Regionsㅣ의 모든 데이터 가져오기 
	
	public void getList() throws Exception {
		
	Connection con =  DBconnector.getConnection();
		
		//2..Quesry문 작성
		String sql = "SELECT * FROM REGIONS";
		
		//
	//2.Quesry문  미리 전송

	PreparedStatement st =  con.prepareStatement(sql);
	//con.PreparedStatement(sql);
	
	//4번
	
	// 5번  최종 전송 후 결과를 처리 
	
	ResultSet rs = st.executeQuery(); // 최종실행
	
	while (rs.next()) {
		
	int id=	rs.getInt("Region_id"); //컬럼 label => 뽑고 싶은 컬럼명을 문자열로 가져오는 것 
		String name = rs.getString("Region_name");
	
		System.out.println(id);
		System.out.println(name);
		
	 
	
	}
// 자원해제 	
	DBconnector.disconnect(rs, st, con);
	
	
	}
	
}
