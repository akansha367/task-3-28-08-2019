package com.bank.atmcard;

public class HdfcCard implements AtmCards{
	public void generatepin() {
		System.out.println("Generating pin");
		}

	@Override
	public void createpin() {
		System.out.println("Creating pin");
		
		
	}

	@Override
	public void withdrawmoney() {
		System.out.println("Withdrawing money");
		
	}
	
	

}
