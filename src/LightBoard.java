public class LightBoard {
    private boolean[][] lights;

    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        for (int r = 0; r < numRows; r++) {
            for (int c = 0; c < numCols; c++) {

                double random = Math.random();


                lights[r][c] = random < 0.4;
            }
        }
    }
    public boolean evaluateLight(int row, int col) {
        if(lights[row][col]) {
            int temp = 0;
            for(int i = 0; i < row; i++) {
                if (lights[i][col]) temp++;
            }
            if(temp % 2 == 0)
              return false;
        }

        else if(!lights[row][col]){
            int temp = 0;
            for (int i = 0; i < row; i++) {
                if (lights[i][col]) temp++;
            }
            if (temp % 3 == 0) 
              return true;
        }
        return lights[row][col];
    }





    public boolean[][] getLights(){
        return lights;
    }
    public void setLights(boolean[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                this.lights[i][j] = board[i][j];
            }
        }

    }


}

