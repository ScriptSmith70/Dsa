class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int prevCol = image[sr][sc];
        if (prevCol == color) return image;

        dfs(image, sr, sc, color, prevCol);
        return image;
    }

    public void dfs(int[][] image, int sr, int sc, int color, int prevCol) {
        image[sr][sc] = color;

        int[][] dirs = { {1, 0}, {0, 1}, {-1, 0}, {0, -1} };

        for (int[] d : dirs) {
            int x = sr + d[0];
            int y = sc + d[1];

            if (x >= 0 && x < image.length && y >= 0 && y < image[0].length 
                && image[x][y] == prevCol) {
                dfs(image, x, y, color, prevCol);
            }
        }
    }
}