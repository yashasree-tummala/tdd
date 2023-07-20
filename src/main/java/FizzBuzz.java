public class FizzBuzz {
    public String convert(int number) throws NegativeNumberException{
        if(number < 0) throw new NegativeNumberException();

        if (isDivisibleBy(number, 3) && isDivisibleBy(number, 5))
            return "FizzBuzz";
        if (isDivisibleBy(number, 3))
            return "Fizz";
        if(isDivisibleBy(number, 5))
            return "Buzz";
        return Integer.toString(number);
    }

    private boolean isDivisibleBy(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
