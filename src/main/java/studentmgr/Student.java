package studentmgr;

/**
 * 学生类
 */
public class Student {
    //学号
    private String id;
    //姓名
    private String name;
    //年龄
    private String age;
    //居住地
    private String address;

    private int a;
    private String b;
    private String c;
    private String d;
    static String city = "中国";



    public Student() {

    }

    public static void run() {
        System.out.println(city);
    }

    public Student(String id, String name, String age, String address) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public Student(String name, String age) {
        this.name = name;
        this.age = age;
    }
    public Student(int a, String b,String c,String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    public Student(String age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public String getAge() {
        return age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId(){
        return id;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
}
