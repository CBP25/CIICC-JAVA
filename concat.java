class conCat{
    public static void main(String[] args) {
       /*  String s1= "1";
        String s2 = s1.concat("2");
        s2.concat("3");
        System.out.println(s2); */

        /* StringBuilder alpha = new StringBuilder();
        for( char current = 'a'; current <='z'; current++)
        alpha.append(current);
        System.out.println(alpha); */

        StringBuilder a = new StringBuilder("abc");
        StringBuilder b = a.append("de");
       b.append("f").append("g");
        System.out.println("a +="+a);
        System.out.println("b +=" + b);

    }
}