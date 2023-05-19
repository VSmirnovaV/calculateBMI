public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 55;
        double height = 1.70;
        int BMI = service.calculate(weight, height);
        System.out.println(BMI);
    }
}