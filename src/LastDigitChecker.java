public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(9,22,8981));
        System.out.println(isValid(356));

    }

    public static boolean hasSameLastDigit (int numOne, int numTwo, int numThree){
        int lastDigitFirst = numOne % 10;
        int lastDigitSecond = numTwo % 10;
        int lastDigitThird = numThree % 10;

        if(numOne >= 10 && numOne <= 1000 && numTwo >= 10 && numTwo <= 1000 && numThree >= 10 && numThree <= 1000){
            if(lastDigitFirst == lastDigitThird || lastDigitFirst == lastDigitSecond || lastDigitThird == lastDigitSecond){
                return true;
            }
        }
        return false;
    }

    public static boolean isValid (int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }


}
