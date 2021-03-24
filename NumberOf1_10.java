package 剑指offer;

public class NumberOf1_10 {
    //输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
    //示例1
    //输入
    //10
    //返回值
    //2

    public int numberOf(int n ) {
    // 计算机储存编码是二进制 所有可以直接用&   这个数与上1是否 为0  可以判断最后一位是否为1  然后将左移 一位
        //循环条件 32次   也可以是当1 为0 时 即左移32次  缺点:时间复杂多过大
            int count = 0 ;
            int flat = 1 ;
            while (flat!=0) {
                if ((n & flat) !=0 ) {
                count ++ ;
                }
                flat=flat<<1;
            }
            return count;
        }
    public int numberOf1(int n ) {
        int count = 0 ;
        while (n!=0){
            count++;
            n = n&(n-1);
        }
        return count;
    }

}
