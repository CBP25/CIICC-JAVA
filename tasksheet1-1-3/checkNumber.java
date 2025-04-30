
public class checkNumber {
    public static void main(String[] args) {
        int check_number = 10;
        String message = "";

        for(int i = 0; i<= check_number; i++){ message += (i + " is " + ((i%2==0)?"even" : "odd") + " number\n"); }
        System.out.println(message);

        
    }
}
