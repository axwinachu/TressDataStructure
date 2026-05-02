public class PrintStar {
    static void print(int row){
        helper(row,0);
    }
    static void helper(int row,int col){
        if(row==0){
            return;
        }
        if(col<row){
            System.out.print("["+row+","+col+"]");
            helper(row, col+1);
        }
        if(col==row){
            System.out.println();
            helper(row-1, 0);
        }
    }
    public static void main(String[] args) {
        int row=5;
        print(row);
    }
}
