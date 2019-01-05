/**
 * @author Li Qingquan
 * @description 收银策略的高层接口
 */
public interface CashStrategy {

    /**
     * @description 显示收银金额
     * @param price
     */
    public double cash(double price);
}
