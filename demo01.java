public class demo01 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;                         //定义两个变量
        while (i < 100) {
            if (i % 2 == 0)                //用于判断是否是偶数
                sum += i;
            ++i;
        }
        System.out.println("偶数和为" + sum);//输出结果
    }
}
