var s = "some string";
console.log("Answer 1: " + s);

{
        console.log("Answer 2: " + s);
        var s = "a different string";
        console.log("Answer 3: " + s);
}
console.log("Answer 4: " + s);

let a = 5;
console.log("Answer 5: " + a);

{
        // console.log("Answer 6: " + a);
        let a = 10;
        console.log("Answer 7: " + a);
}
console.log("Answer 8: " + a);

// Follow up question, if you change 'let' to 'var' 
// what changes about the above code?

// What happens when you uncomment the line under
// ** SPECIAL LINE ** above. What do you think is
// going on here?
