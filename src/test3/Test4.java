package test3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test4 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("F:/abc.txt",true);
            BufferedWriter buffer = new BufferedWriter(writer);

            String str1 = "你好java";
            String str2 = "今天我们学习javaIO操作";
            buffer.write(str1);
            buffer.newLine(); //换行

            buffer.write(str2);
            buffer.newLine();

            //刷新流
            buffer.flush();
            //关闭流
            buffer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
