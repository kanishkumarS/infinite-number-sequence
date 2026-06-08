# 🔢 Nth Digit Finder

## Description

This project efficiently finds the nth digit in the infinite sequence:

123456789101112131415...

Instead of generating the entire sequence, the algorithm uses mathematical analysis to determine the digit directly.

## Technologies

- Java
- Mathematics
- Algorithms

## Problem Statement

Given an integer n, return the nth digit in the sequence:

123456789101112131415...

Example:

Input: 11
Output: 0

Sequence:
12345678910

The 11th digit is 0.

## Algorithm

1. Determine the digit-length block containing the nth digit.
2. Calculate the exact number within that block.
3. Identify the required digit position.
4. Return the digit.

## Features

- O(log n) complexity
- No sequence generation
- Memory efficient
- Handles large inputs

## Concepts Used

- Number theory
- Positional arithmetic
- Mathematical optimization
- String indexing

## Example

Input:
15

Output:
2

Sequence:
123456789101112

15th digit = 2
