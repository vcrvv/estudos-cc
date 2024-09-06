
nums = [7,12,143,200,45,32]
target = 232
result = []
for num in nums:
    for num2 in nums:
        if num + num2 == target and num != num2:

                result.append(nums.index(num))
                result.append(nums.index(num2))
                

print(result)