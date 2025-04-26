// Optional properties (with ?)
interface Product {
    id: number;
    name: string;
    price: number;
    description?: string;  // Optional property
    category?: string;     // Optional property
}

const product1: Product = {
    id: 101,
    name: "Laptop",
    price: 1299
};

const product2: Product = {
    id: 102,
    name: "Smartphone",
    price: 899,
    description: "Latest model with high-end camera",
    category: "Electronics"
};

console.log("Optional properties example:", product1, product2);