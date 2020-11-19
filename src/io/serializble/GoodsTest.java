package io.serializble;

import java.io.*;

/**
 * @description:
 * @author: l1usy
 * @time: 2020/11/19 22:47
 */
public class GoodsTest {
    public static void main(String[] args) {
    readObject();
}

    public static void writeObject(){
        Goods goods = new Goods("GD001","电脑",5000);
        try {
            FileOutputStream fos = new FileOutputStream("imooc.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(goods);
            oos.flush();
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readObject(){
        try {
            FileInputStream fis = new FileInputStream("imooc.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Goods goods1 = (Goods)ois.readObject();
            System.out.println(goods1.toString());
            fis.close();
            ois.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
