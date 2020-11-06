// scope and variable practice
    
// lets define a variable and assign a String to it.
var s = "some string";
console.log("Answer 1: " + s);

//in a new scope, we'll define a new variable with the same name.
{
        console.log("Answer 2: " + s);
        // think hard about what is going on when
        // a variable with the SAME name is
        // redefined here.
        var s = "a different string";
        console.log("Answer 3: " + s);
}
// Did changing the value of s inside a new scope change
// the value of it outside the scope?
console.log("Answer 4: " + s);

let a = 5;
console.log("Answer 5: " + a);

//in a new scope, we'll define a new variable with the same name.
{
        // ** SPECIAL LINE ** 
        // console.log("Answer 6: " + a);

        // think hard about what is going on when
        // a variable with the SAME name is 
        // reassigned here. (note: not redeclared.)
        let a = 10;
        console.log("Answer 7: " + a);
}
// Answer 7 may suprise you.
console.log("Answer 8: " + a);

// Follow up question, if you change 'let' to 'var' 
// what changes about the above code?

// What happens when you uncomment the line under
// ** SPECIAL LINE ** above. What do you think is
// going on here?
