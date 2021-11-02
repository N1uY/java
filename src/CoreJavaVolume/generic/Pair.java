package CoreJavaVolume.generic;

public class Pair <T extends Comparable>{
    private  T first;
    private T second;
    public Pair(){first=null;second = null;}
    public Pair(T first,T second){this.first=first;this.second=second;}
    public T getFirst(){return this.first;}
    public T getSecond(){return this.second;}

    public void setFirst(T newvalue) {
        this.first = newvalue;
    }

    public void setSecond(T newvalue){
        this.second = newvalue;
        System.out.println("Method in fatherclass");
    }
}
