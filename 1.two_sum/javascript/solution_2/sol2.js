const nums = [3, 2, 4]
const target = 6

function twoSum(numsArr, target) {
  const nums_map = {}
  for (let [index, value] of numsArr.entries()) {
    let complement = target - value
    if (nums_map.hasOwnProperty(complement)) {
      return [nums_map[complement], index]
    }
    nums_map[value] = index
  }
  return 'No match found, crap.'
}

const res = twoSum(nums, target)
console.log(res)