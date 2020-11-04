// Create an array to represent your shopping
// list with the following items: 'pop tarts', 
// 'ramen noodles', 'chips', 'salsa', and 'coffee'.
let shoppingList = ["pop tarts", "ramen noodles",
                    "chips", "salsa", "coffee"];
                    
// Add 'fruit loops' to the list.
shoppingList.push("fruit loops");
console.log(shoppingList);

// Update 'coffee' to 'fair trade coffee'.
// shoppingList[shoppingList.indexOf("coffee")] = "fair trade coffee;"
shoppingList[4] = "fair trade coffee";
console.log(shoppingList);

// Replace 'chips' and 'salsa' with 'rice' and 'beans'
//shoppingList[2] = "rice";
//shoppingList[3] = "beans";
//shoppingList[2:3] = ["rice", "beans"]; XXX
shoppingList.splice(2, 2, "rice", "beans");
console.log(shoppingList);

// Create an empty array to represent your shopping cart.
let cart = [];

// Remove the last item from your shopping list and add it to your cart.
cart.push(shoppingList.pop());

// Remove the first item from your shopping list and add it to the cart
// shift

// Write a 'while' loop that takes items from your shopping list and moves
// them to your cart until there are no items left on the list.
while(shoppingList.length > 0) {
   cart.push(shoppingList.pop());
}

// sort and reverse
cart.sort().reverse()

// print out
console.log(cart);
