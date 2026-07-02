package lectures.day2;

import java.util.Scanner;

public class checkoccur {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number  ");
        int n = sc.nextInt();
        System.out.println("enter the digit to count occurance ");
        int num = sc.nextInt();
        int count =0 ;

        while(n>0) {
            int rem = n % 10;
            if (rem == num) {
                count++;
            }
            n = n / 10;
        }

            System.out.println(count);
        }

    }

