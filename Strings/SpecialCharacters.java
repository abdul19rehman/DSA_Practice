package Strings;

class SpecialCharacters {
    public static void main(String[] args) {
        String s = "&ABCef@$gmj@#$";
        int cnt = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (
                    !(ch >= 'A' && ch <= 'Z') &&

                            !(ch >= 'a' && ch <= 'z') &&

                            !(ch >= '0' && ch <= '9')
            ) {
                cnt++;
            }
        }
        System.out.println("Number of special characters is " + cnt);
    }
}