import java.util.Arrays;

public class Main {

    public static void main(String args[]) {

        FormPseudographics instant = new FormPseudographics();

        int number1 = 0;
        int number2 = 1;

        if(isNumber(number1)){
            instant.printPseudographic(number1);
        }

        if(isNumber(number2)){
            instant.printPseudographic(number2);
        }
  }

    public static boolean isNumber(String s){
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex)
        {
            return false;
        }
    }

    public static boolean isNumber(Object o)
    {
        return o instanceof Integer;
    }
}

