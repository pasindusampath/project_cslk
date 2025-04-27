// Defining interfaces
interface User {
    id: number;
    name: string;
    email: string;
    createdAt: Date;
}
  
// Using the interface
const newUser: User = {
    id: 1,
    name: "",
    email: "djohn@example.com",
    createdAt: new Date()
};

console.log("Basic interface example:", newUser);

// Interface with methods
interface Calculator {
    add(a: number, b: number): number;
    subtract(a: number, b: number): number;
}

const basicCalculator: Calculator = {
    add(a, b) {
        return a + b;
    },
    subtract(a, b) {
        return a - b;
    }
};

console.log("Calculator methods:", 
    basicCalculator.add(5, 3),
    basicCalculator.subtract(10, 4)
);