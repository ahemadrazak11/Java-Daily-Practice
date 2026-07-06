class GenericClass{

    public static void main(String[] args){

        Gen<Integer> num = new Gen<>(10);
        System.out.println(num.a);

        Gen<String> str = new Gen<>("Hello");
        System.out.println(str.a);
    }
}

class Gen<T>{

    public T a;

    Gen(T a){
        this.a = a ;
    }

}