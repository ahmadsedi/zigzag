# ZigZag
A given triple (a, b, c) integers is called a zigzag if either a < b > c or a > b < c. 

## Solution
We are asked to implement a method which receives an array of integers and find all available zigzag in them. This method returns an array with the same length of the input, and 
sets each element with either 0, 1, or -1. if the number is zigzag, the corresponding value in the returned array is 1, non-zigzag is 0, and for not applicable elements (first and last element of the array, because zigzag can't happen at the beginning or at the end of the array) it's -1.

Examples: <br>

[1, 2, 1, 3, 4] ->  [-1, 1, 1, 0, -1] <br>
[] ->  [] <br>
[5] ->  [-1] <br>

Java functional programming has been used to implement this requirement. 

## Setup/Requirements
* Java 11 or up
* Maven 3
