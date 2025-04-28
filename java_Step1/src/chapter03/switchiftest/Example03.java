package chapter03.switchiftest;

import javax.swing.JOptionPane;

public class Example03 {

	public static void main(String[] args) {

		String input = JOptionPane.showInputDialog("등급을 입력하세요 (A~F):");

		// null (아무것도 입력이 안된 상황) -> String str=null; (String str;)
		// isEmpty(문자 길이가 0) -> String str="";

		// null이거나 isEmpty() -> if문으로 input == null이거나 input.isEmpty() 면 메세지 박스를 이용하여 출력
		// 입력값이 없습니다.

		// 'A' 'B' 'C' 'D' 'F'
		// switch 사용
		// MessageDialog 출력

		if (input == null || input.isEmpty()) {
			JOptionPane.showMessageDialog(null, "입력값이 없습니다.");

		}
		// toUpperCase : 대문자로 변환
		char grade = Character.toUpperCase(input.charAt(0));
		String message;

		// switch 사용
		switch (grade) {
		case 'A':
			message = "1등급";
			break;
		case 'B':
			message = "2등급";
			break;
		case 'C':
			message = "3등급";
			break;
		case 'D':
			message = "4등급";
			break;
		case 'F':
			message = "5등급";
			break;
		default:
			message = "등급없음";
		}
		JOptionPane.showMessageDialog(null, "입력한 등급: " + grade + "\n코멘트:" + message);

	}

}
