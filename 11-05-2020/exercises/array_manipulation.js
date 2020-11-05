//Arrays and array manipulation: access, sort, reverse.
//Madison Shi

/*
Scheduling Chaos
Ellis is trying to manage his senior year schedule. He's currently slated to take the following courses in the following schedule:
     - English
     - Calculus 3
     - Government
     - Economics
     - Environmental Science
     - Anatomy
     - Theater
     - Free Period

His friend Amanda is taking the following classes in the following schedule:
     - English
     - Band
     - Economics
     - Spanish
     - Government
     - Anatomy
     - Calculus 3
     - Free period 

They want to know the following information:
     1. What class do each of them having during second period?
     2. How many classes are they taking together? List them as well (They are in the same class and in the same period)
     3. How many classes to they have in common? (They are in the same class, but not in the same period)
     4. Ellis wants to see his classes in alphabetical order; Amanda wants to see her classes backwards alphabetically
*/




//SOLUTION
//set-up
/*let ellis = ["English", "Calculus 3", "Government", "Economics", "Environmental Science", "Anatomy", "Theater", "Free Period"]
let amanda = ["English", "Band", "Economics", "Spanish", "Government", "Anatomy", "Calculus 3", "Free Period"]

//question 1
console.log("Ellis:", ellis[1])
console.log("Amanda: " + amanda[1])

//question 2
let classesTogether = []
for(let i = 0; i < ellis.length; i++){
     if(ellis[i]==amanda[i]){
          classesTogether.push(ellis[i])
     }
}
console.log(classesTogether.length, "classes together. They are: " + classesTogether)

//question 3
let commonClasses = 0
for(let i = 0; i < ellis.length; i++){
     for(let j = 0; j < amanda.length; j++){
          if(ellis[i]==amanda[j]){
               commonClasses++
          }
     }
}
console.log(`Number of classes in common: ${commonClasses}`)

//question 4
console.log(ellis.sort())
console.log(amanda.sort().reverse())*/