package Strings;

public class reverse {
    public static void main(String[] args) {
        String str ="India";
        for(int i=str.length()-1; i>=0; i--){
            char ch = str.charAt(i);
            System.out.print(ch);

        }
    }
}
