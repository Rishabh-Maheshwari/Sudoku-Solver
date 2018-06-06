
public class Solution {
	
	
	
	public static boolean sudokuSolver(int board[][]){
		
		 boolean sol= sudoku(board,0,0);
       if(sol)
     {
		for(int i=0;i<9;i++)
      {
        for(int j=0;j<9;j++)
        {
          System.out.print(board[i][j]+" ");
        }
        System.out.println("");
      }
       }
      return sol;
	}
  public static boolean sudoku(int[][] board, int i,int j)
  { 
    if(board[i][j]!=0)
    {
      if(j==8 && i!=8)
      {
        i+=1;
        j=0;
        return (sudoku(board,i,j));
      }
      else if(j!=8){
        j++;
        return (sudoku(board,i,j));
      }
    }
    if(i==8 && j==8)
    {
      if(board[8][8]!=0)
      {
        return true;
      }
    }
    for(int k=1;k<=9;k++)
    {
      board[i][j]=k;
      if(rowcheck(board,i,j)&&colcheck(board,i,j)&&regcheck(board,i,j))
      { if(j==8 && i==8)
      {
        return true;
      }
       boolean ans;
       if(j==8)
       {
          ans=sudoku(board,i+1,0);
       }
       else
       {
          ans=sudoku(board,i,j+1);
       }
        if(ans)
        {
          return true;
        }
        
      }
    }
    board[i][j]=0;
    return false;
  }
  public static boolean rowcheck(int[][] a,int i,int j)
  {
    for(int k=0;k<9;k++)
    {
      if(k!=j)
      {
        if(a[i][k]==a[i][j])
          return false;
      }
    }
    return true;
  }
  public static boolean colcheck(int[][] a,int i,int j)
  {
    for(int k=0;k<9;k++)
    {
      if(k!=i)
      {
        if(a[k][j]==a[i][j])
          return false;
      }
    }
    return true;
  }
  public static boolean regcheck(int[][] a,int i,int j)
  { int r,c;
    if(i<3)
    {
       r=0;
    }
    else if(i<6)
    {
       r=3;
    }
    else{
       r=6;
    }
    if(j<3)
    {
       c=0;
    }
    else if(j<6)
    {
       c=3;
    }
    else{
       c=6;
    }
    for(int k=r;k<r+3;k++)
    {
      for(int l=c;l<c+3;l++)
      {
        if(k!=i && l!=j)
        {
          if(a[k][l]==a[i][j])
            return false;
        }
      }
    }
    return true;
  }

	
	
}
