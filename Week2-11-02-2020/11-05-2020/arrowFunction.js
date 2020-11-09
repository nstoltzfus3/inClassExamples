	   	
// setTimeout(function(){
// 	console.log('later')
// },2000);
 
// console.log('now');

	
	
let teacher = {
	name: 'Shane',
	speak: function() {
		
		//Bind a function to a specific context
		var boundFunction = () => {
			console.log('later my name is ' + this.name);
		};
		
		//boundFunction will always run in bound context
		setTimeout(boundFunction,1000);
	}
}

teacher.speak();

console.log("stuff"[0]);
