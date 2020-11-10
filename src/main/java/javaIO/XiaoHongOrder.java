package javaIO;

public class XiaoHongOrder implements Order {
    @Override
    public boolean acceptOrders(String OrderNum) {
        System.out.println(222);
        return false;
    }

    public static void main(String[] args) {

    }
}
