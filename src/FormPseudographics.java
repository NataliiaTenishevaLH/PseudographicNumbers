import java.util.HashMap;
import java.util.Map;

public class FormPseudographics {
   private Map<Integer, String[][]> pseudographicStorage = new HashMap<Integer, String[][]>();

   public FormPseudographics(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("  ___  ").append("*");
        stringBuilder.append(" / _ \\ ").append("*");
        stringBuilder.append("| | | |").append("*");
        stringBuilder.append("| | | |").append("*");
        stringBuilder.append("| | | |").append("*");
        stringBuilder.append(" \\___/ ").append("*");
        pseudographicStorage.put(0, formArray(stringBuilder));

       StringBuilder stringBuilder1 = new StringBuilder();
       stringBuilder1.append("   __  ").append("*");
       stringBuilder1.append("  /_ | ").append("*");
       stringBuilder1.append("   | | ").append("*");
       stringBuilder1.append("   | | ").append("*");
       stringBuilder1.append("   | | ").append("*");
       stringBuilder1.append("   |_| ").append("*");
       pseudographicStorage.put(1, formArray(stringBuilder1));
   }

    private String[][] formArray(StringBuilder stringBuilder) {
       String[][] array = new String[6][7];

       int row = 0;
       int column = 0;
       for (int i = 0; i < stringBuilder.length(); i++) {
           char c = stringBuilder.charAt(i);

           if ((c) == '*') {
               row++;
               column = 0;
           } else {
               array[row][column] = Character.toString(c);
               column++;
           }
       }
       return array;
   }

   public void printPseudographic(int number){

      String[][] array = pseudographicStorage.get(number);

       StringBuilder result = new StringBuilder();
       for(int i = 0; i <= 5; i++){

            for(int j = 0; j <= 6; j++){
               result.append(array[i][j]);
           }
           result.append("\n");

       }
      System.out.print(result.toString());
     }
   }




