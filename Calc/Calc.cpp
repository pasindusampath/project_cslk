#include <iostream>
#include <vector>
#include <algorithm>

// Function to calculate the average of a vector of numbers
double calculateAverage(const std::vector<int>& numbers) {
    if (numbers.empty()) {
        return 0.0;
    }
    int sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return static_cast<double>(sum) / numbers.size();
}

// Function to find the maximum number in a vector
int findMax(const std::vector<int>& numbers) {
    return *std::max_element(numbers.begin(), numbers.end());
}

// Function to find the minimum number in a vector
int findMin(const std::vector<int>& numbers) {
    return *std::min_element(numbers.begin(), numbers.end());
}

int main() {
    std::vector<int> numbers;
    int input;

    std::cout << "Enter numbers (type -1 to stop):" << std::endl;
    while (true) {
        std::cin >> input;
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