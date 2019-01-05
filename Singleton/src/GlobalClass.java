/**
 * @author Li Qingquan
 * @description 单例模式的GlobalClass类
 */
public class GlobalClass {

    private int value;

    private static GlobalClass global_ptr = null;  // GlobalClass的一个对象

    // 构造函数为private，这样就不会被实例化
    private GlobalClass() {
        this.value = 0;
    }

    /**
     * @description 获取实例的value值
     * @return 实例的value值
     */
    public int getValue() {
        return this.value;
    }

    /**
     * @description 设置实例的value值
     * @param value
     */
    public void setValue(int value) {
        this.value = value;
    }

    // 获取唯一可用的对象
    public static GlobalClass getInstance() {
        if (global_ptr == null) {
            synchronized (GlobalClass.class) {
                if (global_ptr == null) {
                    global_ptr = new GlobalClass();
                }
            }
        }
        return global_ptr;
    }

    public static void foo() {
        GlobalClass.getInstance().setValue(1);
        System.out.println("foo: global_ptr is " + GlobalClass.getInstance().getValue());
    }

    public static void bar() {
        GlobalClass.getInstance().setValue(2);
        System.out.println("bar: global_ptr is " + GlobalClass.getInstance().getValue());
    }

    public static void main(String[] args) {
        System.out.println("main: global_ptr is " + GlobalClass.getInstance().getValue());
        foo();
        bar();
    }
}
