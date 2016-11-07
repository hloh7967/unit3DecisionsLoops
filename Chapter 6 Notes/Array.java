public class Array {
    public static void main(String[] args) {
        String[][] array = new String[36][3];
        
        array[0][0] = "first of first";
        array[0][1] = "1";
        array[0][2] = "^";
        array[1][0] = "*";
        
        for (String str : array[0]) {
            System.out.print(str + " ");
        }
    }
}