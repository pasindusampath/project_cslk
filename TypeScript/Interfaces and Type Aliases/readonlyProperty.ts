// Readonly properties
interface Point {
    readonly x: number;
    readonly y: number;
}
  
const point: Point = { x: 10, y: 20 };
// point.x = 5; // Error: Cannot assign to 'x' because it is a read-only property

// Readonly array
const numbers: ReadonlyArray<number> = [1, 2, 3, 4];
// numbers.push(5); // Error: Property 'push' does not exist on type 'readonly number[]'

console.log("Readonly examples:", point, numbers);

// Extending interfaces
interface Animal {
    name: string;
}

interface Dog extends Animal {
    breed: string;
    bark(): void;
}

const dog: Dog = {
    name: "Rex",
    breed: "German Shepherd",
    bark() {
        console.log("Woof!");
    }
};

console.log("Extended interface:", dog);
dog.bark();

// Implementing interfaces in classes
interface ClockInterface {
    currentTime: Date;
    setTime(d: Date): void;
}

class Clock implements ClockInterface {
currentTime: Date = new Date();

setTime(d: Date) {
    this.currentTime = d;
}
}

const clock = new Clock();
console.log("Interface implementation:", clock);