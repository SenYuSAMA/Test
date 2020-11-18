package wrapper;

/**
 * @description:
 * @author: l1usy
 * @time: 2020/11/10 21:12
 */
public class TestWrapper {
    public static void main(String[] args) {
        testExam();
    }

    public static Integer testReturn(int a){
        int b = a;
        return b;
    }

    public static void parseTest(){
        int a = 1;
        String s1 = Integer.toString(1);
        System.out.println("s1的值" + s1);
        Integer b = 2;
        String s2 = b.toString();
        System.out.println("s2的值" + s2);
        String s3 = String.valueOf(b);
        System.out.println("s3的值" + s3);

    }

    public static void compareTest(){
        Integer three = 100;
        System.out.println("three==100的结果" + (three==100));
        Integer four = 100;
        System.out.println("three==four的结果" + (three==four));
        Integer five = 200;
        Integer six = 200;
        System.out.println("five==six的结果" + (five==six));
    }

    public static void testExam(){
        Integer i = new Integer(1) + new Integer(2);
        switch (i){
            case 3:
                System.out.println("hello");
                break;
            default:
                System.out.println("baby");
                break;
        }
    }

}
