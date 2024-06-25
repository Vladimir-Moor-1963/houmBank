import java.util.List;
import java.util.Objects;

public class Result {

    private int indexOfProfitDeposit;
    private double averageprofitDeposits;
    private List<Double> allProfits;

    public Result(int indexOfProfitDeposit, double averageprofitDeposits, List<Double> allProfits) {
        this.indexOfProfitDeposit = indexOfProfitDeposit;
        this.averageprofitDeposits = averageprofitDeposits;
        this.allProfits = allProfits;
    }

    @Override
    public String toString() {
        return "Result{" +
                "indexOfProfitDeposit=" + indexOfProfitDeposit +
                ", averageprofitDeposits=" + averageprofitDeposits +
                ", allProfits=" + allProfits +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Result result = (Result) o;
        return indexOfProfitDeposit == result.indexOfProfitDeposit && Double.compare(averageprofitDeposits, result.averageprofitDeposits) == 0 && Objects.equals(allProfits, result.allProfits);
    }

    @Override
    public int hashCode() {
        int result = indexOfProfitDeposit;
        result = 31 * result + Double.hashCode(averageprofitDeposits);
        result = 31 * result + Objects.hashCode(allProfits);
        return result;
    }

    public int getIndexOfProfitDeposit() {
        return indexOfProfitDeposit;
    }

    public void setIndexOfProfitDeposit(int indexOfProfitDeposit) {
        this.indexOfProfitDeposit = indexOfProfitDeposit;
    }

    public double getAverageprofitDeposits() {
        return averageprofitDeposits;
    }

    public void setAverageprofitDeposits(double averageprofitDeposits) {
        this.averageprofitDeposits = averageprofitDeposits;
    }

    public List<Double> getAllProfits() {
        return allProfits;
    }

    public void setAllProfits(List<Double> allProfits) {
        this.allProfits = allProfits;
    }
}
