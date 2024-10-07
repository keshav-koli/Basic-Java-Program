package Array;

public class BasicArray2 {
    public static void main(String[] args) {
        int [] arr={1,2,'c',4,'*'};// char is converted to ASCII value
        byte [] arr2={1,2,3,4,5};
        //arr2[0]=130; // error: incompatible types: possible lossy conversion from int to byte
        System.out.println(arr.length);
        int j=0;
        while (j<arr.length) {
            System.out.println(arr[j]);
            j++;
        }
        while (j<arr2.length) {
            System.out.println(arr2[j]);
            j++;
        }
    }
}
