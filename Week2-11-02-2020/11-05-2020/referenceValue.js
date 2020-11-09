let a = 5;  // pass by value, the number 6 is assigned to b.
b = a;
a = 6;
console.log(b);

a = [1,2,3,4,5];  // pass by reference , mem address of array is pointed at by b.
b = a;
a[1] = 1000;
console.log(b);

//Reference types
let x = {name: 'Evan'}
let y = x
console.log(x == y); //false;

let myObj = {
    name: "Nick",
    hoursOfSleep: "few",
    contentToComplete: "many"
}

let newObj = myObj; // 5, mem address of the obj

newObj.functionsAreEasy = true;

console.log(myObj.functionsAreEasy);
