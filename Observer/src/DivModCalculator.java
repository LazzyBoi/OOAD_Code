import java.util.ArrayList;
import java.util.List;

/**
 * @author Li Qingquan
 * @description subject的实现
 */
public class DivModCalculator implements Subject {

    List<Observer> list;
    int value;

    /**
     * @description 默认构造函数
     */
    public DivModCalculator() {
        this.list = new ArrayList<Observer>();
        this.value = 0;
    }

    @Override
    public void registerObservers(Observer o) {
        this.list.add(o);
    }

    @Override
    public void removeObservers(Observer o) {
        if (!this.list.isEmpty()) {
            this.list.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < this.list.size(); i++) {
            Observer o = this.list.get(i);
            o.update(this.value);
        }
    }

    /**
     * @description 输入数字，通知所有观察者进行计算
     * @param value 输入数字
     */
    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
