package prob2;

import java.util.Scanner;

public class Prob2 {
	public static void main(String[] args) {
		/* 구현코드 */
//		int[] array={50000,10000,5000,1000,500,100,50,10,5,1};
		Scanner scanner=new Scanner(System.in);
		int money;
		int res;
		
		System.out.print("금액: ");
		money=scanner.nextInt();
		
		res=money/50000;
		if(res>0){
			System.out.println("5만원  : "+res+"개");
		}
		money=money%50000;
		res=money/10000;
		
		if(res>0){
			System.out.println("1만원 : "+res+"개");
		}
		money=money%10000;
		res=money/5000;
		
		if(res>0){
			System.out.println("5천원 : "+res+"개");
		}
		money=money%5000;
		res=money/1000;
		
		if(res>0){
			System.out.println("천원 : "+res+"개");
		}
		money=money%1000;
		res=money/500;
		
		if(res>0){
			System.out.println("오백원 : "+res+"개");
		}
		money=money%500;
		res=money/100;
		
		if(res>0){
			System.out.println("백원 : "+res+"개");
		}
		money=money%100;
		res=money/50;
		
		if(res>0){
			System.out.println("오십원 : "+res+"개");
			money=money/50;
			res=money/10;
		}
		
		if(res>0){
			System.out.println("십원 : "+res+"개");
		}
		money=money%10;
		res=money/5;
		
		if(res>0){
			System.out.println("5원 : "+res+"개");
		}
		money=money%5;
		res=money/1;
		
		if(res>0){
			System.out.println("1원 : "+res+"개");
		}
		
		
		
		
	}

}

