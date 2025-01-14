# Groovy NullPointerException in List Iteration

This repository demonstrates a common Groovy error related to null values in lists and provides a solution to prevent `NullPointerExceptions`.

The `bug.groovy` file contains code that iterates through a list, including null values. The multiplication operation causes an exception when encountering null.  The `bugSolution.groovy` demonstrates the corrected approach.

## How to reproduce:

1. Clone this repository.
2. Navigate to the root directory.
3. Execute `groovy bug.groovy` (the program will throw a `NullPointerException`).
4. Execute `groovy bugSolution.groovy` (the program will handle null values gracefully).
