package ch2;
import java.util.Arrays;

public class toCharArray {
    public static void main(String[] args) {
        String str8 = "hello java!";
        String str9 = "안녕, 자바!";
        
        byte[] array1 = str8.getBytes();
        System.out.println(Arrays.toString(array1));
        
        byte[] array2 = str9.getBytes();
        System.out.println(Arrays.toString(array2));
        
        char[] array3 = str8.toCharArray();
        System.out.println(Arrays.toString(array3));
        
        char[] array4 = str9.toCharArray();
        System.out.println(Arrays.toString(array4));
        
    }
}
