public class BmiService {
    public int calculate(int weight_kg, double height_m) {
        int bmi = (int) (weight_kg / (height_m * height_m));
        return (bmi);

    }
}
