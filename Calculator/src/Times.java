/**
 * @author Li Qingquan
 * @description 乘
 */
public class Times implements Calculator{
    double a;
    double b;

    public Times() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public Times(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        System.out.println(this.a * this.b);
        return this.a * this.b;
    }
}
