class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || k == 0)
            return new int[]{};

        //count freq of each num
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        //Store k items in priority queue
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
        for (int key : freqMap.keySet()) {
            pq.offer(new int[]{key, freqMap.get(key)});
            if (pq.size() > k)
                pq.poll();
        }

        //return the priority queue
        return  pq.stream().mapToInt(arr -> arr[0]).toArray();
    }
}
