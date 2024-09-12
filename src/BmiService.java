public class BmiService {
    public int calculate(int weight_kilogram, double height_meter) {
        double bmi;
        bmi = weight_kilogram / (height_meter * height_meter);
        int index = (int) bmi;
        return index;
    }
}
