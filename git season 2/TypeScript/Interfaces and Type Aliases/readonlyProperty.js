var point = { x: 10, y: 20 };
// point.x = 5; // Error: Cannot assign to 'x' because it is a read-only property
// Readonly array
var numbers = [1, 2, 3, 4];
// numbers.push(5); // Error: Property 'push' does not exist on type 'readonly number[]'
console.log("Readonly examples:", point, numbers);
var dog = {
    name: "Rex",
    breed: "German Shepherd",
    bark: function () {
        console.log("Woof!");
    }
};
console.log("Extended interface:", dog);
dog.bark();
var Clock = /** @class */ (function () {
    function Clock() {
        this.currentTime = new Date();
    }
    Clock.prototype.setTime = function (d) {
        this.currentTime = d;
    };
    return Clock;
}());
var clock = new Clock();
console.log("Interface implementation:", clock);
