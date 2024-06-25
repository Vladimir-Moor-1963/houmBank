import java.util.ArrayList;
import java.util.List;

public class Calkulator {
    public Result calulateInfo(List<Deposit> deposits){
        double maxprofit = Double.MIN_VALUE;
        int maxindex = 0;
        double sumOfProfits = 0.0;
        List<Double> profits = new ArrayList<>();

       for (int i = 0; i < deposits.size(); i++) {
           Deposit deposit = deposits.get(i);
           double profit = deposit.getProfit();



           sumOfProfits += profit;
           if (profit > maxprofit){
               maxprofit = profit;
               maxindex = i;
           }


       }
       double averageProfit = sumOfProfits / deposits.size();
        Result result = new Result(maxindex,averageProfit,profits);
        return result;



}}
