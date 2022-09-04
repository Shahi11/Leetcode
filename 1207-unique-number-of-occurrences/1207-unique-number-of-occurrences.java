class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Arrays.sort(arr);
        List<Integer> list=new ArrayList<>();
        int count=1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1]) count++;
            else
            {
                list.add(count);
                count=1;
            }
        }
        list.add(count);
        Set<Integer> set=new HashSet<>(list);
        return list.size()==set.size();
    }
}