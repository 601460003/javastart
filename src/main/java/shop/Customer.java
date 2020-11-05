package shop;

import java.util.List;

public class Customer {
    //客户名称
    private String name;
    //钱包
    private double wallet;
    //已购买的商品
    private List<Good> pursChaseGood;
    //初始化客户
    public Customer(String name, double wallet) {
        this.name = name;
        this.wallet = wallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPursChaseGood(List<Good> pursChaseGood) {
        this.pursChaseGood = pursChaseGood;
    }

    public List<Good> getPursChaseGood() {
        return pursChaseGood;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public double getWallet() {
        return wallet;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", wallet=" + wallet +
                ", pursChaseGood=" + pursChaseGood +
                '}';
    }
}
