package 剑指offer;

public class Fibonacci_09 {
    //大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0，第1项是1）。
    //n\leq 39n≤39
    //
    //示例1
    //输入
    //4
    //返回值
    //3
    public int fibonacci(int n) {
        //使用递归
            if (n == 0) {
                return 0 ;
            }
            if (n ==1) {
                return 1 ;
            }
        return fibonacci(n-1) + fibonacci(n-2);
    }
    // 使用循环
    public int fibonacci2(int n) {
        //使用递归
       if (n == 0 || n ==1) {
           return n;
       }
       int fb1 =0 ;
       int fb2 = 1 ;
        for (int i = 2; i <= n; i++) {
            int tem = fb1+ fb2 ;
            fb1 = fb2 ;
            fb2 = tem;
        }
        return  fb2;
    }
}