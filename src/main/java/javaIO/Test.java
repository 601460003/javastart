package javaIO;

public class Test {
    public static void main(String[] args) {
        String c = "XJSH1826345454";
        Order order;
        if(c.length()>10){
            order = new XiaoMingOrder();
        }else {
            order = new XiaoHongOrder();
        }
        order.acceptOrders(c);
        System.out.println();
    }
}
