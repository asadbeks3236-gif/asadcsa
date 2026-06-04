public int getPointsForRow(int targetRow)
{
    int sum = 0;

    // Get the color of the first space in the row
    String firstColor = board[targetRow][0].getColor();
    boolean allSameColor = true;

    // Traverse the row
    for (int col = 0; col < board[targetRow].length; col++) {
        Space current = board[targetRow][col];
        sum += current.getPoints();

        // Check if colors differ
        if (!current.getColor().equals(firstColor)) {
            allSameColor = false;
        }
    }


    if (allSameColor) {
        return 2 * sum;
    }

    return sum;
}
