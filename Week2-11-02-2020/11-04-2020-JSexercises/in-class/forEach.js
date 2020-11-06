// let teachers = [1,2,3,4,5];

// for (let i = 0; i < teachers.length; i++) {
//     console.log(teachers[i], i)
// }

// teachers.forEach(function(item, index) {
//     console.log("Index: " + index);
//     console.log(item, index);
// });

let stuff = ['word1', 'not a word', 'bunny'];
stuff.forEach(function(item, index) {
    console.log(item);
    if (item === 'bunny') {
        console.log(index);
    }
});
