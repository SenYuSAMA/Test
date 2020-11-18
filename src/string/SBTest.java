package string;

/**
 * @description:
 * @author: l1usy
 * @time: 2020/11/11 18:50
 */
public class SBTest {
    public static void test1(){
        StringBuilder sb = new StringBuilder("abcdefg");
        sb.delete(2,4);
        System.out.println(sb);
        sb.insert(3,"CD");
        System.out.println(sb);
    }

    public static void test2(){
        StringBuilder sb = new StringBuilder("欢迎来到");
        System.out.println(sb);
        sb.append("imooc");
        System.out.println(sb);
        sb.delete(0,4);
        System.out.println(sb);
        sb.append("你好！");
        System.out.println(sb);
        sb.replace(2,3,",");
        System.out.println(sb);
    }

    public static void main(String[] args) {
         test2();
    }
}
