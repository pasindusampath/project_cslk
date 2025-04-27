// Object
var obj = { key: "value" };
console.log("Object example: ".concat(JSON.stringify(obj)));
// Type assertions
var someValue = "this is a string";
var strLength1 = someValue.length;
var strLength2 = someValue.length;
console.log("Type assertion examples: ".concat(strLength1, ", ").concat(strLength2));
// Union Types
var unionType;
unionType = "Hello";
console.log("Union type as string: ".concat(unionType));
unionType = 100;
console.log("Union type as number: ".concat(unionType));
var anotherUnion = "World";
console.log("Type alias example: ".concat(anotherUnion));
var direction = "North";
console.log("Literal type example: ".concat(direction));
// Unknown
var notKnown = 4;
// Need to check type before using unknown values
if (typeof notKnown === "number") {
    console.log("Unknown example (as number): ".concat(notKnown * 2));
}
