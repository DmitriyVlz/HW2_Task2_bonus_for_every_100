import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        double amount = 100;
        double summ = 2000;


        double percent;
        if (summ > 1_000) {
            percent = 1;
        } else {
            percent = 0;
        }
        double bonus = (summ * percent / 100) + amount + summ;

        System.out.println(bonus);

    }
}


