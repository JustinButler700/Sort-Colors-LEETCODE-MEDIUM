// Justin Butler 10/26/2021
// we map the count of each color, then return red, white and blue in order of count.
/*
Runtime: 0 ms, faster than 100.00% of Java online submissions for Sort Colors.
Memory Usage: 37.6 MB, less than 71.65% of Java online submissions for Sort Colors.
*/
// My first iteration of this was a bubble sort, which got 2ms. Not the fastest :(
class Solution {
    public void sortColors(int[] nums) 
    {
        int red = 0;  
        int white = 0;
        int blue = 0;
        for(int i = 0; i < nums.length; i++)
        {
            switch(nums[i])
            {
                case 0:
                    red++;
                    break;
                case 1:
                    white++;
                    break;
                case 2:
                    blue++;
                    break;
                    
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(i <red)
            {
                nums[i] = 0;
            }
            else if(i<red+white)
            {
                nums[i]= 1;
            }
            else
            {
                nums[i]= 2;
            }
        }
        
    }
}
