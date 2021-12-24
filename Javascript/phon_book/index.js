let input = ["119", "97674223", "1195524421"]

let answer = true;
let value = ''

input.forEach(i => {
    value = input.filter(a => a.startsWith(i))
});
if (value != '') {
    answer = false
}
console.log(input, value, answer)

