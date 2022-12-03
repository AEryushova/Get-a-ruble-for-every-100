public class Main {
    public static void main(String[] args) {

        int balance = 340;
        int payment = 2650;
        int bonus = (payment / 100);
        int balanceMyBonus = (balance + payment + bonus);
        int balanceMyNoBonus = (balance + payment);


        if (payment > 1000) {
            System.out.println("Ваш баланс: " + balanceMyBonus + " руб. Начисленные бонусы: " + bonus + " бонуса(ов).");
        } else {
            System.out.println("Ваш баланс: " + balanceMyNoBonus + " руб.");
        }

    }
}