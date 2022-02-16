public class Main {
    public static void main(String[] args) {
        // входные данные
        int account = 100;
        int accountAdd = 1100;
        //логика
        int bonus = 0;
        if (accountAdd > 1000) {
            bonus = accountAdd / 100;
        }
        ;
        account = account + accountAdd + bonus;
        System.out.println("Сумма бонусов: " + bonus);
        System.out.println("итоговая суммма на счету: " + account);
    }
}
