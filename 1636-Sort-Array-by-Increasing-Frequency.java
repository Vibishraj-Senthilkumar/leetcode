class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        Integer arr[] = new Integer[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=nums[i];
        }
        Arrays.sort(arr,(a,b)->{
            if(hm.get(a)==hm.get(b))
            {
                return b-a;
            }
            return hm.get(a)-hm.get(b);
        });
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=arr[i];
        }
        return nums;
    }

    }
