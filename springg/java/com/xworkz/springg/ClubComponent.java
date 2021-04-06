package com.xworkz.springg;

public class ClubComponent {
	private String trustName;

	public ClubComponent(String trustName) {
		super();
		System.out.println("created param constructor,arg1"+ trustName);
		this.trustName = trustName;
	}
	public String getTrustName() {
		return trustName;
	}
	
	

}
