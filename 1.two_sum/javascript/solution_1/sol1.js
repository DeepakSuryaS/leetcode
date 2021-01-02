const nums = [2, 7, 11, 15]
const target = 9

function twoSum(numsArr, target) {
  for (i = 0; i < numsArr.length; i += 1) {
    let complement = target - numsArr[i]
    for (j = i; j < numsArr.length; j += 1) {
      if (complement === numsArr[j]) {
        return [i, j]
      }
    }
  }
  return 'No match found, crap.'
}

const res = twoSum(nums, target)
console.log(res)