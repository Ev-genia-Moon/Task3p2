public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kilogram = 50;
        double height_meter = 1.87;
        int indexbmi = service.calculate(weight_kilogram, height_meter); // должно получиться 500
        System.out.println(indexbmi);
    }
}
