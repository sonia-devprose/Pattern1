---

# PatternProject

`PatternProject` is a simple Java console application that generates three different types of patterns based on user input. The patterns include:

1. Right-angled triangle of stars.
2. Square pattern of stars.
3. Right-angled triangle of numbers.

## Table of Contents

- [Features](#features)
- [How to Run](#how-to-run)
- [Example Output](#example-output)
- [Code](#code)

---

## Features

- **Right-Angled Triangle**: Generates a triangle pattern using `*`.
- **Square Pattern**: Generates a square pattern using `*`.
- **Number Triangle**: Generates a right triangle pattern with incremental numbers.

## How to Run

1. **Clone the repository**:
   ```bash
   git clone https://github.com/yourusername/patternproject.git
   cd patternproject
   ```

2. **Compile the Java file**:
   ```bash
   javac com/example/patternproject/PatternProject.java
   ```

3. **Run the program**:
   ```bash
   java com.example.patternproject.PatternProject
   ```

4. **Follow the on-screen instructions** to input the numbers for each pattern.

## Example Output

```
Enter a number to create a right-angled triangle: 
5
* 
* * 
* * * 
* * * * 
* * * * * 

Enter a number to create a square pattern: 
4
* * * * 
* * * * 
* * * * 
* * * * 

Enter a number to create a right triangle pattern with numbers: 
5
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
```

## Code

Here's the complete source code for the `PatternProject`:

```java
package com.example.patternproject;
import java.util.Scanner;

public class PatternProject {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        // Right-angled triangle of stars
        System.out.println("Enter a number to create a right-angled triangle: ");
        int n = read.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Square pattern of stars
        System.out.println("Enter a number to create a square pattern: ");
        int m = read.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Right-angled triangle with numbers
        System.out.println("Enter a number to create a right triangle pattern with numbers: ");
        int p = read.nextInt();
        for (int i = 1; i <= p; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
```

---

---

Happy coding! 😊
