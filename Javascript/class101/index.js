function solution(N) {
    // remove leading zeros
    // modify at most three
  
    var enable_print = N % 10;
    while (N > 0) {
      if (enable_print == 0 && N % 10 != 0) {
        enable_print = 1;
      }
      else if (enable_print == 1) {
        process.stdout.write((N % 10).toString());
      }
      N = Math.floor(N / 10);
    }
  }

let A = [51, 71, 16]
solution(A)
function solution(A) {
    // write your code in JavaScript (Node.js 8.9.4)
    // return max sum among two nums have the same total
    
    const result = A.map((val) => {
        console.log(A, val)
        let num = val.toString()
        let sum = 0
        for (let i = 0; i < num.length; i++) {
            console.log(num[i])
            sum += +num[i]
        }

        console.log('sum', sum)
        return num[0] + num[1];    
    })
    console.log('sum', result)
    
    // no match then return -1
    return -1;
}

function checkMatch(A) {
    A.forEach(i => {
        for (let i = 0; i < A.length; i++) {
            
            
        }
    });
}

uniqueCount = [1, 3, 5, 23, 11, 5];
var count = {};
A.forEach(function(i) { count[i] = (count[i]||0) + 1;});
console.log(count);

console.log('max', Math.max.apply(Math, A.map(function(o) { return o.y; })))

var maxA = A.reduce((a,b)=>a.y>b.y?a:b).y;
console.log(maxA)
