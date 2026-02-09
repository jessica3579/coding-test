class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int n = board[0].length;
        int[][] safeArea = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(board[i][j] == 1){
                    for (int x = i - 1; x <= i + 1; x++) {
                        for (int y = j - 1; y <= j + 1; y++) {
                            if (x >= 0 && x < n && y >= 0 && y < n) {
                                safeArea[x][y] = 1;
                            }
                        }
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (safeArea[i][j] == 0) {
                    answer++;
                }
            }
        }
        return answer;
    }
}