public class word {
    static String replace(String str, int i) {
        if (i == str.length() - 1) {
            return "";
        }

        if (str.charAt(i) == str.charAt(i + 1)) {
            return "*" + replace(str, i + 1);

        } else {
            return str.charAt(i) + replace(str, i + 1);
        }
    }

    public static void main(String[] args) {
        String str = replace("abcddefggh", 0);
        System.out.println(str);
    }
}
