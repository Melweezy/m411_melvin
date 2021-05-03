package GameOfLife;

public class GameOfLife_v0 {
    private static boolean[][] world;

    public static void main(String[] args){
        world = initializeWorld();
        simulateGame(world);
        boolean[][] wolrdCopy = new boolean[10][10];
        System.arraycopy(world,0,wolrdCopy,0,10);
        for (int i = 0; i < world.length; i++){
            for (int j = 0; j < world.length; j++){
                int neighbours = checkForNeighbours(i,j);
                world[i][j] = isCellALife(neighbours, wolrdCopy[i][j]);
            }
        }
        showWorld(world);
    }

    public static boolean[][] initializeWorld(){
        boolean[][] worldi = new boolean[10][10];
        for(int i = 0; i < worldi.length; i++) {
            for(int j = 0; j < worldi.length; j++){
                worldi[i][j] = false;
            }
        }
        return worldi;
    }
    public static void showWorld(boolean[][] world){
        for(int i = 0; i < world.length; i++) {
            for(int j = 0; j < world.length; j++){
                if(world[i][j]){
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
    public static void simulateGame(boolean[][] world){
        world[4][4] = true;
        world[4][5] = true;
        world[4][6] = true;

    }
    public static int checkForNeighbours(int row, int col){
        int count = 0;
        for(int i = row -1; i <= row+1; ++i) {
            for (int j = col - 1; j <= col + 1; ++j) {
                if (j < 0 || j >= world[0].length || i < 0 || i >= world.length) { //skip world border
                    continue;
                }
                if (world[i][j]){
                    count++;
                }
            }
        }
        if(world[row][col]){
            count--;
        }
        return count;
    }

    public static boolean isCellALife(int neighbours, boolean worldCellALife){
        if (neighbours == 3) return true;
        return neighbours == 2 && worldCellALife;
    }
}