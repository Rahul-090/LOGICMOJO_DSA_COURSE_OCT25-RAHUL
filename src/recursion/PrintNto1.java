package recursion;

public class PrintNto1 {

    public static void main(String [] args){
//        printNto1(5);
        print10to1(1);
    }

    public static void printNto1(int n){
        if(n == 0){
            System.out.println();
            return;

        }
        printNto1(n-1);
        System.out.print(" "+n);

    }

    //print 1toN without using + operator

    public static void print1toN(int n){
        if(n == 0){
            return ;
        }
        print1toN(n-1);
        System.out.println(n);
    }

    //print 10 to 1 without using - operator

    public static  void print10to1(int n){
        if(n == 11){
            return;
        }
        print10to1(n+1);
        System.out.println(n);
    }


}
