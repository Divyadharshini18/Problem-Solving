class Solution {
    int[][] ind={
        {-1,0},
        {0,-1},
        {1,0},
        {0,1}
    };
    public void dfs(int[][] img,int r,int c,int ini,int color){
        img[r][c]=color;
        for(int[] i:ind){
            int x=r+i[0];
            int y=c+i[1];
            if(x>=0 && y>=0 && x<img.length && y<img[0].length && img[x][y]==ini)
                dfs(img,x,y,ini,color);
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int ini=image[sr][sc];
        if(ini!=color)
            dfs(image,sr,sc,ini,color);
        return image;
    }
}