// this was a solution to the Application Problem

let startTimes = [5,7,0,10,4];
speeds = [1.4, 1.5, .5, 2, 1.2];
distances = [0,0,0,0,0];

seconds = 40;

for (let i = 0; i < seconds; i++) {
    for (let j = 0; j < startTimes.length; j++) {
        if (i > startTimes[j]) { // implementation based, can be >= also.
            distances[j] += speeds[j];
        }
    }
}

console.log(distances)
