package bishi;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther 田义会
 * @date 2022/4/12 19:42
 */
public class TwoNumSum {
    public static int[] twoNumSum(int[] nums, int sum) {
        /*int[] res = new int[2];
        int min=0;
        int max=nums.length-1;
        while(min != max){
            if(nums[min]+nums[max]>sum){
                max--;
            }else if(nums[min]+nums[max]<sum){
                min++;
            }else {
                res[0]=nums[min];
                res[1]=nums[max];
                break;
            }
        }
        return res;*/
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (hashmap.containsKey(sum - nums[i])) {
                res[0] = i;
                res[1] = hashmap.get(sum - nums[i]);
                return res;
            }
            hashmap.put(sum - nums[i], i);
        }
        return new int[0];
    }
}
