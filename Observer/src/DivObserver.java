/**
 * @author Li Qingquan
 * @description 计算整除部分的观察者实现
 */
public class DivObserver implements Observer {

    int div;

    /**
     * @description 默认构造函数
     */
    public DivObserver() {
        this.div = 1;
    }

    /**
     * @description 构造函数，设置除数
     * @param div 除数
     */
    public DivObserver(int div) {
        this.div = div;
    }

    @Override
    public void update(int val) {
        int result = val / this.div;
        System.out.println(val + " mod " + this.div + " is " + result);
    }
}
