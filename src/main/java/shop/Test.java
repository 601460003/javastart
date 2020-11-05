package shop;


import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Shop shop = new Shop();

        System.out.println("请输入你的名字");
        String name = sc.nextLine();
        System.out.println("清输入钱包金额");
        String wallet = sc.nextLine();

        Customer customer = new Customer(name,Double.valueOf(wallet));
        System.out.println("顾客"+name+"创建了  "+customer);
        System.out.println("查看所有商品清输入：ALL");
        System.out.println("查询商品清输入：A_商品序号");

        String type = sc.nextLine();
        if(type==null||"".equals(type)){
            System.out.println("输入有误！");
        }else if(type.equals("ALL")){
            List<Good> goods = shop.getGoods();
            for (Good good:goods){
                System.out.println("商品名称："+good.getName()+","+"商品价格"+good.getPrice());
            }
        }else if(type.indexOf("A_")>-1){
            System.out.println(shop.getGoods(type));
        }else {
            System.out.println("输入有误");
        }
        System.out.println(customer.getName()+"购买了："+shop.chooseGoods(customer.getWallet()));
    }
}
