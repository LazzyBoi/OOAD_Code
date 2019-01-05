/**
 * @author Li Qingquan
 * @description 乘运算工厂类
 */
public class TimesFactory implements CalculatorFactory {
    @Override
    public Calculator createClaculator(double a, double b) {
        System.out.println(a + " * " + b + " =");
        return new Times(a, b);
    }
}
