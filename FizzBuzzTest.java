public class FizzBuzzTest {
    public static void main(String[] args) {

        FizzBuzzConverter fizzBuzz = new FizzBuzzConverter();

        String test1Input = fizzBuzz.convert(1), expectedResult1 = "1", test1Result;
        test1Result = isEqual(test1Input, expectedResult1);
        System.out.println(test1Result);

        String test2Input = fizzBuzz.convert(3), expectedResult2 = "Fizz", test2Result;
        test2Result = isEqual(test2Input, expectedResult2);
        System.out.println(test2Result);
    


    }

    public static String isEqual(String fizzBuzzOutput, String expectedResult) {
        String result;

        if(fizzBuzzOutput.equals(expectedResult)){
            result = "Test passed: " +  expectedResult + " was returned";
        }
        else {
            result = "Test failed: " + expectedResult + " was not returned";
        }
        
        return result;

    }
}

