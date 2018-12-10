package test4;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            OutputStream out = new FileOutputStream("E:/abc.txt",true);
            Writer writer = new OutputStreamWriter(out,"utf-8");
            BufferedWriter buffer = new BufferedWriter(writer);

            buffer.newLine(); //换行
            buffer.write("abcdefg");

            buffer.flush();
            buffer.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {//不支持的编码方式的异常
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
