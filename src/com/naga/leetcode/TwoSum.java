package com.naga.leetcode;

public class TwoSum {


    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{0,3,-3,4,-1},-1));
    }
        public static  int[] twoSum(int[] nums, int target) {

            int[] output = new int[2];
            int temp = 0;
            for(int i = 0;i < nums.length; i++){

                temp = nums[i];
                for(int j= i+1;j<nums.length;j++){
                    if( (temp + nums[j]) == target){
                        output[0] = i;
                        output[1] = j;
                    }
                }

            }//for
            System.out.println(output[0]);
            System.out.println(output[1]);
            return output;
        }//method



}
