function solve (input) {

    var result = ["<ul>"];
    var start = parseInt(input[0]);
    var end = parseInt(input[1]);

    for (i = start; i <= end; i++) {
        var numbers = i.toString();
        if (numbers.length < 4) {
            var notDouble = "<li><span class='num'>" + i + "</span></li>";
            result.push(notDouble);
        } else {
            if (doubleRakiyaNumber(numbers)) {
                var double = "<li><span class='rakiya'>" + numbers + "</span><a href='view.php?id=55555'>View</a></li>"
                result.push(double);
            } else {
                var notDouble = "<li><span class='num'>" + i + "</span></li>";
                result.push(notDouble);
            }
        }
    }
    result.push(["</ul>"]);
    for (var i in result) {
        console.log(result[i]);
    }
    function doubleRakiyaNumber(numbers) {
        for (i = start; i < numbers.length - 1; i++){
            var subNumStart = i;
            var subNumEnd = subNumStart + 2;
            var counter = 0;
            var subNum = numbers.substring(subNumStart, subNumEnd);
            if (numbers.indexOf(subNum, subNumEnd) != -1) {

                counter++;
            }

            if (counter > 0) {

                return true;
            }
        }

        return false;
    }

};


solve(["456783636", "33336666"]);