package SwordToOffer;

import javax.xml.bind.SchemaOutputResolver;
import java.util.LinkedList;
import java.util.Queue;

public class Day142 {
    //想错了，这题应该是用广度优先搜索
    static int[] lengthAdd = {0,0,1,-1};
    static int[] widthAdd = {1,-1,0,0};
    static  int movingCount(int m, int n, int k) {
        int count=0;
        boolean[][] reachAble = new boolean[m][n];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0,0});
        reachAble[0][0] = true;
        while (!queue.isEmpty()){
            int[] tmp = queue.poll();
            int i= tmp[0];
            int j = tmp[1];
            for(int s=0;s<4;s++){
                int nexti = i+lengthAdd[s];
                int nextj = j+widthAdd[s];

                if(nexti>=0&&nexti<m&&nextj>=0&&nextj<n&& !reachAble[nexti][nextj]){
                    int sum=0;
                    int nextii = nexti;
                    int nextjj = nextj;
                    while (nexti>0){
                        sum+=nexti%10;
                        nexti=nexti/10;
                    }

                    while (nextj>0){
                        sum+=nextj%10;
                        nextj = nextj/10;
                    }

                    if(sum<=k){
                        queue.add(new int[]{nextii,nextjj});
                        reachAble[nextii][nextjj]=true;
                    }
                }
            }
        }

        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(reachAble[i][j]){
                    count++;

                }

            }

        }
        return count;
    }


}
