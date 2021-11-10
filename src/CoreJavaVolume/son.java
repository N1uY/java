package CoreJavaVolume;

public class son extends father{
    public void bAdd(){
        b++;
    }
    public String stringAdd(String s,String  b){
        return "this is a test";
    }

    public static void main(String[] args) {
        father ss = new son();
        System.out.println(ss.stringAdd( "123", "456"));
    }
}
