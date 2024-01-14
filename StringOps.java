public class StringOps {
    public static void main(String[] args) {
       // System.out.println(capVowelsLowRest("Hello World"));

      /*  System.out.println(camelCase("Hello World"));
        System.out.println();
        System.out.println(camelCase(" two     words"));
        System.out.println();
        System.out.println(camelCase("world"));
        System.out.println();
        System.out.println(camelCase("   Intro to coMPUter sCIEncE   ")); */

      //  System.out.println(allIndexOf("Hello world",'l'));

    }

    public static String capVowelsLowRest(String string) {
        String str = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                char chr = (char) (string.charAt(i) - 32);
                str = str + chr;
            } else if ((string.charAt(i) > 'A' && string.charAt(i) <= 'Z') && (string.charAt(i) != 'A' && string.charAt(i) != 'E' && string.charAt(i) != 'I' && string.charAt(i) != 'O' && string.charAt(i) != 'U')) {
                char chr = (char) (string.charAt(i) + 32);
                str = str + chr;
            } else {
                str = str + string.charAt(i);
            }
        }
        return str;
    }

  /*  public static String camelCase(String string) {
        String str = "";
        int indexSpace = 0;
        int numberofLetters = string.length();

        int index=0;
        for (int i = 0; i <string.length()-1 ; i++) {
            if((int)string.charAt(i)!=32 && (int)string.charAt(i+1)==32 ){
                indexSpace=i+1;
                break;
            }
        }
       // System.out.println("index:"+indexSpace);

        for (int j = 0; j < indexSpace; j++) {
            if (string.charAt(j) == ' ') {
                continue;
            }
            if ((int) string.charAt(j) >= 65 && (int) string.charAt(j) <= 90) {
                char chr = (char) ((int) string.charAt(j) + 32);
                str = str + chr;
            } else {
                str = str + string.charAt(j);
            }
        }
       // System.out.println(numberofLetters);
        //System.out.println(str);

        for (int i = indexSpace; i < numberofLetters - 1; i++) {
            if (string.charAt(i) ==' ' && string.charAt(i + 1) != ' ') {
                if ((int) string.charAt(i + 1) >= 65 && (int) string.charAt(i + 1) <= 90) {
                    // indexSpaceStart = i + 1; //önceki boş sonraki doluysa yeni indeximiz i+1 dir
                    char chr = (char) ((int) string.charAt(i + 1));
                    str = str + chr;
                 //   System.out.println(str);
                }
                else{
                    char chr = (char) ((int) string.charAt(i + 1)-32);
                    str = str + chr;

                }              //      System.out.println(str);
            }
            if (string.charAt(i) != ' ' && string.charAt(i + 1) != ' ') {

                if ((int) string.charAt(i + 1) >= 65 && (int) string.charAt(i + 1) <= 90) {
                    //     indexSpaceStart = i + 1; //önceki boş sonraki doluysa yeni indeximiz i+1 dir
                    char chr = (char) ((int) string.charAt(i + 1) + 32);
                    str = str + chr;
                  //  System.out.println(str);
                } else {
                    char chr = (char) ((int) string.charAt(i + 1));
                    str = str + chr;

                }


            }
        }
        return str;
    } */


    //        System.out.println((char) ((int) word.charAt(0) + 32));
    public static int[] allIndexOf(String word, char chr) {
        int count=0;

        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)==chr){
                count++;
            }
        }
        int[] array=new int[count];
        int index=0;
        for (int i = 0; i <word.length() ; i++) {
            if(word.charAt(i)==chr){
                array[index]=i;
                index++;
            }
        }
        System.out.print("{");
        for (int i = 0; i <array.length ; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i]);
            }
        }
        System.out.print("}");

        return array;
    }
}

