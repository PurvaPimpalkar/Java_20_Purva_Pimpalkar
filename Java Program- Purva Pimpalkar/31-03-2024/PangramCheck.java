public class PangramCheck {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        if (isPangram(str)) {
            System.out.println("The string is a pangram.");
        } else {
            System.out.println("The string is not a pangram.");
        }
    }
    public static boolean isPangram(String str) {
        boolean[] visited = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if ('a' <= ch && ch <= 'z') {
                visited[ch - 'a'] = true;
            } else if ('A' <= ch && ch <= 'Z') {
                visited[ch - 'A'] = true;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
}
