package array;

class Majority_Element {
    public static int majorityElement(int[] nums) {

       int count = 0;
       int maj = 0;
       for(int num : nums){
           if(count ==0){
               maj = num;
           }
           if(maj == num){
               count++;
           }
           else{
               count--;
           }
       }
       return maj;
    }
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
}
