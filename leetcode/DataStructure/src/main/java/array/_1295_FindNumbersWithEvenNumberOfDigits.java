package array;

public class _1295_FindNumbersWithEvenNumberOfDigits {

    //          number digit = number/10;
    public int findNumbers(int[] nums) {
        int numEven = 0;
        //
        for(int currNum: nums){
            int numDigits = 0;
            while(currNum!=0){
                currNum = currNum/10;
                numDigits++;
            }
            if(numDigits%2==0) numEven++;
        }
        return numEven;
    }

    //      Using Math.log
    public int findNumbersVer2(int[] nums) {
        int numEven = 0;

        for(int curNum: nums){
            int numDigits = (int)Math.floor(Math.log10(curNum) + 1);
            if(numDigits%2==0) numEven++;
        }
        return numEven;
    }
}
