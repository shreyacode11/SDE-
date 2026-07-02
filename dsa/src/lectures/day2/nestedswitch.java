package lectures.day2;

import java.util.Scanner;

public class nestedswitch {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("enter employee id");
            int empID = in.nextInt();
            System.out.println("enter department id");
            String department = in.next();

            switch (empID) {

                case 1:
                    System.out.println("Kunal Kushwaha");
                    break;
                case 2:
                    System.out.println("Rahul Rana");
                    break;
                case 3:
                    System.out.println("Emp Number 3");
                    switch (department) {
                        case "IT":
                            System.out.println("IT Department");
                            break;
                        case "Management":
                            System.out.println("Management Department");
                            break;
                        default:
                            System.out.println("No department entered");
                    }
                    break;
                default:
                    System.out.println("Enter correct EmpID");
            }


        }
    }

