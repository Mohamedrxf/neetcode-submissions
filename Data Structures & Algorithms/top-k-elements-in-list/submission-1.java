class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums)
        {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> minheap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));
        for(int num : map.keySet())
        {
            minheap.offer(num);

            if(minheap.size() > k)
            {
                minheap.poll();
            }
        }

        int[] res = new int[k];
        for(int i=k-1; i>=0; i--)
        {
            res[i] = minheap.poll();
        }
        return res;
    }
}
