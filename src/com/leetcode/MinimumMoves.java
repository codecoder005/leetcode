package com.leetcode;
/*
Problem LEVEL: MEDIUM
-----------------------------------------------------------------------------
	Given an integer array nums of size n, return the minimum number of moves
	required to make all array elements equal.

	In one move, you can increment or decrement an element of the array by 1.
	Test cases are designed so that the answer will fit in a 32-bit integer.

Example 1:
-----------------------------------------------------------------------------
	Input: nums = [1,2,3]
	Output: 2
	Explanation:
	Only two moves are needed (remember each move increments or decrements one element):
	[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

Example 2:
-----------------------------------------------------------------------------
	Input: nums = [1,10,2,9]
	Output: 16

Constraints:
-----------------------------------------------------------------------------
	n == nums.length
	1 <= nums.length <= 105
	-109 <= nums[i] <= 109
*/
public class MinimumMoves {
    public static void main(String[] args) {
        int[] nums = {203125577,-349566234,230332704,48321315,66379082,386516853,50986744,-250908656,-425653504,-212123143};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        int l = nums.length;
        long minMoves = Long.MAX_VALUE;
        for(int i=0;i<l;i++){
            long elementWiseMinMoves = 0L;
            for(int j=0;j<l;j++){
                if(i==j) continue;
                else{
                    if(nums[i]>nums[j]){
                        elementWiseMinMoves += nums[i] - nums[j];
                    }else {
                        elementWiseMinMoves += nums[j] - nums[i];
                    }
                }
            }
            //System.out.println("for "+nums[i]+" -> "+elementWiseMinMoves);
            if(elementWiseMinMoves<minMoves){
                minMoves = elementWiseMinMoves;
            }
        }
        //System.out.println("minMoves: "+minMoves);
        return (int) minMoves;
    }
}


/*
SOLVED ON: Thu 30th June 2022
*/