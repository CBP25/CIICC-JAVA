public class Task2 {
    public static void main(String[] args) {
        int[] num = {3, 1, 0, 2};
        boolean T = true;
        char[] word = {'H', 'w', 'l', 'd','r',' '};
        String two = "2.0";
        String say = "";

        say += word[0];
        say += num[0];
        say += num[1];
        say += num[1];
        say += num[2];
        say += word[5];
        say += word[1];
        say += num[2];
        say += word[4];
        say += num[1];
        say += word[3];
        say += word[5];
        say += two;
        say += word[5];
        say += T;
        System.out.println(say); //H3110 w0r1d 2.0 true;
    }
}
