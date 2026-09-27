public class LastWord {
    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        int count = 0;
        for(int i = s.length() - 1; i >= 0;) {
            if(Character.isWhitespace(s.charAt(i))) {
                if(count == 0) {
                    i--;
                } else {
                    break;
                }
            } else {
                count += 1;
                i--;
            }
        }

        if(count == 0) {
            count = 1;
        }
        
        System.out.print(count);
    }
}
