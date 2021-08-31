package SwordToOffer;

public class Day141 {
     static   int[] lengthAdd = {0,0,1,-1};
     static   int[] widthAdd = {1,-1,0,0};
    static boolean dfs(char[][] board,int i,int j,String word,int count){
        if(board[i][j]!=word.charAt(count)){
            return  false;
        }
        else
        {   if(count==word.length()-1){
            return true;
            }
            count++;
            char c = board[i][j];
            board[i][j] = '\0';
            boolean rel = false;
            for(int k=0;k<4;k++) {
                if (i + lengthAdd[k] >= 0 && i + lengthAdd[k] < board.length && j + widthAdd[k] >= 0 && j + widthAdd[k] < board[0].length ) {
                    rel = dfs(board, i + lengthAdd[k], j + widthAdd[k], word, count) || rel;
                }
            }
            board[i][j] = c;
            return rel;
        }

    };
    static  boolean exist(char[][] board, String word) {
      int length = board.length;
      int width = board[0].length;
      if(length==0||width==0){
          return false;
      }

      for(int i=0;i<length;i++){
          for(int j=0;j<width;j++){
              if(board[i][j]==word.charAt(0)){

                  int count = 0;
                 if( dfs(board,i,j,word,count)) {
                     return true;
                 }
                 }
              }
          }
      return false;
      }


    }


