def fruit_basket(tree):
        ans = i = 0
        count = collections.Counter()
        for j, x in enumerate(tree):
            count[x] += 1
            while len(count) >= 3:
                count[tree[i]] -= 1
                if count[tree[i]] == 0:
                    del count[tree[i]]
                i += 1
            ans = max(ans, j - i + 1)
        return ans
tree = [3,3,3,1,2,1,1,2,3,3,4]
print(fruit_basket(tree)) # output should be 5
