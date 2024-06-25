import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        int numberDeposits = Integer.parseInt(string);
        List<Deposit> deposits = new ArrayList<>();
        //List<Double> profits = new ArrayList<>();

        for (int i = 0; i < numberDeposits; i++) {
            String depositLine = scanner.nextLine();
            String[] data = depositLine.split(" ");
            double amount = Double.parseDouble(data[0]);
            double rate = Double.parseDouble(data[1]);
            int age = Integer.parseInt(data[2]);
            Deposit deposit = new Deposit(amount, rate, age);
            deposits.add(deposit);
        }
        Calkulator calkulator = new Calkulator();
        Result result = calkulator.calulateInfo(deposits);

        System.out.println(result);
            //double profit = deposit.getProfit();
            //profits.add(profit);
           // System.out.println("Этот дипозит " + profits);

       // double max = Double.MIN_VALUE;
       // int maxIndex = -1;
       // double sum = 0.0;
//
       // for (int i = 0; i < profits.size(); i++) {
       //     if (profits.get(i) > max){
       //         max = profits.get(i);
       //         maxIndex = i;
       //     }
       //     sum += profits.get(i);
       // }
       // System.out.println("Средняя: " + sum / profits.size());
       // System.out.println("Максимальный вклад: " + maxIndex);

    }}