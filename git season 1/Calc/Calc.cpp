#include <iostream>
#include <vector>
#include <algorithm>
#include <numeric>  // For accumulate

// Function to calculate the average of a vector of numbers
double calculateAverage(const std::vector<int>& numbers) {
    return numbers.empty() ? 0.0 : static_cast<double>(std::accumulate(numbers.begin(), numbers.end(), 0)) / numbers.size();
}

// Function to find the maximum number in a vector
int findMax(const std::vector<int>& numbers) {
    return *std::max_element(numbers.begin(), numbers.end());
}

// Function to find the minimum number in a vector
int findMin(const std::vector<int>& numbers) {
    return *std::min_element(numbers.begin(), numbers.end());
}

// Safely reads an integer with input validation
bool readInteger(int& value) {
    std::cin >> value;
    if (std::cin.fail()) {
        std::cin.clear(); // Clear error flags
        std::cin.ignore(std::numeric_limits<std::streamsize>::max(), '\n'); // Ignore invalid input
        return false;
    }
    return true;
}

int main() {
    std::vector<int> numbers;
    int input;

    std::cout << "Enter numbers (type -1 to stop):" << std::endl;
    while (true) {
        std::cout << "> ";
        if (!readInteger(input)) {
            std::cout << "Invalid input. Please enter an integer." << std::endl;
            continue;
        }
        if (input == -1) {
            break;
        }
        numbers.push_back(input);
    }

    if (numbers.empty()) {
        std::cout << "No numbers were entered." << std::endl;
    } else {
        std::cout << "Average: " << calculateAverage(numbers) << std::endl;
        std::cout << "Maximum: " << findMax(numbers) << std::endl;
        std::cout << "Minimum: " << findMin(numbers) << std::endl;
    }

    return 0;
}
