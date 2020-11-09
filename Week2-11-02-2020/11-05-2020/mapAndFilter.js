let students = [
	{name: 'John Lennon', average: 90},
	{name: 'Ringo Starr', average: 58},
	{name: 'Paul McCartney', average: 82}
];
 
let passingStudents = students.map(function(student){
    if (student.average > 60) {
        return student; // builds an array comprised of what you are returning
    }
});

let passingStudents = students.filter(function(student){
        // builds an array comprised of the elements of the original array's
        // elements, based on truth return values.
        return student.average > 60;
});
 
// passingStudents === [
// 	{name: 'John Lennon', average: 90},
// 	{name: 'Paul McCartney', average: 82}
// ];

console.log(passingStudents)
