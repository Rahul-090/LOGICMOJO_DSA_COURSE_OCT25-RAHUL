package linkedList;

public class HappyNumber {
    public static void main(String [] args){
        int n = 19;
        System.out.println("Happy Number: "+happyNumber(n));
    }

    public static Boolean happyNumber(int n){

        int slow = n;
        int fast = n;

        while(true){
            slow = findSumOfSquare(slow);
            fast = findSumOfSquare(findSumOfSquare(fast));
            if(slow == 1){
                break;
            }
            if(slow == fast){
                return false;

            }

        }
        return true;
    }

    public static int findSumOfSquare(int n){
        int sum = 0;
        while(n > 0){
            int rem = n%10;
            sum+=rem*rem;
            n = n/10;
        }
        return sum;
    }
}
