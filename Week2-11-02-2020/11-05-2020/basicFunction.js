let sg = [1,2,3];
let outScope = 100;
function average(anArray) {
   if (anArray.length === 0) { // []
       return 0;
   }
   let sum = 0;
   for (let i = 0; i < anArray.length; i++) {
       sum += anArray[i];
   }
   let average1 = sum / anArray.length;
   let outScope;
   return average1;
}
// average == 2

// all the students grades' average

//average height of students


let sh = [10, 25, 39.5];

let myAverage = average(sh);
console.log(myAverage);
myAverage = average(sg);
console.log(myAverage);
//let sum = 0;
//for (let i = 0; i < sh.length; i++) {
//    sum += sh[i];
//}
//let average = sum / sh.length; // average == 2

//average student weight
