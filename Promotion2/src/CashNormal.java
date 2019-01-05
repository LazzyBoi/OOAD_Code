import java.text.DecimalFormat;

/**
 * @author Li Qingquan
 * @description 正常价格收银
 */
public class CashNormal implements CashStrategy{

    /**
     * @description 显示正常收银金额
     * @param price 商品价格
     * @return 收银金额
     */
    @Override
    public double cash(double price) {
        DecimalFormat df = new DecimalFormat("#.00");  // 标准化小数点后两位输出
        System.out.println("收银" + df.format(price) + "元");
        return price;
    }
}
