package studentmgr;

// 引入 ArrayList 和 Iterator 类
import javafx.beans.binding.SetExpression;

import java.util.*;


public class Test {
    public static void main(String[] args) {
        Student s =new Student("55");

        List<Student> list = new ArrayList<>();
        list.add(new Student("525"));
        list.add(new Student("5235"));
        list.add(new Student("3525"));
        list.add(new Student("5523"));

         Map<String,List<Student>> map =new HashMap<>();
         map.put("1",list);
        map.put("2",list);
        for (String i : map.keySet()) {
            System.out.println("key: " + i + " value: " + map.get(i));
        }
        for (Map.Entry<String, List<Student>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<Student> values = entry.getValue();
            for (Student value : values) {
                System.out.println(key +  " --> "  + value.getAge());
            }
        }
        //ArrayList 一般用法
//        List<Student> list = new ArrayList();
//        //添加一个元素
//        list.add(new Student("18"));
//        list.add(new Student("20"));
//        //获取元素
//        Student s = list.get(0);
//        //删除元素
//        list.remove(s);
//        //清空数组
//        list.clear();
//        System.out.println(list);
//
//        //List 遍历（循环） for each
//        //定义一个只能容纳Firm的List集合 ,<>指定类型
//        List<Student> list1 = new ArrayList();
//        //添加一个元素
//        list1.add(new Student("18"));
//        list1.add(new Student("20"));
//        list1.add(new Student("33"));
//        list1.add(new Student("27"));
//
//        for (Student ele:list1){
//            System.out.println(ele.getAge());
//        }




//        //定义一个只能容纳Student的set集合，<>指定类型
//        Set<Student> set = new HashSet<>();
//        //添加一个元素
//        set.add(new Student("20"));
//        set.add(new Student("20"));
//        //获取元素要通过迭代器获取
//        Student stu = set.iterator().next();
//        System.out.println(set+"stu================");
//        //删除元素
//        set.remove(stu);
//        //清空集合
//        set.clear();

    }
}
