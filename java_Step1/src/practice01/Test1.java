package practice01;

public class Test1 {

	public static int[] array(String[] strlist) {
		int[] total = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			total[i] = strlist[i].length();
		}
		return total;
	}

	public static void main(String[] args) {
		String[] strlist = { "we", "are", "learning" };
		int[] result = array(strlist);

		for (int len : result) {
			System.out.println(len);

		}
	}

}
