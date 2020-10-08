import java.util.*;

public class calculate_age {

    public static void main(String[] args) {

        int a = 2020;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year of birth");
        int age = sc.nextInt();
        c = a - age;
        System.out.println("Age is " + c);


    }

}