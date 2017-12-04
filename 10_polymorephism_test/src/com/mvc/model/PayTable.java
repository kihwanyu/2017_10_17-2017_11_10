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
/*        **** �޿����� ****
---------------------------------------------------------------------------------------------------
�̸�      �⺻��    ������   ��������   �ð��ܱٹ�  �ð��ܼ��� ����  �μ�Ƽ��(%)  ������   �Ǽ��ɾ�
---------------------------------------------------------------------------------------------------
�Ҽ���    750000       2      40000          3       15000    75000    0.5       375000  1105000
���ָ�    800000       1      20000          4       20000    80000    0.5       400000  1160000
���ȸ�    650000       6      60000          2       10000    65000    0.5       325000   980000
---------------------------------------------------------------------------------------------------
�ο��� : 3��*/
	}
/*	private String name; 	//�̸�
	private long pay;  	//�⺻��      
	private long familyP;	//��������    
	private long overtimeP;	//�ð��ܼ���   
	private long incenP;	//������   
	private long tax;		//����  
	private long totalPay;	//�Ǽ��ɾ�
	private int family; 	//������    
	private int overtime;	//�ʰ��ٹ��ð�
    private static float incentive = 0.5f; //�μ�Ƽ�� - �ʱⰪ(0.5)
    private static int count = 0;       //���ο� - �ʱⰪ(0)
*/
}
