public int[] shuffleArray(int[] nums, int n) {
  int ans[] = new int[nums.length];
  int a = 0;
  int b = n;

  for (int i = 0; i < n * 2; i += 2) {
     ans[i] = nums[a++];
  }
  for (int i = 1; i < n * 2; i += 2 ) {
     ans[i] = nums[b++];
  }

  return ans;
}
