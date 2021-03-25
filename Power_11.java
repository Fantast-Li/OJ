package 剑指offer;
//给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
//
//保证base和exponent不同时为0
//示例1
//输入
//复制
//2,3
//返回值
//复制
//8.00000

public class Power_11 {
    public double power(double base, int exponent) {
        if (exponent == 0) {
            return (double) 1 ;
        }
        double result = 1 ;
        for (int i = 0; i < exponent ; i++) {
            result*=base;
        }
        if (exponent < 0 ){
            int x = -1*exponent ;
            for (int i = 0; i < x ; i++) {
                result*=(1/base);
            }
        }
        return result;
    }
}
