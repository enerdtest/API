package OOPs.Algo;

public class Division extends OOPs.Abstract.Division {
    @Override
    public int divisionWithoutOperation(int num1, int num2) {
        if (num1 == 0)
            return 0;
        if (num2 == 0)
            return Integer.MAX_VALUE;

        boolean negResult = false;
        if (num1 < 0){
            num1 = -num1;
            if (num2 < 0)
                num2 = - num2;
            else
                negResult = true;
        } else if (num2 < 0){
            num2 = - num2;
            negResult = true;
        }

        int quotient = 0;
        while (num1 >= num2){
            num1 = num1 - num2;
            quotient++;
        }
        if (negResult)
            quotient = -quotient;

        return quotient;
    }

    @Override
    public int divisionSubtracting(int num1, int num2) {
        int sign =((num1 < 0) ^ (num2 < 0)) ? -1 : 1;
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        int quotient = 0;
        while (num1 >= num2){
            num1 -= num2;
            ++quotient;
        }
        return sign * quotient;
    }
}
