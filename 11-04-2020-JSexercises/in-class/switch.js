let x = 1;
switch(x) {
case 3:
    console.log('three')
    break;
case 1:
    console.log(1);
    break;
case 2:
    console.log(2);
    break;
case 1000:
    console.log("I shouldn't be evaluated, but I am."); 
    // above break statements protect us from cascading 
    // try removing the above break statements
    break;
default:
    console.log('default');
}

let word = "Apple";
switch(x) {
case 'p':
    // make letter 'P'
    break;
default:
    console.log('default');
}
console.log(word[0]);

