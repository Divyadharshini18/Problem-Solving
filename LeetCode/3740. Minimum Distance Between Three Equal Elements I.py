from collections import defaultdict
class Solution:
    def minimumDistance(self, nums: list[int]) -> int:
        ind = defaultdict(list)
        for i, n in enumerate(nums):
            ind[n].append(i)
        ans = float('inf')
        for n, i in ind.items():
            if len(i) >= 3:
                for j in range(len(i) - 2):
                    i1, i2, i3 = i[j], i[j+1], i[j+2]
                    d = abs(i1 - i2) + abs(i2 - i3) + abs(i3 - i1)
                    ans = min(ans, d)
        return ans if ans != float('inf') else -1