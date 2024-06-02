class KLengthApart {
    public boolean kLengthApart(int[] nums, int k) {
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                temp.add(i);
                if(temp.size() > 1){
                    int diff =  i - temp.get(temp.size() - 2);
                    if(diff-1 >= k){
                        continue;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
