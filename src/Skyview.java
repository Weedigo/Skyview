public class Skyview {
    double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numRows][numCols];
        int index = 0;
        for(int i = 0; i < view.length; i++)
        {
            if(i%2==0)
            {
                for(int j = 0; j < view[i].length; j++){
                    view[i][j] = scanned[index];
                    index++;
                }
            } else{
                for(int j = view[i].length; j>=0; j--){
                    view[i][j] = scanned[index];
                    index++;
                }
            }
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double n = 0;
        int sum = 0;
        for(int row = startRow; row <= endRow; row++)
        {
            for (int col = startCol; col <= endCol; col++)
            {
                sum += view[row][col];
                n++;
            }
        }
        return(sum/n);
    }
}
