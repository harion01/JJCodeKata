package kata;


interface AdvancedArithmetic{
    int divisorSum(int n);
}
class Calculator19 implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0){
                System.out.println("i: " + i);
                sum += i;
            }
        }
        return sum;
    }
}

class CalculatorOdd implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0 && i % 2 == 1){
                System.out.println("odd i: " + i);
                sum += i;
            }
        }
        return sum;
    }
}

class CalculatorEven implements AdvancedArithmetic{
    public int divisorSum(int n){
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            if(n % i == 0 && i % 2 == 0){
                System.out.println("even i: " + i);
                sum += i;
            }
        }
        return sum;
    }

}



public class Day19 {
    public static void main(String[] args) {
        Calculator19 myCalculator = new Calculator19();
        System.out.println("I implemented: AdvancedArithmetic\n" + myCalculator.divisorSum(6));
    }

    public int divSumAll(int origin){
        Calculator19 myCalculator = new Calculator19();
        return myCalculator.divisorSum(origin);
    }

    public int divSumEven(int origin){
        CalculatorEven myCalculator = new CalculatorEven();
        return myCalculator.divisorSum(origin);
    }

    public int divSumOdd(int origin){
        CalculatorOdd myCalculator = new CalculatorOdd();
        return myCalculator.divisorSum(origin);
    }
}