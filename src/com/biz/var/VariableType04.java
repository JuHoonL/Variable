package com.biz.var;

public class VariableType04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char charAlpha = 'A';
		char charNum = '0';
		char charSpec = '%';
		char charSpace = ' ';
		
		System.out.println(charAlpha);
		System.out.println(charNum);
		System.out.println(charSpec);
		System.out.println(charSpace);
		System.out.println();
		
		// char 문자형 변수값을 int형 변수에 복사하면 해당 문자의 ASCII코드가 복사 된다.
		int intAlpha = charAlpha;
		int intNum = charNum;
		int intSpec = charSpec;
		int intSpace = charSpace;
		
		System.out.println("===int char===");
		System.out.println(intAlpha);
		System.out.println(intNum);
		System.out.println(intSpec);
		System.out.println(intSpace);
		System.out.println();
		
		System.out.println((char)(charAlpha + charNum)); 
		/*
		 *  캐릭터형은 연산불가능 (인식안됌)
		 *  예> System.out.println((char)charAlpha + (char)charNum); (X)
		 *  	System.out.println((char)(charAlpha + charNum)); (O)
		 *   위 와 같이 ASCII코드로 연산을 시킨후 그 코드의 문자열을 보여달라고해야 인식을 함.
		 */
		System.out.println(charAlpha + charSpec);
		System.out.println(charAlpha + charSpace);
		System.out.println();
		
		int intSQ = charAlpha + 20;
		System.out.println(intSQ);
		
		System.out.println((char)intSQ);
		
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println((char)intAlpha++);
		System.out.println();
		
		intAlpha = charAlpha;
		System.out.println((char)intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		System.out.println((char)++intAlpha);
		
		

	}

}
