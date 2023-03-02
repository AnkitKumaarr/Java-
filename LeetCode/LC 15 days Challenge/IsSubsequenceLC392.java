public class IsSubsequenceLC392 {
    static boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
      return true;

    int i = 0;
    for (final char c : t.toCharArray())
      if (s.charAt(i) == c && ++i == s.length())
        return true;

    return false;
    }

    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        boolean res = isSubsequence(s, t);
        System.out.println(res);
    }
}
