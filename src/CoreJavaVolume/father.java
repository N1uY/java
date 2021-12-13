package CoreJavaVolume;

public class father {
    public static void hhh() {
        System.out.println("hhh");
    }
        private int a;
        private int b;

    public int getA() {
        return a;
    }
        public  void aAdd(){
            a++;
        }
        public String stringAdd(Object s,Object b){
            return "father";

        }

    @Override
    public String toString() {
        return getClass().getName() +
                " {a=" + a +
                ", b=" + b +
                '}';

    }

    public static void main(String[] args) {
        father f = new father();
        f.hhh();
    }
}

