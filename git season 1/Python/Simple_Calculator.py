def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        return "Error! Division by zero."
    return x / y

def get_number(prompt):
    while True:
        try:
            return float(input(prompt))
        except ValueError:
            print("Invalid input! Please enter a numeric value.")

def calculator():
    operations = {
        '1': ('Add', add),
        '2': ('Subtract', subtract),
        '3': ('Multiply', multiply),
        '4': ('Divide', divide)
    }

    print("Select operation:")
    for key, (name, _) in operations.items():
        print(f"{key}. {name}")

    choice = input("Enter choice (1/2/3/4): ")

    if choice not in operations:
        print("Invalid choice! Please select a valid operation.")
        return

    num1 = get_number("Enter first number: ")
    num2 = get_number("Enter second number: ")

    operation_name, operation_func = operations[choice]
    result = operation_func(num1, num2)

    print(f"The result of {operation_name.lower()}ing {num1} and {num2} is: {result}")

if __name__ == "__main__":
    calculator()
