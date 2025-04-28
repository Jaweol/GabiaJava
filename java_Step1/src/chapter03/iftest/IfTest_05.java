package chapter03.iftest;

import javax.swing.JOptionPane;

public class IfTest_05 {

	public static void main(String[] args) {
		/*BMI = 체중(kg) / 신장(m)*2
		  25이상: 과체중
		  18.5 이상 25미만: 정상
		  18.5 미만:저체중
	
		   */
		
		double weight=Double.parseDouble(JOptionPane.showInputDialog("몸무게(kg)를 입력하세요"));
		double height=Double.parseDouble(JOptionPane.showInputDialog("키(m)를 입력하세요"));
		double bmi=weight/(height*2);
		String str=" ";
		
		if(weight<0 || height<0) {
			System.out.println("다시입력");
			
		}else if(bmi>=25) {
			str="과체중";
		}else if(bmi>=18.5) {
			str="정상";
		}else {
			str="저체중";
		}
		
		System.out.printf("당신의 BMI는 %.2f 이며,%s 입니다." ,bmi, str);
		
	
		
		
		

	}

}
