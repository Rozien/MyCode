import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//接收键盘输入的数字
        System.out.print("请输入一个整数：\n");
        if (scanner.next().equals("4")) {        //判断输入的整数是否为4
            System.out.print("*\n**\n***\n****");//若为4，输出图形
        } else {
            System.out.print("输入错误");          //若不为4，则提示输入错误
        }
        scanner.close();
    }
}
