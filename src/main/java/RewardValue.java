public class RewardValue {

    private double cash;
    private int miles;
    private final double CONVERTER = 0.0035;

    public RewardValue(double cash) {
        this.cash = cash;
        this.miles = (int) cashtoMiles(cash);
    }

    public RewardValue(int miles) {
        this.miles = miles;
        this.cash = milestoCash(miles);
    }

    private double cashtoMiles(double cash){
        return cash/CONVERTER;
    }

    private double milestoCash(int miles){
        return miles*CONVERTER;
    }

    public double getCashValue() {
        return cash;
    }

    public int getMilesValue() {
        return miles;
    }
}