class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        //new n-element array
        int[] result = new int[num_people];
        
        int left=candies;
        int given=1;
        //use the while loop to repeat distributing candy again
        while(left!=0){
            for(int i=0;i<num_people;i++){
                if((left-given)>=0){
                    left-=given;
                    result[i]+=given++;
                }
                else{
                    result[i]+=left;
                    return result;
                }
            }
        }
        return result;
    }
}