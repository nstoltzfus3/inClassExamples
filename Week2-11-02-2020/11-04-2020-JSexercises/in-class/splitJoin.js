let a = "This is a sentence with some words in it sentence.";
let b = a.split(' '); //delimiter
console.log(b);

// make a function that tells me how many words are 
// in a sentence
console.log(b.length);
b[2] = "buttercups";
console.log(b);
let c = b.join(' ');
console.log(c);

console.log(c); // console.log(c.toString())
