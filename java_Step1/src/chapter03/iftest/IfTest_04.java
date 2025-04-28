package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfTest_04 {

	public static void main(String[] args) {
		/*전시관의 입장료는 미취학 아동은 1000원 ->7
		전시관의 입장료는 초등학생은 2000원->13
		전시관의 입장료는 중,고등학생은 3500원 ->19
		전시관의 입장료는 성인은 5000원*/
		//#1
        int age;
        int charge=0;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입렵하세요"));
		
		if(age <= 7) {
			System.out.println("미취학 아동입니다");
			System.out.println("입장료는:1000입니다");
		}else if(age <= 13) {
			System.out.println("초등학생입니다");
			System.out.println("입장료는:2000입니다");
		}else if(age <= 19) {
			System.out.print("중,고등학생입니다");
			System.out.print("입장료는:3500입니다");
		}else  {
			System.out.print("성인입니다");
			System.out.print("입장료는:5000입니다");
			
			
			//#2
			/*
			 int age;
        int charge=0;
		
		age=Integer.parseInt(JOptionPane.showInputDialog("나이를 입렵하세요"));
		
		if(age <= 7) {
			charge=1000;
			System.out.println("미취학 아동입니다");
		}else if(age <= 13) {
			charge=2000;
			System.out.println("초등학생입니다");
		}else if(age <= 19) {
			charge=3500;
			System.out.print("중,고등학생입니다");
		}else  {
			charge=5000;
			System.out.print("성인입니다");
		}//if
		System.out.println(charge+"입니다.");
		
		}//main	
		
    }//class
			 */
			
		}
		}
		

	}

