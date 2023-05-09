package com.CarBrand.Class;

public class Brand {
	 String brandname;
	 String version;
	
	
	public Brand(String brandname, String version) {
		this.brandname = brandname;
		this.version = version;
		
	}


	public void getBrand()
	{
		System.out.println("Brand name :" +brandname + " | " +"version :" +version);
	}
}
