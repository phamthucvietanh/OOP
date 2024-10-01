import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		int Max=0;
		for (int i = 0; i < str.length(); i++) {
			int tmp=0;
			int j=i;
			while(j + 1 < str.length() && str.charAt(j+1) == str.charAt(j)) {
				j++;
			}
			tmp = j - i + 1;
			Max = Math.max(Max, tmp);
			i=j;
		}
		return Max; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		String res = "";
		for (int i=0; i < str.length(); i++) {
			if (Character.isAlphabetic(str.charAt(i))) {
				res += str.charAt(i);
			}
			else {
				if (i + 1 < str.length() && Character.isAlphabetic(str.charAt(i+1))) {
					int k = str.charAt(i) - '0';
					for (int j = 0; j < k; j++) {
						res += str.charAt(i+1);
					}
				}
			}
		}
		return res; // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		Set<String> se = new HashSet<>();
		for (int i = 0; i <= a.length() - len; i++) {
			String tmp = a.substring(i, i + len);
			se.add(tmp);
		}
		for (int i = 0; i <= b.length() - len; i++) {
			String tmp = b.substring(i, i + len);
			if (se.contains(tmp)) {
				return true;
			}
		}
		return false; // YOUR CODE HERE
	}

	public static void main(String[] args) {
		String s1 = "a312x2z";
		String s2 = "12x";
		System.out.println(stringIntersect(s1, s2, 3));
	}
}
