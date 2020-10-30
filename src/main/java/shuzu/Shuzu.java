package shuzu;

public class Shuzu {
    public static void main(String[] args) {
        Object[] objects = new Object[10];
        for (int x = 0; x < objects.length; x++) {
            System.out.println(objects[x]);
        }
        for (Object element : objects) {
            System.out.println(element);
        }
    }
}
