package ch2;

public class forExam {
    public static void main(String[] args) {
//        for(int i=0, j=0; i<10; i++, j++) {
//            System.out.println(i+j);
//        }

        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        

//        for(int i=0; i<arr.length; i++) {
//            for(int j=0; j<arr[i].length; j++) {
//                System.out.println(arr[i][j]);
//            }
//        }
        
        for(int[]a:arr) {
        	for(int b:a) {
        		System.out.println(b+"\t");
        	}
        	System.out.println();
        }
    }
}