import java.util.*;

class AccountHolder {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int we;
    double inc;
    Boolean czs;

    static void Pr3() {
        System.out.println("*******Welcome to A.R.INTELLIGENCE*******");
        System.out.println(":: To Apply For Job Fill the Form ::");
    }

    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Net Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Total Work Experince (In Year Format) : ");
        we = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true otherwisw false) :- ");
        czs = sc.nextBoolean();

    }

    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age is : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income is : " + inc);
        } else if (we >= 1) {
            System.out.println("Your Work Experience is : " + we);
        } else if (czs == true) {
            System.out.println("You Are A Indian Citizenship ......");
        }
    }
}
