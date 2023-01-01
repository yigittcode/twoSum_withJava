
import java.util.Arrays;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {

int arr [] = {1,3,5,4};

        System.out.println(Arrays.toString(sum(arr, 5)));

    }


public static int [] sum(int arr [] , int target){
        HashMap<Integer, Integer> map = new HashMap();

        for (int i =0; i < arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                return new int [] {map.get(complement) , i};
            }
            else{
                map.put(arr[i], i);

            }
        }

return null;

}

}
