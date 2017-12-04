package com.mvc.model;

public class PayTable extends Salary implements Calculate, Output{
	public PayTable() {
		super();
	}
	public PayTable(String name, long pay, int family, int overtime) {
		super(name, pay, family, overtime);

	}
	@Override
	public void calc() {
		if(getFamily()<3){
			setFamilyP(getFamily()*20000);
		} else {
			setFamilyP(60000);
		}
		setOvertimeP(getOvertime()*5000);
		setTax((long) (getPay()*0.1));
		setIncenP((long) (getPay()*getIncentive()));
		setTotalPay(getPay()+getFamilyP()+getIncenP()+getOvertimeP()-getTax());
	}
	@Override
	public void out() {
		System.out.printf("%s\t%d\t%d\t%d\t%d\t%d\t%d\t%1.1f\t\t%d\t%d\n"
				,getName(),(int)getPay(),getFamily(),(int)getFamilyP(),getOvertime()
				,(int)getOvertimeP(),(int)getTax(),(double)getIncentive(),(int)getIncenP(),(int)getTotalPay());
/*        **** 급여명세서 ****
---------------------------------------------------------------------------------------------------
이름      기본급    가족수   가족수당   시간외근무  시간외수당 세금  인센티브(%)  성과금   실수령액
---------------------------------------------------------------------------------------------------
소서노    750000       2      40000          3       15000    75000    0.5       375000  1105000
고주몽    800000       1      20000          4       20000    80000    0.5       400000  1160000
모팔모    650000       6      60000          2       10000    65000    0.5       325000   980000
---------------------------------------------------------------------------------------------------
인원수 : 3명*/
	}
/*	private String name; 	//이름
	private long pay;  	//기본급      
	private long familyP;	//가족수당    
	private long overtimeP;	//시간외수당   
	private long incenP;	//성과금   
	private long tax;		//세금  
	private long totalPay;	//실수령액
	private int family; 	//가족수    
	private int overtime;	//초과근무시간
    private static float incentive = 0.5f; //인센티브 - 초기값(0.5)
    private static int count = 0;       //총인원 - 초기값(0)
*/
}
