package lectures.day1;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number ");
        int num = sc.nextInt();

        if(num<=1){
            System.out.println("neither prime or composite ");
        }

        int c= 2;
        while(c*c <= num){
            if (num% c==0)
            {
                System.out.println("not prime");
                return;
            }
            c++;

        }
        if (c*c >num ){
            System.out.println("is prime number ");
        }


    }
}
