# Peek Finder
## Problem
A given triple (a, b, c) is called a zigzag if either a < b > c or a > b < c.
Implement a method which checks all numbers in an array of integer to mark them as zigzag (1) or non-zigzag (0). Because
zigzag can't happen at the beggining  or at the end of the array, that numbers must be represented by a negative number (-1).

Examples: <br>

[1, 2, 1, 3, 4] ->  [-1, 1, 1, 0, -1] <br>
[] ->  [] <br>
[5] ->  [-1] <br>

## Setup/Requirements
* Java 11 or up
* Maven 3
