package string;

/**
 * @description:
 * @author: l1usy
 * @time: 2020/11/10 22:26
 */
public class Test {
    public static void main(String[] args) {
        test6();
    }

    public static void  test2(){
        String str = "abcdefg";
        char ch = str.substring(3,6).charAt(1);
        System.out.println(ch);
    }

    public static  void test1(){
        String str = "Hello,Imooc!";
        str = str.substring(2,5);
        char ch = str.charAt(str.length());
        System.out.println(ch);
    }

    public static void test3(){
        String str = "abcdefg";
        str = str.substring(2,5);
        str = str.toUpperCase();
        str = str.replace("DE","MM");
        System.out.println(str);
    }

    public static void test4(){
        String str = null;
        System.out.print(str);
    }

    public static void test5(){
        String s = "JAVA 编程 基础";
        byte[] bytes = s.getBytes();
        for(byte i : bytes){
            System.out.print(i + " ");
        }
        String str = new String(bytes);
        System.out.println(str);
    }

    public static void test6(){
        String str1 =  "hello";
        str1.concat("121313");
        System.out.println(str1);
    }

}
