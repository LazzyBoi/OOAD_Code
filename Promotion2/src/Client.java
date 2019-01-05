import java.text.DecimalFormat;

/**
 * @author Li Qingquan
 * @description 客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        double penPrice = 1.5;
        double bedPrice = 300;
        double computerPrice = 4000;
        double sum = 0;
        CashContext cc;
        cc = new CashContext(1);
        sum += cc.calculateCash(penPrice);
        cc = new CashContext(2);
        sum += cc.calculateCash(bedPrice);
        cc = new CashContext(3);
        sum += cc.calculateCash(computerPrice);
        DecimalFormat df = new DecimalFormat("#.00");  // 标准化小数点后两位输出
        System.out.println("总共收银" + df.format(sum) + "元");
    }
}
