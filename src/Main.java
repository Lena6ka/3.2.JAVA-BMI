public class Main {
    public static void main(String[] args) {
        BmiService calculator = new BmiService();

        int index = calculator.calculate(57, 1.64);
        System.out.println("Ваш идекс массы тела " + index);
    }
}
