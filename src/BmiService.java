public class BmiService {
    public int calculate(int weight, double height) {
        int BMI = (int) (weight / (height * height));
        return BMI;
    }
}
