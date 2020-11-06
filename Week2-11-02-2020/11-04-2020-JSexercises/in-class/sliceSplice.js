let a =    [1,2,3,4,5]; 
         //0 1 2 3 4
//[2,3,4]
//[1]
//[1,2]

a.slice(1,3); // [2, 3]
a.slice(0,1);
a.slice(4,5);

a[2] = 10;
console.log(a);
//[1, [9, 8, 7, 10, 1000] , 5]
// correct syntax is <array>.splice(<start_index>, <how_many>, <values>...)
a.splice(1, 3, 9, 8, 7, 10, 1000);
console.log(a);
