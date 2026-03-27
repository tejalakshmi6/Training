public class StringProblem3 {
    public static void main(String[] args) {
        String s = "abcbad";
        System.out.println(nonRepeatingChar(s));
    }
    static char nonRepeatingChar(String s){
        int[] freq = new int[26];
        for (char ch: s.toCharArray())
            freq[ch-'a']++;
        for (char ch: s.toCharArray()) {
            if (freq[ch-'a'] == 1) 
                return ch;
        }
        return 0;
    }
}


