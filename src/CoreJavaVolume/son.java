package CoreJavaVolume;

public class son extends father{

    public String stringAdd(String s,String  b){
        return "this is a test";
    }

    public static void main(String[] args) {
        son ss = new son();
        father.hhh();

        System.out.println(ss.getA());
    }
}
