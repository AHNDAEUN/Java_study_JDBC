package org.regions;

import java.util.ArrayList;

public class RegionsView {
	
	public void view(ArrayList<RegionsDTO> ar) {
		System.out.println("REGION_ID\t REGION_NAME");
		System.out.println("-------------------------------");
		for(RegionsDTO regionsDTO:ar) {
			System.out.print(regionsDTO.getRegion_id()+"\t\t ");
			System.out.println(regionsDTO.getRegion_name());
			System.out.println("-------------------------------");
		}
		
	}
	
	
	
	//view
	
	
	public void view (RegionsDTO regionsDTO) {
		
//		int id =regionsDTO.getRegion_id();
//		String name = regionsDTO.getReion_name();
//		
		System.out.println("REGION_ID\t REGION_NAME");
		System.out.println("-------------------------------");
		System.out.print(regionsDTO.getRegion_id()+"\t\t ");
		System.out.println(regionsDTO.getRegion_name());
		System.out.println("-------------------------------");
	}

}
