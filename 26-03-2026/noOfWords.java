public class noOfWords {
    public static void main(String[] args) {
        String s = "";
        System.out.println(len(s));
    }
    static int len(String s){
        if(s == null || s.equals("")) return 0;
        
        int n = s.length() - 1, count=0;
        for(int i = 0; i < n; i++){
            char ch = s.charAt(i);
            if(ch!=' ' && s.charAt(i+1)==' ') count++;
        }
        
        char last = s.charAt(n);
        if(last!=' ') count++;
        return count;
    }
}
