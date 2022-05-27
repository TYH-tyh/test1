package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @auther 田义会
 * @date 2022/4/7 18:07
 * @description leetcode 229、多元元素II
 */
public class MajorityElement {
    public static List<Integer> majorityElement(int[] nums) {
        int len = nums.length;
        List<Integer> res = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            map.put(nums[i], (map.containsKey(nums[i]) ? (map.get(nums[i]) + 1) : 1));
            /*if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else {
                map.put(nums[i],map.get(nums[i])+1);
            }*/
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) > len / 3) {
                res.add(key);
            }
        }
        return res;
    }
}
