package day24;

public class RemoveDuplicates {
	public static void main(String[] args) {
		System.out.println(removeDup("hello")); // helo
		System.out.println(removeDup("apple")); // aple
		System.out.println(removeDup("aaa")); // a
		System.out.println(removeDup("aabbaacc")); // abc
	}
	
	/*
	 * remove duplicates from str and return as new string
	 * removeDup("hello");    -> "helo"
	 * removeDup("apple");    -> "aple"
	 * removeDup("aaa");      -> "a"
	 * removeDup("aabbaacc"); -> "abc"
	 */
	public static String removeDup(String str) {
		String noDupStr = "";
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!noDupStr.contains(String.valueOf(ch))) {
				noDupStr += ch;
			}
		}
		
		return noDupStr;
	}
}
