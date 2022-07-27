package org.regions;

public class RegionsView {
	
	//view
	
	
	public void view (RegionsDTO regionsDTO) {
		
//		int id =regionsDTO.getRegion_id();
//		String name = regionsDTO.getReion_name();
//		
		System.out.println("Region_ID \t Region_name");
		System.out.print(regionsDTO.getRegion_id()+"\t");
		System.out.print(regionsDTO.getReion_name());
		
		System.out.println("=================================");
		
	}

}
