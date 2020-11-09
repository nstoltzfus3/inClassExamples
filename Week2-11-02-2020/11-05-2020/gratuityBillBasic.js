// make a function that takes a number as an input
// return value must be 18% of the input value
// 	    Create a variable billAmount and store a random number (ie: 100)
let billAmount = 5;

// Create a function gratuity()
function gratuity(myBill) {
return myBill * 0.2;
}
// gratutity should multiply the value of billAmount by 20% (hint: use 0.2)
// and return the value

// Create a function totalWithGrat()
function totalWithGrat(amount) { // amount original bill.
return gratuity(amount) + amount;
}
// totalWithGrat should take in the amount as an argument, 
// call the gratutity function, add the returned value to 
// the original bill amount, and return the total bill + gratuity


// Append the return value of totalWithGrat to the following phrase:
// "Your total including gratuity is:" and log it to the console
console.log("Your total: " + totalWithGrat(billAmount));

// Only invoke the totalWithGrat function when logging the result

// Bonus: Find a way to fix the decimal point to only 2 places (ie: 120.00)
