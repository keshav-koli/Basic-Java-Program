package Array;

public class OccurenceOfNumber {
    public static void main(String[] args) {
        int [] a={1,2,4,5,1,2,2,3,3,1,2,1,2};
        for (int i = 0; i < a.length-1; i++) {
            int count=1;
            for (int j = i+1; j < a.length; j++) {
                if(a[i]==a[j] && a[i]!=Integer.MIN_VALUE){
                    count++;
                    a[j]=Integer.MIN_VALUE;
                }
            }
            if(count>1 ){
                System.out.println("Occurence of "+a[i]+" is "+count);
            }
        }
        
    }
    
}
