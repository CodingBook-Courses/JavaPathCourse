public class ReferenceValue {
//    public static void change(int x){
//        x = x * 2;
//    }
    public static void main(String[] args){
        Person p = new Person();
        p.setName("Nihan");
        //p.change(p);
        System.out.println(p.getName());
        //When a value passed, it gets copied
        //When a reference passed, it points to
        //the same reference

        //No copy for reference
        //Copy for a value (String,  int, double)
    }
}
