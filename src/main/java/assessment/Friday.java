package assessment;

public class Friday {

    public static void printChar(){
        System.out.println('y');
    }

    public static char returnChar(char aChar){
        return aChar;
    }

    public static int[] returnAnArrayOfInt(){
        return new int[]{1,2,3,4};
    }


    public static void main(String[] args) {

        printChar();
        returnChar('c');
        returnAnArrayOfInt();

        if(true){
            System.out.println("true");
        }

    }
}
