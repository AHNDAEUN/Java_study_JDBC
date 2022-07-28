package org.regions;

import javax.management.loading.PrivateClassLoader;

public class RegionsDTO {
	
	// 메서드에서 만들어진 내용을 보내기 위해서  리턴해야함 
	// 그런데 꺼낼 수 있는 건 1개 만 가능 2개를 꺼내기 위해선 DTO를 사용해야 함 
		
	

	//멤버변수 접근지정자 : private
	// getter ,setter
	// 기본생성자 필수
	//region 값을 
	//멤버변수명은 table의 컬럼명과 동이하게 선언 
	
	
	private Integer region_id;  // null값이 생략되어 있을수도 있기때문에 레퍼런스값으로 설정하기
	private String region_name;
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}

	
	
	
	
	
	
	
	
	
	
}
