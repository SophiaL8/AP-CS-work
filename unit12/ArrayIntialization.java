public class ArrayIntialization{
    public static void printStuff(int[][] values)
    {
        for (int[] row : values)
        {
            for (int value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
        public static void printStuff2(double[][] values)
    {
        for (double[] row : values)
        {
            for (double value : row)
            {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static int smallest(int[][] values){
        int maxValue = Integer.MAX_VALUE;
        int smallest= maxValue;
        for(int[] x: values){
            for(int value : x){
                if(value<smallest){
                smallest = value;
            }
            }
        }
        return smallest;
    }
    public static float sum(float [][] values){
        float sum = 0f;
        for(float[] x : values){
            for(float y: x){
                sum+= y;
            }
        }
        return sum;
    }
    public static int letterA(String[][] values){
        int count = 0;
        
        for(String[] x: values){
            for(String y : x){
            if(y.charAt(0) == 'A'){
                count++;
            }
            }
        }
        return count;
    }
    
    public static void main(String [] args){
        int[][] values = {{1,4,6},
                          {9, 10, 17},
                          {24, 18, 2}};
        
        System.out.println(smallest(values));
        
        float[][] values2 = {{10f, 2f, 30f},
                             {4f, 7f, 88f, 70f},
                             {89f, 21f}};
        System.out.println(sum(values2));
        
        String[][] values3 = {{"Apple", "Banana", "Cherry"},
                {"Avocado", "Grapes", "Orange"},
                {"Kiwi", "Apricot", "Mango"}};
        System.out.println(letterA(values3));
        
        int [][] diagonal = new int[10][10];
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(j==i){
                    diagonal[i][j] = 1;
            }else{
                    diagonal[i][j]=0;
                }
            }
        }
        printStuff(diagonal);
        
        double[][] addUp= new double[5][5];
        double num = 10;
        for(int i = 0; i<5; i++){
            for(int j=0; j<5; j++){
                num+= 1;
                addUp[i][j] = (i+1)*10 + j + 1;
            }
        }
        printStuff2(addUp);
        
        int[][] increase = new int[6][5];
        for(int i = 0; i<6; i ++){
            for(int j = 0; j<5; j++){
                increase[i][j] = (i+1);
            }
        }
        printStuff(increase);
    }
}