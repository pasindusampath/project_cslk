// Using the interface
var newUser = {
    id: 1,
    name: "",
    email: "djohn@example.com",
    createdAt: new Date()
};
console.log("Basic interface example:", newUser);
var basicCalculator = {
    add: function (a, b) {
        return a + b;
    },
    subtract: function (a, b) {
        return a - b;
    }
};
console.log("Calculator methods:", basicCalculator.add(5, 3), basicCalculator.subtract(10, 4));
