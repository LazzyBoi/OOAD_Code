public class Client {
    public static void main(String[] args) {
        CalculatorFactory cf;
        Calculator c;
        double a = 5.0;
        double b = 6.0;
        // 测试加
        cf = new PlusFactory();
        c = cf.createClaculator(a, b);
        c.calculate();
        // 测试减
        cf = new MinusFactory();
        c = cf.createClaculator(a, b);
        c.calculate();
        // 测试除 - 正确情况
        cf = new DivideFactory();
        c = cf.createClaculator(a, b);
        c.calculate();
        // 测试除 - 除0情况
        cf = new DivideFactory();
        c = cf.createClaculator(a, 0);
        c.calculate();
        // 测试乘
        cf = new TimesFactory();
        c = cf.createClaculator(a, b);
        c.calculate();
    }
}
