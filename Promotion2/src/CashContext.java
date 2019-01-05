/**
 * @author Li Qingquan
 * @description 维护对策略对象的引用
 */
public class CashContext {
    CashStrategy cs;  // 收银策略

    /**
     * @description 构造函数
     * @param cashMethod 打折方式，1代表正常，2代表打折，3代表满减
     */
    public CashContext(int cashMethod) {
        switch (cashMethod) {
            case 1:
                cs = new CashNormal();
                break;
            case 2:
                cs = new CashDiscount(0.75);  // 这里先设置打75折
                break;
            case 3:
                cs = new CashReduce(1000, 100);  // 这里先设置满1000减100
                break;
            default:
                break;
        }
    }

    /**
     * @description 计算收银金额
     * @param price 商品价格
     * @return 收银金额
     */
    public double calculateCash(double price) {
        return cs.cash(price);
    }
}
