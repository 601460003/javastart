package company;

/**
 * super 与 this 关键字
 * super关键字：我们可以通过super关键字来实现对父类成员的访问，用来引用当前对象的父类。
 *
 * this关键字：指向自己的引用。
 */
public class Test {
    public static void main(String[] args) {
        XiaoMingFirm a = new XiaoMingFirm();
        a.eat();
        Dog d = new Dog();
        d.eatTest();
    }
}
