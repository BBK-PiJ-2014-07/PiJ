boolean isPalindrome(String s) {
	if (s.length() == 1) {
		return true;
		} else if (s.length() == 2) {
			if (s.charAt(0) == s.charAt(1)) {
				return true;
				} else {
					return false;
				}
		}
	
	int n = s.length(); 
	if (s.charAt(0) == s.charAt(n-1)) {
		s = s.substring(1,n-1)
		println s;
		isPalindrome(s);
		} else {
			return false;
		}


}

String string = "abcdeffedcba";

println(isPalindrome(string)? "It's a palindrome!" : "It's not a palindrome.");