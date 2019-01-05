/**
 * @author Li Qingquan
 * @description 加
 */
public class Plus implements Calculator {
    double a;
    double b;

    public Plus() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public Plus(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        System.out.println(this.a + this.b);
        return this.a + this.b;
    }
}
