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
        int i = 0, n = s.length();
        while (i < n) {
            for (int j = 0; j < row; j++) {
                if (i == n)
                    break;
                sb[j].append(s.charAt(i++));
            }
            for (int j = row - 2; j > 0; j--) {
                if (i == n)
                    break;
                sb[j].append(s.charAt(i++));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int j = 0; j < row; j++) {
            res.append(sb[j]);
        }
        return res.toString();
    }
}