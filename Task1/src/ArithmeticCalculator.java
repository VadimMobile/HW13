public class ArithmeticCalculator {
    private int a;
    private int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void calculate(Operation action) {
        if (action.equals(Operation.ADD)) {
            System.out.println(a + b);
        } else if (action.equals(Operation.SUBTRACT)) {
            System.out.println(a - b);
        } else if (action.equals(Operation.MULTIPLY)) {
            System.out.println(a * b);
        } else {
            System.out.println("Такой операции нет");
        }
    }
}
