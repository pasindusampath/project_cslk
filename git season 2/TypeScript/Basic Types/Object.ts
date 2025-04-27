// Object
let obj: object = { key: "value" };
console.log(`Object example: ${JSON.stringify(obj)}`);


// Type assertions
let someValue: any = "this is a string";
let strLength1: number = (<string>someValue).length;
let strLength2: number = (someValue as string).length;
console.log(`Type assertion examples: ${strLength1}, ${strLength2}`);

// Union Types
let unionType: string | number;
unionType = "Hello";
console.log(`Union type as string: ${unionType}`);
unionType = 100;
console.log(`Union type as number: ${unionType}`);

// Type aliases
type StringOrNumber = string | number;
let anotherUnion: StringOrNumber = "World";
console.log(`Type alias example: ${anotherUnion}`);

// Literal Types
type Direction = "North" | "East" | "South" | "West";
let direction: Direction = "North";
console.log(`Literal type example: ${direction}`);

// Unknown
let notKnown: unknown = 4;
// Need to check type before using unknown values
if (typeof notKnown === "number") {
    console.log(`Unknown example (as number): ${notKnown * 2}`);
}