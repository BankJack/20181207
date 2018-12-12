package test3;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Test2 {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("E:/abc.txt");
            writer.write("你好java");  //直接写一个字符串

            writer.flush();//刷新缓存
            writer.close();//关闭流
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
