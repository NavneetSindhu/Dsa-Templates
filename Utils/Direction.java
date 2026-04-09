package Utils;

/**
 * Utility: Grid Navigation Vectors
 * Use Case: Moving Up/Down/Left/Right (or Diagonals) cleanly in a 2D matrix.
 */
class Direction {
    
    // 4-Way Movement: Up, Down, Left, Right
    public static final int[] dRow4 = {-1, 1, 0, 0};
    public static final int[] dCol4 = {0, 0, -1, 1};

    // 8-Way Movement: Includes 4 Diagonals
    public static final int[] dRow8 = {-1, -1, -1, 0, 1, 1, 1, 0};
    public static final int[] dCol8 = {-1, 0, 1, 1, 1, 0, -1, -1};

    // Universal boundary checker
    public static boolean isValid(int r, int c, int rows, int cols) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }
}
