package CoreJavaVolume;

public class father {
        protected int a;
        protected int b;
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

}

