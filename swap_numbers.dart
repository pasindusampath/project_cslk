// Dart implementation of SwapNumbers.java

void main() {
  double first = 1.20, second = 2.45;

  print('--Before swap--');
  print('First number = $first');
  print('Second number = $second');

  // Store the first value in a temporary variable
  double temporary = first;

  // Assign the second value to first
  first = second;

  // Assign the temporary value to second
  second = temporary;

  print('--After swap--');
  print('First number = $first');
  print('Second number = $second');
}
