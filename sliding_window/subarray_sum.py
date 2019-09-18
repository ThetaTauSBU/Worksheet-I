def subarray_sum(data, sum):
    fast = 0 
    slow = 0
    running_sum = data[fast]
    while fast < len(data) and slow < len(data):
        print("RUNNING SUM", running_sum)
        if running_sum < sum:
            fast += 1
            running_sum = running_sum + data[fast]
        else:
            if running_sum > sum:
                running_sum = running_sum - data[slow]
                slow += 1
            else:
                return (slow, fast)

inp = [2,  6, 0, 9, 1, 10]
s = 15
print(subarray_sum(inp, s))
