package Sample;

import javax.naming.spi.DirStateFactory.Result;

public class MethodSample {

    public static void main(String[] args) {
        var number1 = 100;
        var number2 = 10;
        
        sumMethod1(number1, number2);
        
        var result2 = sumMethod2(number1, number2);
        System.out.println("sumMethod2の結果は" + result2);

    }
    
    public static void sumMethod1(int num1, int num2) {
        var result = num1 + num2;
        System.out.println("sumMethod１の結果は" + result);
    }
    
    public static int sumMethod2(int num1, int num2) {
        var result = num1 + num2;
        return result;
    }

}
