import com.sun.xml.internal.ws.util.StringUtils;

public class continue01 {

    public static int check(String s){
        //0 不是 1 整数 2 小数
            if(s.equals("."))
                return  0;

            char [] chars = s.toCharArray();
            int flagnumbers = 0;
            for (int i=0;i<chars.length;i++){
                if((chars[i]<='9'&&chars[i]>='0')||chars[i]=='+'||chars[i]=='-'||chars[i]=='.')
                {
                    if(chars[i]=='+'||chars[i]=='-'){
                        if (i!=0)
                            return 0;
                    }
                    if(chars[i]=='.')
                    {
                        flagnumbers++;
                        if(flagnumbers>1)
                        {
                            return  0;
                        }
                    }

                }
                else {
                    return  0;
                }
            }
            if (flagnumbers==1)
                return 2;
            else {
                return  1;
            }

    }

    public static boolean isNumber(String s) {
               ////该题题意就是要不就是一个小数，要不一个整数，要不一个整数或小数加e加整数  前后可以有空格,但中间不能有
        if (s.length()==0){
            return   false;
        }
        s = s.trim();
        if(s.indexOf("E")!=-1)
        {
            String[]  numbers = s.split("E");
            return numbers.length==2 &&check(numbers[0])!=0 &&check(numbers[1]) == 1;
        }
        else if(s.indexOf("e")!=-1){
            String[]  numbers = s.split("e");
            return numbers.length==2 &&check(numbers[0])!=0 &&check(numbers[1]) == 1;
        }
        else
        {
            return check(s)!=0;
        }





    }

    public static void main(String[] args) {
        boolean flag;

        flag = isNumber("123..334");
        System.out.println((flag));
    }


}
