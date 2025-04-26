// Basic Types in TypeScript

// Boolean
let isDone: boolean = false;
console.log(`Boolean example: ${isDone}`);

// Number
let decimal: number = 6;
let hex: number = 0xf00d;
let binary: number = 0b1010;
let octal: number = 0o744;
console.log(`Number examples: ${decimal}, ${hex}, ${binary}, ${octal}`);

// String
let color: string = "blue";
let fullName: string = `Bob Bobbington`;
let sentence: string = `Hello, my name is ${fullName}.`;
console.log(`String example: ${sentence}`);

// Array
let list1: number[] = [1, 2, 3];
let list2: Array<number> = [1, 2, 3]; // Generic array type
console.log(`Array examples: ${list1}, ${list2}`);

// Tuple
let x: [string, number] = ["hello", 10];
console.log(`Tuple example: ${x[0]}, ${x[1]}`);

// Enum
enum Color {Red, Green, Blue}
let c: Color = Color.Green;
console.log(`Enum example: Color.Green = ${c}`);

// Named enum
enum ColorNamed {Red = 1, Green = 2, Blue = 4}
let colorName: string = ColorNamed[2]; // Get name from value
console.log(`Named enum example: ColorNamed[2] = ${colorName}`);

// Any
let notSure: any = 4; // number
notSure = "maybe a string instead"; //string
notSure = false; // boolean
console.log(`Any example: ${notSure}`);

// Void
function warnUser(): void {
    console.log("This is a warning message");
}
let unusable: void = undefined;
console.log(`Void example: ${unusable}`);

// Null and Undefined
let u: undefined = undefined;
let n: null = null;
console.log(`Null and Undefined examples: ${u}, ${n}`);

// Never
function error(message: string): never {
    throw new Error(message);
}
// This function never returns as it always throws an error
// Uncomment to test: error("This is an error");