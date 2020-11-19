package io;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @description:转换流的测试，将字节流转换为字符流
 * @author: l1usy
 * @time: 2020/11/19 21:48
 */
public class IOWriterReaderTest {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("newbee.txt");
            InputStreamReader reader = new InputStreamReader(fis);
            FileOutputStream fos = new FileOutputStream("newbeecpy.txt");
            OutputStreamWriter writer = new OutputStreamWriter(fos);
            BufferedReader bfr = new BufferedReader(reader);
            BufferedWriter bfw=  new BufferedWriter(writer);
            int n;
            char[] c = new char[3];
            /*while((n=reader.read())!=-1){
                System.out.print((char)n);
            }*/
            /*while((n=reader.read(c))!=-1){
                String s =new String(c,0,n);
                System.out.print(s);
            }*/
            while((n=bfr.read(c))!=-1){
                bfw.write(c,0,n);
                bfw.flush();
            }
            fis.close();
            fos.close();
            writer.close();
            reader.close();
            bfw.close();
            bfr.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
