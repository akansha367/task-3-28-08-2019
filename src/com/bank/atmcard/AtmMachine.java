package com.bank.atmcard;

public class AtmMachine {
	AtmCards atm;
	public void SetData(AtmCards atm) {
		this.atm=atm;
	}
public void gp() {
	atm.generatepin();
}
public void cp() {
	atm.createpin();
	
}
public void wm() {
	atm.withdrawmoney();
}
public static void main(String[]args) {
	AtmMachine atmm=new AtmMachine();
	atmm.SetData(new SbiCard());
	atmm.gp();
	atmm.cp();
	atmm.wm();
			
}
}
