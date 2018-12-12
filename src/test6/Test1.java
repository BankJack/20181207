package test6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {

        //write();

        read();
    }

    public static void write(){
        Student stu1 = new Student("t001","张飒1",18,'男');
        Student stu2 = new Student("t002","张飒2",18,'男');
        Student stu3 = new Student("t003","张飒3",18,'男');
        Student stu4 = new Student("t004","张飒4",18,'男');

        List<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("E:/student"));
            out.writeObject(list);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 反序列化，将序列化后的文件还原为对象
     */
    public static void read(){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("E:/student"));
            Object obj = in.readObject();
            if (obj instanceof List){
                List<Student> list = (List<Student>) obj;
                list.stream().forEach(System.out::println);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
