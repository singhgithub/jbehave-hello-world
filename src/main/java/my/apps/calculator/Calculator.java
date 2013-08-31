package my.apps.calculator;

public class Calculator {

    public int sum(int... nums) {
        int sum = 0;
        for ( int num : nums ) {
            sum += num;
        }

        return sum;
    }
}
