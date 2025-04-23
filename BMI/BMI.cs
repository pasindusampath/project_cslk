using System;

class BMI
{
    static void Main(string[] args)
    {
        Console.WriteLine("BMI Calculator");

        // Get weight in kilograms
        Console.Write("Enter your weight in kilograms: ");
        double weight = Convert.ToDouble(Console.ReadLine());

        // Get height in meters
        Console.Write("Enter your height in meters: ");
        double height = Convert.ToDouble(Console.ReadLine());

        // Calculate BMI
        double bmi = weight / (height * height);

        // Display BMI
        Console.WriteLine($"Your BMI is: {bmi:F2}");

        // Determine BMI category
        if (bmi < 18.5)
        {
            Console.WriteLine("Category: Underweight");
        }
        else if (bmi >= 18.5 && bmi < 24.9)
        {
            Console.WriteLine("Category: Normal weight");
        }
        else if (bmi >= 25 && bmi < 29.9)
        {
            Console.WriteLine("Category: Overweight");
        }
        else
        {
            Console.WriteLine("Category: Obesity");
        }
    }
}