package CoreJavaVolume;

public class father {
        protected int a;
        protected int b;
        public  void aAdd(){
            a++;
        }


    @Override
    public String toString() {
        return getClass().getName() +
                " {a=" + a +
                ", b=" + b +
                '}';

    }

    public static void main(String[] args) {
        son s = new son();
        System.out.println(s.getClass().getClass());
        System.out.println(s.toString());

    }
}

