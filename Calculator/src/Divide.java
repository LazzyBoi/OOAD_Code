/**
 * @author Li Qingquan
 * @description 除
 */
public class Divide implements Calculator {
    double a;
    double b;

    public Divide() {
        this.a = 0.0;
        this.b = 0.0;
    }

    public Divide(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculate() {
        if (this.b == 0) {
            System.out.println("Error!");
            return 0;
        } else {
            System.out.println(this.a / this.b);
            return this.a / this.b;
        }
    }
}
