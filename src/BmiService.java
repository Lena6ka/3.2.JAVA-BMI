public class BmiService {
    public int calculate(int weight, double growth) {
        int index = (int) (weight / (growth * growth));
        return index;
    }
}
