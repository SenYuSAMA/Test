package wrapper;

/**
 * @description:慕课包装类编程题1
 * @author: l1usy
 * @time: 2020/11/10 21:23
 */
public class WrapperExamOne {
        public static void main(String[] args) {
// 定义int类型变量，值为100
            int score = 100;
// 创建Integer包装类对象，表示变量score1的值
            Integer score1 = score;
// 将Integer包装类转换为double类型
            double d1 = score1.doubleValue();
// 将Integer包装类转换为long类型
            long l1 = score1.longValue();
// 将Integer包装类转换为int类型
            int i1 = score1;
//打印输出
            System.out.println("score的值：" + score);
            System.out.println("d1的值" + d1);
            System.out.println("l1的值" + l1);
            System.out.println("i1的值" + i1);
    }
}
