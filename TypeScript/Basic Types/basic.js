// Basic Types in TypeScript
// Boolean
var isDone = false;
console.log("Boolean example: ".concat(isDone));
// Number
var decimal = 6;
var hex = 0xf00d;
var binary = 10;
var octal = 484;
console.log("Number examples: ".concat(decimal, ", ").concat(hex, ", ").concat(binary, ", ").concat(octal));
// String
var color = "blue";
var fullName = "Bob Bobbington";
var sentence = "Hello, my name is ".concat(fullName, ".");
console.log("String example: ".concat(sentence));
// Array
var list1 = [1, 2, 3];
var list2 = [1, 2, 3]; // Generic array type
console.log("Array examples: ".concat(list1, ", ").concat(list2));
// Tuple
var x = ["hello", 10];
console.log("Tuple example: ".concat(x[0], ", ").concat(x[1]));
// Enum
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Blue"] = 2] = "Blue";
})(Color || (Color = {}));
var c = Color.Green;
console.log("Enum example: Color.Green = ".concat(c));
// Named enum
var ColorNamed;
(function (ColorNamed) {
    ColorNamed[ColorNamed["Red"] = 1] = "Red";
    ColorNamed[ColorNamed["Green"] = 2] = "Green";
    ColorNamed[ColorNamed["Blue"] = 4] = "Blue";
})(ColorNamed || (ColorNamed = {}));
var colorName = ColorNamed[2];
console.log("Named enum example: ColorNamed[2] = ".concat(colorName));
// Any
var notSure = 4;
notSure = "maybe a string instead";
notSure = false; // boolean
console.log("Any example: ".concat(notSure));
