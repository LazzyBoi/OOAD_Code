/**
 * @author Li Qingquan
 * @description subject接口
 */
public interface Subject {

    void registerObservers(Observer o);
    void removeObservers(Observer o);
    void notifyObservers();
}
