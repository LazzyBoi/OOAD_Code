/**
 * @author Li Qingquan
 * @description 减运算工厂类
 */
public class MinusFactory implements CalculatorFactory{
    @Override
    public Calculator createClaculator(double a, double b) {
        System.out.println(a + " - " + b + " =");
        return new Minus(a, b);
    }
}
