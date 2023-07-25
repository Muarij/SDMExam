import java.util.Scanner;

class LargestThree {

    public static double average(int a, int b, int c) {
        return a+b+c/3;

    }

    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 3 numbers to calculate its sum");
        System.out.println("Enter 1st number");
        int firstNo=sc.nextInt();
        System.out.println("Enter 2nd number");
        int secondNo=sc.nextInt();
        System.out.println("Enter third number number");
        int thirdNo=sc.nextInt();
        int sum= firstNo+ secondNo+thirdNo;
        System.out.println("The sum of three numbers is:" + sum);
        //average
        System.out.println("The average of three numbers is:" + average(firstNo,secondNo,thirdNo));

        sc.close();
    }
}
