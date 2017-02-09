function filterAllNumbers(array) {
    return array.filter(function(number) {
        return !isNaN(number);
    });
}

function getMinOfArray(newArr) {
    return 'Min number:' + ' ' + Math.min.apply(null, newArr);
}
function getMaxOfArray(newArr) {
    return 'Max number:' + ' ' + Math.max.apply(null, newArr);
}





var arr = ["Pesho", 2, "Gosho", 12, 2, "true", 9, undefined, 0, "Penka", { bunniesCount : 10}, [10, 20, 30, 40]];
var newArr = [ 2, 12, 2, 9, 0 ];
console.log(getMinOfArray(newArr));
console.log(getMaxOfArray(newArr));
console.log('Most frequent number:' + ' ' + newArr[0, 2]);
console.log(newArr.sort(function(a,b) {
    return b - a;
}));
