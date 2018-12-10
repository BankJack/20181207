package test3;

import java.io.*;

public class Test1 {
    /**
     * 通过字符输入流读取文件
     * @param args
     */
    public static void main(String[] args) {
       /* File file = new File("E:/abc.txt");
        if (file.exists())
            file.delete();
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        //test1("E:/abc.txt");

        test2();
    }

    private static void test2() {
        try {
            Reader reader = new FileReader("E:/abc.txt");
            char[] chars = new char[1024];

            int len;
            while ( (len = reader.read(chars)) != -1){
                String str = new String(chars,0,len);
                System.out.println(str);
            }

            //关闭流
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void test1(String path) {
        try {
            Reader reader = new FileReader(path);
            int i;
            while ((i = reader.read()) != -1){ //每次读一个字符
                char c = (char) i;
                System.out.println(c);
            }

            reader.close(); //关闭流
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
