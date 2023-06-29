public class AnonymousClass {
    public static void main (String[] args){
        A a1 = new A();
        A a2 = new A(){
            @Override
            public String toString() {
                return super.toString();
            }
        };
        System.out.println(a1.getClass());
        System.out.println(a2.getClass());
    }
}

class A{}
