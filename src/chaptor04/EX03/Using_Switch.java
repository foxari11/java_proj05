package chaptor04.EX03;

public class Using_Switch {

	public static void main(String[] args) {
		// switch 문 - 반드시 break 를 사용 해서 해당 case를 탈출

		// 1. switch 구문에서 break;를 사용하지 않는 경우 
		// 해당 case로 점프 후에 하위의 모든 case를 실행
		// break; 해당 실행문을 빠져 나온다.
		int a = 5;
		
		switch (a) { //(위치변수) : 정수, 문자, 문자열
		case 1: 
			System.out.println("변수 값을 출력"+a);
		case 2:
			System.out.println("변수 값을 출력"+a);
			break;
		case 3:
			System.out.println("변수 값을 출력"+a);
		case 4:
			System.out.println("변수 값을 출력"+a);
		default: // if 문의 else와 같이 case 의 값이 없는 모든 경우
			System.out.println("변수 값을 출력"+a);
			
		}
		
		System.out.println("====================");



// 2. switch 문에서 break; 사용   <== 일반적으로 사용
		
		 a = 4;
		
		switch (a) { //(위치변수) : 정수, 문자, 문자열
		case 1: 
			System.out.println("case 1을 출력"+a);
			break;
		case 2:
			System.out.println("case 2을 출력"+a);
			break;
		case 3:
			System.out.println("case 3을 출력"+a);
			break;
		case 4:
			System.out.println("case 4을 출력"+a);
			break;
		default: // if 문의 else와 같이 case 의 값이 없는 모든 경우
			System.out.println("default을 출력"+a);
			break;       // default 에서 break는 일반적으로 생략 
		
		
		}

         //7 점이상인 경우 pass , 그렇지 않는 경우 fail 
		System.out.println("===================");
		int b = 8;
		
		switch (b) {
		case 10 : 
			System.out.println("Pass");
			break;
		case 9: 
			System.out.println("Pass");
			break;
		case 8: 
			System.out.println("Pass");
			break;
		case 7: 
			System.out.println("Pass");
			break;
        default: 
			System.out.println("Fail");
			break;
			
			
		
		
		
		}
		
		System.out.println("========축약표현=============");
		//축약 표현 
		b = 6 ;
		switch (b) { 
		case 10 : case 9 : case 8: case 7:
			System.out.println("Pass");
			break;
		default :
			System.out.println("Fail");
			
		}
		System.out.println("=====================");
		
		//switch문 <=========> if ~ else if 문과 상호 변환 가능
		
		
		int c = 8 ; 
		
		switch (c) { 
		case 10: case 9: 
			System.out.println("A 학점");
			break;
		case 8:  
			System.out.println("B 학점");
			break;
		case 7:
			System.out.println("C 학점");
			break;
		default :
			System.out.println("D 학점");
			
		}
		 
		// 위 구문을 if else if 문으로 변환
		c = 7;
		if (c > 9) {
			System.out.println("A 학점");
		}else if (c == 8) {
			System.out.println("B 학점");
		}else if (c == 7) {
			System.out.println("C 학점");  //실행후 if문을 빠져나온다(break 안씀) 
		}else {
			System.out.println("D 학점");
			
		}
		
         }
	
	
}