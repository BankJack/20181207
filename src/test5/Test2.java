package test5;

import java.io.*;

public class Test2 {
    public static void main(String[] args) {
        try {
            File file = new File("E:/data.txt");
            DataOutputStream out = new DataOutputStream(new FileOutputStream(file));

            out.writeUTF("abcdefghijklmnopqrstuvwxyz严12");
            out.writeInt(10086);
            out.writeBoolean(false);
            out.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
