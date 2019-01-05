import java.text.DecimalFormat;

/**
 * @author Li Qingquan
 * @description 满减收银
 */
public class CashReduce implements CashStrategy {

    double cashAchieve;  // 触发满减的价格
    double cashReduce;  // 减掉的价格

    /**
     * @description 默认构造函数
     */
    public CashReduce() {
        this.cashAchieve = 0.0;
        this.cashReduce = 0.0;
    }

    /**
     * @description 构造函数
     * @param cashAchieve 触发满减的价格
     * @param cashReduce 减掉的价格
     */
    public CashReduce(double cashAchieve, double cashReduce) {
        if (cashAchieve >= cashReduce) {  // 触发满减的价格应当大于等于减掉的价格
            this.cashAchieve = cashAchieve;
            this.cashReduce = cashReduce;
        } else {
            this.cashAchieve = 0.0;
            this.cashReduce = 0.0;
        }
    }

    /**
     * @description 显示满减收银金额
     * @param price 商品价格
     * @return 收银金额
     */
    @Override
    public double cash(double price) {
        double finallyPrice;  // 最终价格
        if (this.cashAchieve == 0.0) {  // 没有满减活动
            finallyPrice = price;
        } else {
            double tmp = (int) (price / this.cashAchieve);  // 商品总价是满减价格的几倍
            finallyPrice = price - tmp * cashReduce;
        }
        DecimalFormat df = new DecimalFormat("#.00");  // 标准化小数点后两位输出
        System.out.println("收银" + df.format(finallyPrice) + "元");
        return finallyPrice;
    }
}
