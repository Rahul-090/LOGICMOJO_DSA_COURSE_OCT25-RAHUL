package searching;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c', 'j', 'j'};
        System.out.println("Find smallest Letter than target(Similar to finding ceiling): "+findLetter(arr,'d'));

    }

    public static char findLetter(char [] arr, char target){
        int start = 0;
        int end = arr.length-1;
        char ans = arr[0];
        while(start <= end){
            int mid = start+(end-start)/2;
             if(target > arr[mid]){
                start = mid+1;
            }else{
                ans = arr[mid];
                end = mid-1;
            }
        }
        return ans;
    }
}
