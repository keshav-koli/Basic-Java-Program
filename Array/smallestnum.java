package Array;

public class smallestnum {
    public static void main(String[] args) {
        
    
    int arr[] = { 10, 20, 30, 50, 40, 9,1, 02, 20, 47 };
   int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++)
    {
        if(arr[i]<smallest){
            secondsmallest=smallest;
            smallest=arr[i];
        }
        else if(arr[i]<secondsmallest && arr[i]!=smallest){
            secondsmallest=arr[i];
        }

    }
    if (secondsmallest == Integer.MAX_VALUE) {
        System.out.println("No second smallest number found.");
    } else {
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondsmallest);
    }
}
}