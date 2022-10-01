package staday;
import java.util.*;

public class day0re {

    public static void weightedMean(List<Integer> X, List<Integer> W) {

        float r = 0 ;

        int sum = 0 ;
        for(int i = 0 ; i < X.size() - 1 ; i++){
            sum += (X.get(i) * W.get(i)) ;
        }
        int d = 0 ;
        for(int j = 0 ; j < W.size() - 1 ; j++){
            d += W.get(j) ;
        }
 
        r = (float) sum / d ;
      
        System.out.printf("%.1f",r);

    
    }
    
   
    public static ArrayList<Integer> InputArrayList( ArrayList<Integer> a,int n){
        Scanner s = new Scanner(System.in);
    

        for(int i = 0 ; i < n ; i++){
            System.out.print("Enter the "+i+" element for arraylist :- ");
            a.add(i,s.nextInt());
            System.out.println();
        }



        return a ;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> X = new ArrayList<>(n);
        X = InputArrayList(X, n);
        ArrayList<Integer> W = new ArrayList<>(n);
        W = InputArrayList(W, n);

        System.out.println("The X arrayList :- "+X);
        System.out.println("The W arrayList :- "+W);
                
    }
}
