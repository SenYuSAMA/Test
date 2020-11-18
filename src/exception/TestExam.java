package exception;

import java.util.Scanner;

/**
 * @description:慕课网选择题
 * @author: l1usy
 * @time: 2020/11/5 20:27
 */
public class TestExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        try {
            test(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void test(String str) throws Exception{
        if(str==null || str.length()==0){
            throw new Exception("参数不能为空");
        }else {
            System.out.println("str : " + str);
        }
    }

}
