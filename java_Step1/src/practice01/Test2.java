package practice01;

public class Test2 {

	public static int[] countVowels(String[] strlist) {
		int[] vowelCounts = new int[strlist.length];

		for (int i = 0; i < strlist.length; i++) {
			int count = 0;
			String currentString = strlist[i].toLowerCase();

			for (int j = 0; j < currentString.length(); j++) {
				char c = currentString.charAt(j);

				if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
					count++;
				}
			}
			vowelCounts[i] = count;
		}
		return vowelCounts;

	}

	public static void main(String[] args) {
		String[] strlist = { "hello", "world", "java", "programming" };
		int[] result = countVowels(strlist);

		for (int i = 0; i < result.length; i++) {
			System.out.println(strlist[i] + result[i]);
		}

	}

}
