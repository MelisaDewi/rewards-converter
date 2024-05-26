public class RewardValue {

    private double cash;
    private int miles;
    private final double CONVERTER = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) cashToMiles(cash);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = milesToCash(miles);
    }

    private double cashToMiles(double cash){
        return cash/CONVERTER;
    }

    private double milesToCash(int miles){
        return miles*CONVERTER;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}