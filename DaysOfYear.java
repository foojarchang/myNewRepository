package priv.faychang._01.homework;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DaysOfYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			System.out.println("请输入年份：");
			int year = sc.nextInt();
			System.out.println("请输入月份：");
			int month = sc.nextInt();
			System.out.println("请输入这月的号数：");
			int day = sc.nextInt();
			sc.close();
			int total = 0;
			if(month>=1&&month<=12&&day>=1&&day<=31){
			switch(month){
			case 12 : 
				total +=  30;
			case 11 : 
				total +=  31;
			case 10 : 
				total +=  30;
			case 9 : 
				total +=  31;
			case 8 : 
				total +=  31;
			case 7 : 
				total +=  30;
			case 6 : 
				total +=  31;
			case 5 : 
				total +=  30;
			case 4 : 
				total +=  31;
			case 3 : 
				total +=  year % 4==0 && year %100 !=0 || (year %400==0)?29 : 28;
			case 2 : 
				total +=  31;
			case 1 : 
				total += day;
				System.out.println("今天是今年的第"+total+"天");
			}
			}else{
			System.out.println("您输入的日期有误!");
			}
			//方法2
			Calendar c = Calendar.getInstance();
			c.setTime(new Date(year,month-1,day));
			
			System.out.println(c.get(Calendar.DAY_OF_YEAR));
		}
}
