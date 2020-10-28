package studentmgr;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 学生管理主类
 * 1.定义学生类
 * 2.学生管理主页面代码
 * 3.查看
 * 4.添加
 * 5.删除
 * 6.修改
 */
public class StudentManagerTest {
    public static void main(String[] args) {
        //创建学生数组
        Student[] students = new Student[3];
        //创建学生对象
        Student s1 = new Student("sd","20");
        Student s2 = new Student("sd3","220");
        Student s3 = new Student("sd4","220");
        students[0]=s1;
        students[1]=s2;
        students[2]=s3;
        for (int x = 0;x<students.length;x++){
            Student s = students[x];
            System.out.println(s.getName()+""+s.getAge());
        }

        //创建集合对象做存储
        ArrayList<Student> array = new ArrayList<Student>();
        //这是学生管理系统的主界面
        while (true) {
            System.out.println("------欢迎来到学生管理系统-----");
            System.out.println("1.查看所有学生");
            System.out.println("2.添加学生");
            System.out.println("3.删除学生");
            System.out.println("4.修改学生");
            System.out.println("5.退出");
            System.out.println("请输入你的选择:");
            //键盘录入
            Scanner sc = new Scanner(System.in);
            String choiceString = sc.nextLine();
            switch (choiceString) {
                case "1":
                    findAllStudent(array);
                    break;
                case "2":
                    //添加学生
                    addStudent(array);
                    break;
                case "3":
                    //删除学生
                    delStudent(array);
                    break;
                case "4":
                    //修改学生
                    updStudent(array);
                    break;
                case "5":
                    //退出
//                    break;
                default:
                    System.out.println("谢谢你的使用");
                    System.exit(0);
                    break;
            }
        }
    }

    //查看所有学生
    public static void findAllStudent(ArrayList<Student> array) {
        //判断是否有数据
        if (array.size() == 0) {
            System.out.println("没有数据");
            return;
        }
        System.out.println("学号\t\t姓名\t年级\t居住地");
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getAddress() + "\t");
        }
    }

    //添加学生
    private static void addStudent(ArrayList<Student> array) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //作用域id
        String id;
        while (true) {
            System.out.println("请输入学生学号：");
            id = sc.nextLine();

            //定义一个标记
            Boolean flag = false;

            for (int x = 0; x < array.size(); x++) {
                Student s = array.get(x);
                //判断学号是否存在
                if (s.getId().equals(id)) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                System.out.println("学号已存在：请重新输入");
            } else {
                break;
            }
        }


        System.out.println("请输入学生姓名：");
        String name = sc.nextLine();
        System.out.println("请输入学生年龄：");
        String age = sc.nextLine();
        System.out.println("请输入学生居住地：");
        String address = sc.nextLine();

        //创建学生对象
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setAge(age);
        s.setAddress(address);

        //把学生对象作为元素添加到集合
        array.add(s);
    }

    //delStudent 删除学生
    private static void delStudent(ArrayList<Student> array) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要删除的学生学号：");
        String id = sc.nextLine();
        //发现问题 及时处理
        int index = -1;
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            if (s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if (index > -1) {
            array.remove(index);
            System.out.println("删除学生成功");
        } else {
            System.out.println("没有该学生");
        }

    }

    //修改学生
    private static void updStudent(ArrayList<Student> array) {
        //创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你需要修改的学生学号：");
        String id = sc.nextLine();
        //发现问题 及时处理
        int index = -1;
        for (int x = 0; x < array.size(); x++) {
            Student s = array.get(x);
            if (s.getId().equals(id)) {
                index = x;
                break;
            }
        }
        if (index == -1) {
            System.out.println("没有该学生");
        } else {
            System.out.println("请输入学生姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生居住地：");
            String address = sc.nextLine();

            //创建学生对象
            Student s = new Student();
            s.setId(id);
            s.setName(name);
            s.setAge(age);
            s.setAddress(address);
            //根据索引修改学生
            array.set(index, s);
            System.out.println("修改成功");
        }
    }
}
