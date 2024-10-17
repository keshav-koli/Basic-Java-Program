package Array;

public class SearchElement {
    public  boolean finded(int []a,int c){
        boolean b=false;
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]==c){
                b=true;
            }
        }
        return b;
    }


    public static void main(String[] args) {
        int []arr={1,2,3,5,1,2,7,8,9};
        int a=2;
        SearchElement searchElement = new SearchElement();
        System.out.println(searchElement.finded(arr,a));
        
        
    }
}
