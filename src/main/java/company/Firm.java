package company;

public class Firm {
    String test  ="ceshi";
    final int value = 10;
    /**
     * 企业
     * 用java代码描述了企业
     * 其中 private、public为Java中的关键字
     * private - String address,private int size ,private String name为对企业
     * 描述的字段
     * public String navigationToFirm 为方法
     * 符号标识用的意思
     */
    //企业地址
    protected String address;
    //企业规模
    private int size;
    //企业名称
    private String name;

    public static void main(String[] args) {
        Firm firm = new Firm(); //Java中所有对象都通过new的方式创建
        firm.setAddress("深圳腾讯");
        String navigation = firm.navigationToFirm();
        System.out.println(navigation);
    }

    public String navigationToFirm() {
        return this.address;
    }

    /**
     * 对企业名称进行设值
     * void为Java中关键字，表示无返回值
     * this为Java中关键字, 指当前类Firm
     * args就是输入String name,Java中未定义的变量一定要声明的
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }


}
