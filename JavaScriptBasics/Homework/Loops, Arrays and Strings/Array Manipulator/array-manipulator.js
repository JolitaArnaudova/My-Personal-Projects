function filterNumbers(array) {
    return array.filter(function (number) {
        return !isNaN(number)
    });
}

function sortNumbersInArray(array){
    arraynew = filterNumbers(array);
    return  arraynew.sort(function(a,b){  return a < b;})
}

function getLastElementOfArray(inputarray){
    var arr = sortNumbersInArray(inputarray);
    var lastelement = arr.pop();
    return "Min number: " + lastelement ;

}





var arr = ["Pesho", 2, "Gosho", 12, 2, "true", 9, undefined, 0, "Penka", { bunniesCount : 10}, [10, 20, 30, 40]];
var newarr = sortNumbersInArray(arr);
var a = newarr.pop();


console.log(filterNumbers(arr));
console.log(newarr);
console.log("Max number: " + newarr[0]);
console.log(getLastElementOfArray(arr));