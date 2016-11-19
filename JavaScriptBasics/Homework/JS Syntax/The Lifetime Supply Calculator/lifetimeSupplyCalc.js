function calcSupply(age, maxAge, food, foodPerDay) {
    var result = ((maxAge - age) * 365 * foodPerDay);
    var stringText = ' kg of ' + food + ' would be enough until I am ' + maxAge + ' years old.';

    console.log(result +  stringText);
}


calcSupply(20, 90, 'bananas', 2);

calcSupply(38, 118, 'chocolate', 0.5);

calcSupply(20, 87, 'fruits', 2);

calcSupply(16, 102, 'nuts', 1.1);
