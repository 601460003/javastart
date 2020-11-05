package shop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Shop {
    private String name;
    private String address;
    private List<Good> goods;

    public Shop(){
        //初始化店铺名
        this.name = "天天向上小卖铺";
        //初始化地址
        this.address="qq";
        this.goods = new ArrayList<>();
        //随机函数
        Random random = new Random();
        for(int i = 0;i<100;i++){
            goods.add(new Good("A_"+i,random.nextInt(100)));
        }
    }
    public List<Good> getGoods() {
        return goods;
    }
     //根据商品名称获取商品
    public List<Good> getGoods(String name){
        List<Good> newGoods = new ArrayList<>();
        if(name!=null){
            for(Good good :goods){
                //判断String是否相等要同equals判读
                if(good.getName().equals(name)){
                    newGoods.add(good);
                }
            }

        }
        return newGoods;
    }

    //根据金额简单刷选商品
    public  List<Good> chooseGoods(double money){
        double totalMoey = 0; //类似JS定义初始值
        List<Good> newGoods = new ArrayList<>();//购物车
        for (Good good:goods){
            if(good.getPrice()<=money){
                //当购物车的总价格大于输入的金额时，跳过循环
                continue;
            }
            newGoods.add(good);
            totalMoey+=good.getPrice();
        }
        return newGoods;
    }

}
