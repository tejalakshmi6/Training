public class StringProblem1{
    public static void main(String[] args) {
        String s = "VIRATKOHLI";
        System.out.println(waveForm(s));
    }
    static String waveForm(String s){
        char[] res = new char[s.length()];
        int even = 0, odd = s.length()/2;
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0){
                res[even++] = s.charAt(i);
            }else {
                res[odd++] = s.charAt(i);
            }   
        }
        return new String(res);
    }
}