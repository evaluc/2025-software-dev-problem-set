class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> recorded = new HashSet<>();
        for (int num: nums) {
            if (recorded.contains(num))
                return true;
            recorded.add(num);
        }
        return false;
    }
}