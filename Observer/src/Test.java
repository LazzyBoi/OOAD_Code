/**
 * @author Li Qingquan
 * @description 测试用类
 */
public class Test {

    public static void main(String[] args) {
        DivModCalculator dmc = new DivModCalculator();
        Observer do_ = new DivObserver(4);
        Observer mo = new ModObserver(3);

        dmc.registerObservers(do_);
        dmc.registerObservers(mo);

        dmc.setValue(14);
    }
}
