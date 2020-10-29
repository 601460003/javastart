package company;

public class XiaoMingFirm extends Firm {
    public static void main(String[] args) {
        XiaoMingFirm xiaomin = new XiaoMingFirm(); //Java中所有对象都要通过new的方式创建
        xiaomin.address = "小明企业";             //赋值给企业地址
        System.out.println(xiaomin.navigationToFirm());
    }
}
