# Getting Started with TypeScript

> This guide will walk you through the process of setting up TypeScript, creating your first TypeScript file, and running it.

## Prerequisites

- Before you begin, ensure you have the following installed:

[Node.js](https://nodejs.org/en) (which includes npm)

A code editor (recommended :[Visual Studio Code](https://code.visualstudio.com/))

## Installation

> 1. Install TypeScript globally using npm :

```bash
npm install -g typescript
```

> 2. Verify the installation by checking the TypeScript version :

```bash
tsc --version
```

**You should see the TypeScript version number displayed.**

## Setting Up a TypeScript Project

> 1. Create a new project folder:

```bash
mkdir my-typescript-project
cd my-typescript-project
```

> 2. Initialize a new Node.js project:

```bash
npm init -y
```

**This creates a basic `package.json` file**

> 3. Install TypeScript as a dev dependency in your project:

```bash
npm install typescript --save-dev
```

> 4. Create a TypeScript configuration file(`tsconfig.json`) :

```bash
npx tsc --init
```

**This generates a `tsconfig.json` file with default settings.**

## Basic TypeScript Configuration

- The `tsconfig.json` file contains compiler options for your TypeScript project. Here's a simple configuration to start with:

```json
{
    "compilerOptions": {
    "target": "es2016",
    "module": "commonjs",
    "outDir": "./dist",
    "rootDir": "./src",
    "strict": true,
    "esModuleInterop": true,
    "skipLibCheck": true,
    "forceConsistentCasingInFileNames": true
    }
}
```

> Key options explained:
- `target`: Specifies which ECMAScript version to compile to
- `outDir`: Where compiled JavaScript files will be placed
- `rootDir`: Where your TypeScript source files are located
- `rootDir`: Where your TypeScript source files are located

## Creating Your First TypeScript File

> 1. Create a source directory to match your `tsconfig.json` settings:

```bash
mkdir src
```

> 2. Create your first TypeScript file (`src/index.ts`):

```typescript
// Define a function with type annotations
function greet(name: string): string {
    return `Hello, ${name}!`;
}

// Define a typed variable
const user: string = "TypeScript Learner";

// Use the function
console.log(greet(user));

// Example of an interface
interface Person {
    firstName: string;
    lastName: string;
    age?: number; // Optional property
}

// Create an object based on the interface
const person: Person = {
    firstName: "John",
    lastName: "Doe"
};

console.log(`Person: ${person.firstName} ${person.lastName}`);
```

## Compiling and Running TypeScript

> 1. Compile your TypeScript code:

```bash
npx tsc
```

- This will compile your TypeScript files into JavaScript files in the `dist` directory.

> 2. Run your compiled JavaScript:

```bash
node dist/index.js
```
# Congradulations !!
## You should see the output of your program.


Refer to the official [TypeScript documentation](https://www.typescriptlang.org/docs/) for more detailed information.