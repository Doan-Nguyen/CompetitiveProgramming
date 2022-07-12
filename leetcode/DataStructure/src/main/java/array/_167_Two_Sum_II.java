package array;

public class _167_Two_Sum_II {
    public static int[] twoSum(int[] numbers, int target) {
        int[] indexs = new int[2];
        int i = 0;
        int j = numbers.length - 1;
        while(i != j){
            if(numbers[i] + numbers[j] < target){
                i++;
            }else if(numbers[i] + numbers[j] > target){
                j--;
            }else{
                indexs[0] = i + 1;
                indexs[1] = j + 1;
                return indexs;
            }
        }
        return null;
    }

    public static void main(String args[]){
        int[] numbers = {2,7,11,15};
        int[] r = twoSum(numbers, 9);
        System.out.println(r);
    }
}
