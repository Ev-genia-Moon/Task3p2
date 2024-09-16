public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightKilogram = 50;
        double heightMeter = 1.87;
        int indexBMI = service.calculate(weightKilogram, heightMeter); // должно получиться 500
        System.out.println(indexBMI);
    }
}
