public class BmiService {
    public int calculate(int bmi) {
        double weight = 58;
        double height = 1.68;
        int weight_kg = (int) weight ;
        int height_m = (int) height;
        int index = weight_kg / (height_m*height_m);
        return index;
    }
}

