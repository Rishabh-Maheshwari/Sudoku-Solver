# Sudoku-Solver

Rules- first (As Always)
1. The classic Sudoku game involves a grid of 81 squares. 
2. The grid is divided into nine blocks, each containing nine squares.
3. The rules of the game are simple: each of the nine blocks has to contain all the numbers 1-9 within its squares. 
4. Each number can only appear once in a row, column or box.
5. The difficulty lies in that each vertical nine-square column, or horizontal nine-square line across, within the larger square, must also contain the numbers 1-9, without repetition or omission.
6. Every puzzle has just one correct solution. 

Example:
Testcase 1(Solvable):

Input :     
9 0 0 0 2 0 7 5 0 
6 0 0 0 5 0 0 4 0 
0 2 0 4 0 0 0 1 0 
2 0 8 0 0 0 0 0 0 
0 7 0 5 0 9 0 6 0 
0 0 0 0 0 0 4 0 1 
0 1 0 0 0 5 0 8 0 
0 9 0 0 7 0 0 0 4 
0 8 2 0 4 0 0 0 6

Output:
9 4 1 3 2 6 7 5 8 
6 3 7 1 5 8 2 4 9 
8 2 5 4 9 7 6 1 3 
2 6 8 7 1 4 3 9 5 
1 7 4 5 3 9 8 6 2 
3 5 9 6 8 2 4 7 1 
4 1 3 2 6 5 9 8 7 
5 9 6 8 7 3 1 2 4 
7 8 2 9 4 1 5 3 6 
true

Testcase 2(Unsolvable):

Input:
9 0 0 0 2 0 7 5 0 
6 0 0 0 5 0 0 4 0 
0 2 0 4 0 0 0 1 0 
2 0 8 0 0 0 0 0 0 
0 7 0 5 0 9 0 6 3 
0 0 0 0 0 0 4 0 1 
0 1 0 0 0 5 0 8 0 
0 9 0 0 7 0 0 0 4 
0 8 2 0 4 1 0 0 6

Output:
false
