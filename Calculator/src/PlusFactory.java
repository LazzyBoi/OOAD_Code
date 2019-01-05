/**
 * @author Li Qingquan
 * @description 加运算工厂类
 */
public class PlusFactory implements CalculatorFactory {
    @Override
    public Calculator createClaculator(double a, double b) {
        System.out.println(a + " + " + b + " =");
        return new Plus(a, b);
    }
}
