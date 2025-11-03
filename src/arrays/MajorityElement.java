package arrays;

public class MajorityElement {

    public static void main(String[] args) {
        int [] arr = {2,2,1,1,1,2,2};
        System.out.println("Majority: "+majorityElemeny(arr));
    }

    public static int majorityElemeny(int [] arr){
        int count = 0;
        int n = arr.length;
        int ele = arr[0];
        for(int i = 0; i < n; i++){
            if(count == 0){
                ele = arr[i];
            }
            if(ele == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        count = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == ele){
                count++;
            }
        }

        if(count>n/2){
            return ele;
        }

        return -1;
    }
}
