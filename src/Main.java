public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //int c = calc.devide.apply(a, b);  произошла арифметическая ошибка "деление на ноль", необходимо ее поймать
        int c = 0;
        try {
            c = calc.devide.apply(a, b);
            calc.println.accept(c);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: деление на ноль");
        }

    }
}