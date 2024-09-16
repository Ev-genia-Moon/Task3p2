public class BmiService {
    public int calculate(int weightKilogram, double heightMeter) {
        double bmi;
        bmi = weightKilogram / (heightMeter * heightMeter);
        int index = (int) bmi;
        return index;
    }
}
