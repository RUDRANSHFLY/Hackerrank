package staday;
import java.util.*;

public class day0{


    public static double Median(int[] m , int n ){
        double r = 0 ;
        if(n % 2 == 0){
            int f = n / 2 ;
            int s = f + 1 ;
            int sum = m[f -1 ] + m[s - 1] ;

            r = (double) sum / 2;
        }else{
            int f = ( n + 1 ) / 2 ;
            r = m[f - 1] ;
        }
        return r ;    
    }

    public static int Mode(int[] m , int n){
        int r = 0 ;
        int cout = 1 ;
        int max = 0 ;
        int mode = 0 ;

        for(int i = 0 ; i < n  - 1 ; i++){
            if(m[i] == m[i+1]){
                cout++;
                if(cout > max){
                    max = cout ;
                    mode = m[i] ;
                }
               
            }
            else{
                cout = 1 ;
            }
        }
        r = mode ; 

        if(r == 0){
            r = m[0] ;
        }


        return r ;
    }
    public static double Mean(int[] m , int n){
        double r = 0 ;
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            sum += m[i] ;
        }

        double me = (double)  sum / n ;

        System.out.println("The Sum of Total obserrvation :-  "+sum);
        System.out.println("The Mean of Observation is :- "+me);
       // Math.round(me);
        System.out.println("The rounded Mean is :- "+me);
        r = me ;
        return r ;
    }

    public static int[] SortArray(int[] m, int n){
       // insertion sort //
       for(int i = 0 ; i < n - 1 ; i++){
            int sma = i ;
            for(int j = i + 1 ; j < n ; j++){
                if(m[sma] > m[j]){
                    sma = j ;
                }
                
            }
            int temp = m[sma] ;
            m[sma] = m[i] ;
            m[i] = temp ;
        }

       
       
       
        return m ;
    }


    public static int[] Arrayinput(int n){
        int[] m = new int[n];
        try (Scanner s = new Scanner(System.in)) {
            for(int i = 0 ; i < n ; i++){
                System.out.print("Enter the value for "+i+" the element :- ");
                m[i] = s.nextInt();
                System.out.println();
                
            }
        }
        return m ;
    }

    public static void printArray(int[] m){
        for(int i = 0 ; i < m.length  ; i++){
            System.out.print(m[i]+" ");
        }
    }
    

    public static void main(String[] args) {
         try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter the no of observation :- ");
             int n = s.nextInt();

            int[] m = new int[n];
            m = Arrayinput(n) ;
            printArray(m);
            System.out.println();
            System.out.print("The Sorted Array :- ");
            SortArray(m, n);
            printArray(m);
            double r = Mean(m, n);
            System.out.println(r);
            System.out.println(Median(m, n));
            System.out.println(Mode(m, n));
        }
    }
}