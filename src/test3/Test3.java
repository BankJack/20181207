package test3;

import java.io.*;

public class Test3 {
    /**
     * 带缓存的字符输入流
     * @param args
     */
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("F:/武林.txt");
            BufferedReader buffer = new BufferedReader(reader);

            while (buffer.ready()){  //判断是否有数据可读
                String line = buffer.readLine(); //每次读一行数据
                System.out.println(line);
            }

            //关闭流
            buffer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
