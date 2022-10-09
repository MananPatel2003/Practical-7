import java.util.*;

public class Pr3 extends AccountHolder {

    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountHolder> personHolder = new ArrayList<AccountHolder>();
        AccountHolder.Pr3();
        for (int i = 1; i <= 5; i++) {
            personHolder.add(new AccountHolder());
        }

        for (AccountHolder p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.we >= 1 && p.czs == true) {
                System.out.println("You are Elligeble**");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println("You Are Not Elligeble!!!");
            }
        }
        System.out.println("The Number of Elligeble Candidates : " + count);
        System.out.println("The Number of Not Elligeble Candidates : " + (5 - count));
        System.out.println("All Eligible Candidates Are : " + a);
    }
}
