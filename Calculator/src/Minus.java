/**
 * @author Li Qingquan
 * @description 减
 */
public class Minus implements Calculator{
    double a;
    double b;

    public Minus() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public Minus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        System.out.println(this.a - this.b);
        return this.a - this.b;
    }
}
