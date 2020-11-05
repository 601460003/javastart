package chouxiang;


/**
 * 尽管我们不能实例化一个 Employee 类的对象，
 * 但是如果我们实例化一个 Salary 类对象，该对象将从 Employee
 * 类继承 7 个成员方法，且通过该方法可以设置或获取三个成员变量。
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Salary s = new Salary("Mohd Mohtashim", "Ambehta, UP", 3, 3600.00);
        Employee e = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        s.mailCheck();
        e.mailCheck();
    }
}
