var data = [
    {
        'name': 'Пешо',
        'score': 91
    },


    {
    'name': 'Лилия',
    'score': 290
    },

    {
    'name': 'Алекс',
    'score': 343
    },

    {
    'name': 'Габриела',
    'score': 400
    },
    {
        'name': 'Жичка',
        'score': 70
    }

]

var dataObj = JSON.parse(JSON.stringify(data)),
    finalObj;

dataObj.map(function(person) {
    return person.score = person.score + person.score * 0.1;
})

dataObj.forEach(function(person) {
    person.hasPassed = person.score > 100;
});

dataObj.sort(function (prev, curr) {
    return prev.name.localeCompare(curr.name);
});

finalObj = dataObj.filter(function(person) {
    return person.hasPassed;
})

console.log(finalObj);
