/**
 * @author Li Qingquan
 * @description 计算取余部分的观察者实现
 */
public class ModObserver implements Observer{

    int mod;

    /**
     * @description 默认构造函数
     */
    public ModObserver() {
        this.mod = 1;
    }

    /**
     * @description 构造函数，设置除数
     * @param mod 除数
     */
    public ModObserver(int mod) {
        this.mod = mod;
    }

    @Override
    public void update(int val) {
        int result = val % this.mod;
        System.out.println(val + " mod " + this.mod + " is " + result);
    }
}
