package test4;

import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        try {
            InputStream in = new FileInputStream("F:/武林.txt");

            //将字节输入流转换为字符输入流
            Reader reader = new InputStreamReader(in,"utf-8");
            BufferedReader buffer = new BufferedReader(reader);
            while (buffer.ready()){
                String line = buffer.readLine();
                System.out.println(line);
            }

            //关闭流
            buffer.close();
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) { //不支持的编码方式的异常
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
