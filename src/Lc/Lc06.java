package Lc;

public class Lc06 {
    public String  convert(String s, int numRows) {
        if(s.length()==1)
        {
            return s;
        }
        char[][] zString = new char[numRows][s.length()];
        int row = 0;
        int col=0;
        boolean flag = true;
        for(int i=0;i<s.length();i++){
            zString[row][col]=s.charAt(i);
            if(flag==true){
                if(row<numRows-1){
                    row++;
                }
                else
                {
                    if(row-1>0){
                        row--;
                        col++;
                        flag = false;
                    }
                    else if(row-1==0){
                        row--;
                        col++;
                    }
                    else{
                        col++;
                    }
                }
            }
            else
            {
                if(row>1){
                    row--;
                    col++;
                }
                else
                {
                    row--;
                    col++;
                    flag=true;
                }
            }
        }
        StringBuilder rel = new StringBuilder();
        for(int k=0;k<zString.length;k++){
            for(int j=0;j<zString[0].length;j++){
                if(zString[k][j]!='\u0000'){
                    rel.append(zString[k][j]);

                }

            }

        }
        return rel.toString();
    }

    public static void main(String[] args) {
        Lc06 solution = new Lc06();
        String  rel = solution.convert("PAYPALISHIRING",3);
        System.out.println(rel);
    }
}
