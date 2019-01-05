/**
 * @author Li Qingquan
 * @description 除运算工厂类
 */
public class DivideFactory implements CalculatorFactory {
    @Override
    public Calculator createClaculator(double a, double b) {
        System.out.println(a + " / " + b + " =");
        return new Divide(a, b);
    }
}
