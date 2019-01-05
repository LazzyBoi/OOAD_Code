import java.text.DecimalFormat;

/**
 * @author Li Qingquan
 * @description 打折收银
 */
public class CashDiscount implements CashStrategy {

    double discountRate;  // 打折率

    /**
     * @description 默认构造函数
     */
    public CashDiscount() {
        this.discountRate = 1.0;
    }

    /**
     * @description 构造函数
     * @param discountRate 打折率
     */
    public CashDiscount(double discountRate) {
        this.discountRate = discountRate;
    }

    /**
     * @description 显示打折收银金额
     * @param price 商品价格
     * @return 收银金额
     */
    @Override
    public double cash(double price) {
        double finallyPrice = price * this.discountRate;  // 计算最终价格
        DecimalFormat df = new DecimalFormat("#.00");  // 标准化小数点后两位输出
        System.out.println("收银" + df.format(finallyPrice) + "元");
        return finallyPrice;
    }
}
