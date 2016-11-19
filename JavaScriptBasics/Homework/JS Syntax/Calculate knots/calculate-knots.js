var calcKmhToKnots = function (kmH) {
    var knots = (kmH / 1.852).toFixed(2);
    return knots
}

var knots = calcKmhToKnots(20);

console.log(knots);

var knots = calcKmhToKnots(112);

console.log(knots);

var knots = calcKmhToKnots(400);

console.log(knots);


