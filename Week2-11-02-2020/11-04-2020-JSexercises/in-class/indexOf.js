let myArray = [1,2,3,4,5,4]; // "this is a sentence"

//for (let i = 0; i < myArray.length; i++) {
//    if (myArray[i] === 4) {
//        console.log(i);
//    }
//}

let location = myArray.indexOf(4);
console.log(location);

let drink = ["wine", "rootbeer", "coffee"]; // 0 - (end of array)
if (drink.indexOf("coffee") !== -1) {
   console.log("no drink for me");
}
