package org.employees;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.untill.DBconnector;

public class EmployeesDAO {
	
	
	
	public void getSalaryInfo() throws Exception{
		
		// 1. DB연결 
		// 2. SQL 작성
		// 3. 미리 보기
		// 4. ? 있으면 값 세팅
		// 5. 최종전송 후 결과처리
		// 6. 자원 해제
		
		//DB 연결
		
		Connection con =DBconnector.getConnection();
	
		//SQL 작성
		
		String sql = "SELECT SUM(SALARY), AVG(SALARY), MAX(SALARY) AS MAX FROM EMPLOYEES "; //커리문 안에 ;은 찍지 않음 알아서 생략으로 되어 있음 
	
		//미리보기
		
		PreparedStatement st =con.prepareStatement(sql);
		
		// 최종 전송 후 결과 처리
		
		ResultSet rs =st.executeQuery();// 셀렉트의 결과값을 ResultSet가 담고 
			// ArrayList<objaect> 다른 타입이라 묶으려면 오브젝트 타입에 넣어야함
				// 꺼낼때 다형성 - 바꾸면서 나와야함 
		
		
		if (rs.next()) { // 데이터가있으면 꺼내자 
		//rs.next()//무조건 오는 경우는
		int sum = rs.getInt("SUM(SALARY)");
			double avg = rs.getDouble(2);
			int max = rs.getInt("MAX");
         //가지고 온 결과물이 DTO에 선언이 안되어 있을때 
		
			
			
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(max);
		
		
		}
		// 자원 해제 
		
		DBconnector.disconnect(rs, st, con);
		
		
		
	}

}

