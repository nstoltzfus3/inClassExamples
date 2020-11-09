function add() {
	let sum = 0;
	for(let i = 0; i < arguments.length; i++) {
		sum += arguments[i];
	}
	return sum;
}
	
add(1,2,3,4,5,6,7,8); // arguments = [1,2,3,4,5,6,7,8] kwargs**

function add(...anyWord) { // assigns anyWord = arguments;
        let sum = 0;

        for(let i = 0; i < anyWord.length; i++) {
            sum += anyWord[i];
        }
        return sum;
}

console.log(add(1,2,3,4,5,6,7,8));
