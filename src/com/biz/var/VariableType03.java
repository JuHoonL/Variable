package com.biz.var;

public class VariableType03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// boolean 형에 대해 고찰
		
		// boolean은 비교 연산자를 통해 나온 결과
		int intNum1 = 30;
		int intNum2 = 40;
		
		boolean bNum;
		
		bNum = intNum1 < intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 > intNum2;
		System.out.println(bNum);
		
		bNum = intNum1 == intNum2;
		System.out.println(bNum);
		
		bNum = (intNum1 <= intNum2); // 오류가 날떄는 ()를 넣어준다. 예> (intNum1 <= intNum2);
		System.out.println(bNum);
		
		bNum = (intNum1 >= intNum2);
		System.out.println(bNum);
		
	}

}
