package javaIO;

public class XiaoMingOrder implements Order{
    @Override //为重写的意思
    public boolean acceptOrders(String OrderNum) {
        System.out.println(11);
        return false;
    }

    public static void main(String[] args) {
        Order order = new XiaoMingOrder();
        order.acceptOrders("");
    }
}
