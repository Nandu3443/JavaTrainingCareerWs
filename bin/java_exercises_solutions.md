# Java Conditional Statements and Loops - Exercise Solutions

## Beginner Exercises

### 1. Temperature Classifier
```java
import java.util.Scanner;

public class TemperatureClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature in Celsius: ");
        double temperature = scanner.nextDouble();
        
        if (temperature < 0) {
            System.out.println("Freezing");
        } else if (temperature <= 15) {
            System.out.println("Cold");
        } else if (temperature <= 25) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
        
        scanner.close();
    }
}
```

### 2. FizzBuzz
```java
public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
```

### 3. Sum of Even Numbers
```java
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        
        System.out.println("The sum of all even numbers between 1 and 100 is: " + sum);
    }
}
```

## Intermediate Exercises

### 4. Prime Number Checker
```java
import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it's prime: ");
        int number = scanner.nextInt();
        
        boolean isPrime = true;
        
        // Check if number is less than 2 (not prime)
        if (number < 2) {
            isPrime = false;
        } else {
            // Check for factors from 2 to square root of number
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        
        scanner.close();
    }
}
```

### 5. Factorial Calculator
```java
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number to calculate its factorial: ");
        int number = scanner.nextInt();
        
        long factorial = 1;
        
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("The factorial of " + number + " is: " + factorial);
        
        scanner.close();
    }
}
```

### 6. Multiplication Table
```java
public class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Multiplication Table (1-10):");
        
        // Print header row
        System.out.print("   | ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
        System.out.println("----+----------------------------------------");
        
        // Print table rows
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%2d | ", i);
            
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);
            }
            
            System.out.println();
        }
    }
}
```

## Advanced Exercises

### 7. Guessing Game
```java
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int secretNumber = random.nextInt(100) + 1; // Random number between 1 and 100
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");
        
        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess < secretNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > secretNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the number in " + attempts + " attempts!");
            }
        } while (guess != secretNumber);
        
        scanner.close();
    }
}
```

### 8. Loan Payment Calculator
```java
import java.util.Scanner;

public class LoanPaymentCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter loan amount: $");
        double loanAmount = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();
        double monthlyRate = annualRate / 100 / 12;
        
        System.out.print("Enter loan term in years: ");
        int years = scanner.nextInt();
        int months = years * 12;
        
        // Calculate monthly payment using the formula: P * r * (1+r)^n / ((1+r)^n - 1)
        double monthlyPayment = loanAmount * monthlyRate * Math.pow(1 + monthlyRate, months) 
                              / (Math.pow(1 + monthlyRate, months) - 1);
        
        System.out.printf("Monthly payment: $%.2f\n\n", monthlyPayment);
        System.out.println("Amortization Schedule:");
        System.out.println("---------------------------------------------");
        System.out.println("Payment | Principal Paid | Interest Paid | Remaining Balance");
        System.out.println("---------------------------------------------");
        
        double balance = loanAmount;
        double totalInterest = 0;
        
        for (int payment = 1; payment <= months; payment++) {
            double interest = balance * monthlyRate;
            double principal = monthlyPayment - interest;
            
            balance -= principal;
            totalInterest += interest;
            
            if (payment % 12 == 0 || payment == months || payment == 1) {
                System.out.printf("%7d | $%13.2f | $%12.2f | $%16.2f\n", 
                                 payment, principal, interest, balance);
            }
            
            if (balance < 0) {
                balance = 0;
            }
        }
        
        System.out.println("---------------------------------------------");
        System.out.printf("Total Interest Paid: $%.2f\n", totalInterest);
        
        scanner.close();
    }
}
```

### 9. Largest and Smallest Number Finder
```java
import java.util.Scanner;

public class LargestSmallestFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        System.out.println("Enter 10 numbers:");
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Number " + i + ": ");
            int number = scanner.nextInt();
            
            if (number > largest) {
                largest = number;
            }
            
            if (number < smallest) {
                smallest = number;
            }
        }
        
        System.out.println("The largest number entered is: " + largest);
        System.out.println("The smallest number entered is: " + smallest);
        
        scanner.close();
    }
}
```

### 10. Palindrome Checker
```java
import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check if it's a palindrome: ");
        String input = scanner.nextLine();
        
        // Remove spaces and convert to lowercase for more accurate palindrome checking
        String processed = input.toLowerCase().replaceAll("\\s+", "");
        boolean isPalindrome = true;
        
        for (int i = 0; i < processed.length() / 2; i++) {
            if (processed.charAt(i) != processed.charAt(processed.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }
        
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }
        
        scanner.close();
    }
}
```

### 11. Prime Number Generator
```java
public class PrimeNumberGenerator {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100:");
        
        for (int number = 2; number <= 100; number++) {
            boolean isPrime = true;
            
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                System.out.print(number + " ");
            }
        }
    }
}
```

### 12. Fibonacci Sequence Generator
```java
import java.util.Scanner;

public class FibonacciGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter how many Fibonacci numbers to generate: ");
        int n = scanner.nextInt();
        
        System.out.println("First " + n + " numbers in the Fibonacci sequence:");
        
        long a = 0;
        long b = 1;
        
        if (n >= 1) {
            System.out.print(a);
        }
        
        if (n >= 2) {
            System.out.print(", " + b);
        }
        
        for (int i = 3; i <= n; i++) {
            long next = a + b;
            System.out.print(", " + next);
            a = b;
            b = next;
        }
        
        scanner.close();
    }
}
```

### 13. Grade Calculator
```java
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How many assignments do you want to enter? ");
        int numAssignments = scanner.nextInt();
        
        double total = 0;
        
        for (int i = 1; i <= numAssignments; i++) {
            System.out.print("Enter score for assignment " + i + ": ");
            double score = scanner.nextDouble();
            total += score;
        }
        
        double average = total / numAssignments;
        
        String letterGrade;
        if (average >= 90) {
            letterGrade = "A";
        } else if (average >= 80) {
            letterGrade = "B";
        } else if (average >= 70) {
            letterGrade = "C";
        } else if (average >= 60) {
            letterGrade = "D";
        } else {
            letterGrade = "F";
        }
        
        System.out.printf("Average score: %.2f\n", average);
        System.out.println("Letter grade: " + letterGrade);
        
        scanner.close();
    }
}
```

### 14. Compound Interest Calculator
```java
import java.util.Scanner;

public class CompoundInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter initial investment amount: $");
        double principal = scanner.nextDouble();
        
        System.out.print("Enter annual interest rate (%): ");
        double annualRate = scanner.nextDouble();
        double rate = annualRate / 100;
        
        System.out.print("Enter number of years: ");
        int years = scanner.nextInt();
        
        System.out.print("Enter number of times interest is compounded per year: ");
        int compoundFrequency = scanner.nextInt();
        
        System.out.println("\nYear | Balance | Milestone");
        System.out.println("----------------------------");
        
        double balance = principal;
        double initialBalance = principal;
        
        for (int year = 1; year <= years; year++) {
            for (int period = 0; period < compoundFrequency; period++) {
                balance = balance * (1 + rate / compoundFrequency);
            }
            
            System.out.printf("%4d | $%,.2f ", year, balance);
            
            // Check for milestones
            if (balance >= 2 * initialBalance && balance < 3 * initialBalance) {
                System.out.println("| Doubled initial investment!");
            } else if (balance >= 3 * initialBalance && balance < 4 * initialBalance) {
                System.out.println("| Tripled initial investment!");
            } else if (balance >= 4 * initialBalance && balance < 5 * initialBalance) {
                System.out.println("| Quadrupled initial investment!");
            } else if (balance >= 5 * initialBalance) {
                System.out.println("| Five times or more than initial investment!");
            } else if (year == years) {
                System.out.println("| Final balance");
            } else {
                System.out.println();
            }
        }
        
        System.out.printf("\nInitial investment: $%,.2f\n", initialBalance);
        System.out.printf("Final balance after %d years: $%,.2f\n", years, balance);
        System.out.printf("Total interest earned: $%,.2f\n", balance - initialBalance);
        
        scanner.close();
    }
}
```

### 15. Number Reverse and Sum
```java
import java.util.Scanner;

public class NumberReverseAndSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        
        // Calculate the reverse of the number
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        
        // Calculate sum of digits
        number = originalNumber;
        int sum = 0;
        while (number != 0) {
            sum += number % 10;
            number /= 10;
        }
        
        System.out.println("Original number: " + originalNumber);
        System.out.println("Reversed number: " + reverse);
        System.out.println("Sum of digits: " + sum);
        
        if (originalNumber == reverse) {
            System.out.println("The number is a palindrome!");
        } else {
            System.out.println("The number is not a palindrome.");
        }
        
        if (originalNumber == sum) {
            System.out.println("The number equals the sum of its digits!");
        } else {
            System.out.println("The number does not equal the sum of its digits.");
        }
        
        scanner.close();
    }
}
```
