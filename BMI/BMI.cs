using System;

class BMI
{
    static void Main(string[] args)
    {
        const double UnderweightThreshold = 18.5;
        const double NormalWeightMax = 24.9;
        const double OverweightMax = 29.9;

        Console.WriteLine("BMI Calculator");

        double weight = ReadPositiveDouble("Enter your weight in kilograms: ");
        double height = ReadPositiveDouble("Enter your height in meters: ");

        double bmi = weight / (height * height);
        Console.WriteLine($"Your BMI is: {bmi:F2}");

        // Determine BMI category
        if (bmi < UnderweightThreshold)
        {
            Console.WriteLine("Category: Underweight");
        }
        else if (bmi >= UnderweightThreshold && bmi <= NormalWeightMax)
        {
            Console.WriteLine("Category: Normal weight");
        }
        else if (bmi > NormalWeightMax && bmi <= OverweightMax)
        {
            Console.WriteLine("Category: Overweight");
        }
        else
        {
            Console.WriteLine("Category: Obesity");
        }
    }

    static double ReadPositiveDouble(string prompt)
    {
        double value;
        do
        {
            Console.Write(prompt);
            string input = Console.ReadLine();

            if (!double.TryParse(input, out value) || value <= 0)
            {
                Console.WriteLine("Please enter a valid positive number.");
            }
        } while (value <= 0);

        return value;
    }
}
