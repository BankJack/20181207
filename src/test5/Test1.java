package test5;


import java.io.*;

public class Test1 {
    public static void main(String[] args) {
        DataInputStream dis;
        try {
            dis = new DataInputStream(new FileInputStream("E:/data.txt"));

            String str = dis.readUTF();
            int num = dis.readInt();
            boolean bool = dis.readBoolean();

            System.out.println(str);
            System.out.println(num);
            System.out.println(bool);

            dis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
