package ch.supsi.transformer;

public class FizzBuzzNumberTransformer implements  NumberTransformer{
    @Override
    public String transform(int number) {

        if((number % 3 == 0) && number % 5 == 0){
            return "FizzBuzz";
        }
        else if(number % 3 == 0){
           return "Fizz";
        }
        else if(number % 5 == 0){
            return "Buzz";
        }

        return String.valueOf(number);
    }
}
