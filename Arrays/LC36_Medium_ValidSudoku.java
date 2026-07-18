/*
 * LeetCode 36 - Valid Sudoku
 * Difficulty: Medium
 *
 * Pattern: HashSet + Matrix Traversal
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 *
 * Key Learning:
 * - Validate rows, columns, and 3×3 boxes independently.
 * - Use a fresh HashSet for each row, column, and box.
 * - Traverse each 3×3 box using its starting coordinates.
 * - Use HashSet.add() to detect duplicates directly.
 */
class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0 ; i < board.length ; i++){
            HashSet<Character> rowSet = new HashSet<>();
            for(int j = 0 ; j < board[i].length ; j++){
                char rowNum = board[i][j];
                if (rowNum == '.') {
                    continue;
                }
                if(!rowSet.add(rowNum)){
                    return false;
                }
            }
            HashSet<Character> colSet = new HashSet<>();
            for(int j = 0 ; j < board.length ; j++ ){
                char colNum = board[j][i];
                if (colNum == '.') {
                    continue;
                }
                if(!colSet.add(colNum)){
                    return false;
                }
            }
        }
        for(int startRow = 0 ; startRow < 9 ; startRow+=3){
            for(int startCol = 0 ; startCol < 9 ; startCol+=3){
                HashSet<Character> boxSet = new HashSet<>();
                for(int i = 0 ; i < 3 ; i++){
                    for(int j = 0 ; j < 3 ; j++){
                        char boxNum = board[startRow + i][startCol + j];
                        if (boxNum == '.') {
                            continue;
                        }
                        if(!boxSet.add(boxNum)){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}