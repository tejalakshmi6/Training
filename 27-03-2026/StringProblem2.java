public class StringProblem2 {
    public static void main(String[] args) {
        String s = "words with even length ";
        System.out.println(evenWords(s));
    }
    static String evenWords(String s){
        StringBuilder res = new StringBuilder();
        StringBuilder w = new StringBuilder();;
        for(char ch: s.toCharArray()){
            if (ch == ' ') {                                        
                if (w.length() % 2 == 0)
                    res.append(w.toString()).append(" "); 
                w.setLength(0);
            }else{
                w.append(ch);
            }
        }
        if (w.length() % 2 == 0)
            res.append(w.toString());   
        return (res.toString());
    }
}

/*
static String evenWords(String s){
        StringBuilder res = new StringBuilder();
        int n = s.length();
        String[] arr = s.split(" ");
        for(int i=0; i<arr.length; i++){
            String w = arr[i];
            if(w.length()%2==0){
                res.append(w);
                if(i<n-1) res.append(" ");
            }
        }
        return (res.toString());
    }
*/
