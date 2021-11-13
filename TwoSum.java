class TwoSum{
     boolean twoSum(int arr[],int target)
     {
          //HashSet to store previous values
          HashSet<Integer> set=new HashSet<>();
          for(int val:arr)
          {
               if(set.contains(target-val))
                    return true;
               set.add(val);
          }
          return false;
     }
}