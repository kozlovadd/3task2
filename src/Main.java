
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight_kg = 58;
        double height_m;
        int bmi = service.calculate(bmi); // должно получиться 500
        System.out.println(bmi);
    }

}
