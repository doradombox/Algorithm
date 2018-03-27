package priv.scor.example.Algorithm;

/**
 * 欧几里德算法,又称辗转想出法,是指勇于计算两个正整数a,b的最大公约数
 * <br>
 * 
 * 最大公因数，也称最大公约数、最大公因子，指两个或多个整数共有约数中最大的一个。a，b的最大公约数记为（a，b），
 * 同样的，a，b，c的最大公约数记为（a，b，c），多个整数的最大公约数也有同样的记号。求最大公约数有多种方法，
 * 常见的有质因数分解法、短除法、辗转相除法、更相减损法。与最大公约数相对应的概念是最小公倍数，a，b的最小公倍数记为[a，b]
 * @author huangwenbo
 * 
 * 
 *
 */
public class EuclideanAlgorithm {
    
    
    static int count = 0;
    public static void main(String[] args) {
        
        //0除以任何一个数都得0 可以整除.所以0与一个数的最大公约数是这个数本身
        System.out.printf("(615,1997)最大公约数为:%d",gcd(615,1997));
        System.out.println();
        selfAddMinus();
    }
    
    public  static int gcd(int p,int q) {
        count++;
        if(q == 0)
            return p;
        int r = p % q;//对于a%b,如果a<b,则直接等于a.
        System.out.printf("第%d次计算,计算因子为:%d,余数为:%d",count,q,r);
        System.out.println();
        return gcd(q,r);
    }
    
    /**
     * 既然用到运算符这里就多扩展一下
     * @return
     */
    static void selfAddMinus() {
        int a = 3;
        int b = ++a;
        int c = 3;
        int d = --c;
        System.out.println("进行自增运算后的值等于"+b);
        System.out.println("进行自减运算后的值等于"+d);
    }
    
}
