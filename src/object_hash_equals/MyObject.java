package object_hash_equals;

class MyObject extends AbstractClass implements MyInterface {

    MyObject(int b) {
        this.b = b;
        q = 5;
    }

//    int a;
    int b = a;

    static int r;

    public MyObject() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
