package io;

import java.io.*;

/**
 * @description:缓冲流不是从硬盘读写，速度会提高的，不能直接读取文件系统
 * @author: l1usy
 * @time: 2020/11/19 21:14
 */
public class BufferInOutTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("p.ppt");
            FileOutputStream fous = new FileOutputStream("pcpy.ppt");
            BufferedOutputStream bos = new BufferedOutputStream(fous);
            int n = 0;
            byte[] b = new byte[1024];
            while(fis.read(b)!=-1){
                bos.write(b);
            }
            bos.close();
            fis.close();
            fous.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}