//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int startingScore = 100; // Начальный счет
        int replenishment = 1500; // Сумма пополнения
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
            int balance = startingScore + replenishment;

            System.out.println("Итоговый счет:" + balance);
            System.out.println("Бонусы:" + bonus);
        }
    }