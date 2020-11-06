    // let bevs = ["water", "coffee", "juice", "hot tea"];

    // for (let i = 0; i < 4; i++) { // 0, 1, 2, 3
    //     console.log(i);
    //     console.log(bevs[i]);
    // }
    
    // bevs.push("hot chocolate");
    // bevs.push("wine");
    
    // let order = "wine";
    // let myDrinkWasServed = false;
    // for (let i = 0; i < bevs.length; i++) { // 0, 1, 2, 3
    //     console.log("Is your beverage: " + bevs[i]);
    //     if (order === bevs[i]) {
    //         console.log("Here is your order, I hope you enjoy your drink: " 
    //                     + bevs[i]);
    //         myDrinkWasServed = true;
    //         break;
    //     }
    // }
    // if (!myDrinkWasServed) { // !true === false
    //     console.log("aw shucks no drink for me.")
    // }
    
    let burger = [];
    burger.push("bread");
    for (let i = 0; i < 9; i++) {
        burger.push("");
    }
    burger.push("bread");
    
    console.log(burger);
    let baconBurger = ["patty", "bacon", "cheese"];// 0 - 2 , 3, i<3, 0,1,2
    let vegBurg = ["lettuce", "vegPatty", "tomato"];
    
    let buildBurg = vegBurg;
    for (let j = 0; j < buildBurg.length; j++) { // 0 - 2
        for (let i = 0; i < buildBurg.length; i++) { // 1 - 3 , 0 - 2
                console.log("We are grabbing our " + buildBurg[i]);
                console.log("We are placing it in " + ((j*3)+(i+1)));
                burger[(j*3)+(i+1)] = buildBurg[i]; // 1 2 3, // 4,5,6 // 7,8,9
                                                      // 0 * 3,    1 * 3,   2 * 3
        }
    }
    console.log(burger);
    
