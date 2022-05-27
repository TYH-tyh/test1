import static bishi.Dict.sentence;
import static leetcode.LongestPalindrome.longestPalindrome;

/**
 * @auther 田义会
 * @date 2022/4/25 19:40
 */
public class main {
    public static void main(String[] args) {
       /* int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        //int res = maxSubSum(nums);
        int[] res=twoNumSum(nums,-1) ;
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+"  ");
        }*/
//        String s="abcoefoxyozzopp";
//        List<Integer> resu = eachIndexOfChar(s,'o');
//        System.out.print(resu);

        String s = "abccccdd";

        int re = longestPalindrome(s);
        //System.out.print(re);
        String st = "abcdefghijklmnopqrstuvwxyz";
        int[] count = new int[128];
        int length = st.length();
        for (int i = 0; i < length; ++i) {
            char c = st.charAt(i);
            System.out.print(c);
            count[c]++;
            System.out.print(count[c]);
        }


        String str = "pineapplepenapple";
        String[] wordDict = {"apple", "pen", "applepen", "pine", "pineapple"};
        System.out.println(sentence(str, wordDict));


        //int[] result = twoNumSum(nums,15);
        //int[] result =quickSort(nums,0,nums.length-1);
        /*int[] result =mergeSort(nums);
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+"  ");
        }*/
        //System.out.println(result[0]+" "+result[1]);
        /*List<Integer> res = new ArrayList<>();
        res=majorityElement(nums);
        System.out.println(res.toString());*/

        /*int[][] sample = new int[100][10];
        sample =getRandomArray();
        for(int i=0;i<sample.length;i++){
            for(int j=0;j<sample[i].length;j++){
                System.out.print(sample[i][j]+"  ");
            }
            System.out.print("\n");
        }*/
    }
}
