package javaIO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：
 *    往文件中写数据
 *    写数据 --输出流--FileWriter

 * FileWrite:
 *       方法 FileWeiter(String fileName) : 传递一个文件名称
 *
 * 输出流写数据的步骤
 *      1：创建输出流对象
 *      2：调用输出流对象的写数据方法
 *      3.释放资源
 */

public class FileWriterDemo {
    public static void main(String[] args) throws IOException {
        //创建对象
        FileWriter fw = new FileWriter("d:\\a.txt");
        /**
         *  创建输出流对象做了那些事：
         *      1.调用系统资源创建了一个文件
         *      2.创建输出流对象
         *      3.把输出流指向文件
         */
        //写数据
        fw.write("ISsdjsd");
        //更新数据
        fw.flush();
        //释放数据
        fw.close();
        //一共4个步骤

    }
}
