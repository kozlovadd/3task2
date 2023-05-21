public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weight = 58;
        double height = 1.68;
        int weight_kg = (int) weight ;
        int height_m = (int) height;
        int index = service.calculate(weight_kg);
        System.out.println(index);
    }
}

