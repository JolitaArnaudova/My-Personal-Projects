var calcCircleArea = function (radius) {

    var result = Math.PI * Math.pow(radius, 2);

    return result
};



document.getElementById("first").innerHTML = calcCircleArea(7);
document.getElementById("second").innerHTML = calcCircleArea(1.5);
document.getElementById("third").innerHTML= calcCircleArea(20);