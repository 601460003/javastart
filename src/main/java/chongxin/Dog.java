package chongxin;

class Dog extends Animal{
    public void move(){
        super.move(); // 应用super类的方法
        System.out.println("狗喜欢吃鸡腿");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}