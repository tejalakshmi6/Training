public class ZigZag{
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int row = 3;
        System.out.println(zigzag(s,row));
    }

    static String zigzag(String s, int row) {
        StringBuilder[] sb = new StringBuilder[row];
        for (int j = 0; j < row; j++) {
            sb[j] = new StringBuilder();
        }
        boolean upward = true;
        int cur = 0;
        for (char c: s.toCharArray()) {
            sb[cur].append(c);
            if( cur==0 || cur==row-1 ) upward = !upward;
            cur += upward ? -1 : 1;

        }
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < row; j++) {
            res.append(sb[j]);
        }
        return res.toString();
    }
}