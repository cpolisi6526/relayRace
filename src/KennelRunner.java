public class KennelRunner {
    public static void main(String[] args){
        Cat cat= new Cat("c");
        Dog dog= new Dog("d");
        LoudDog loudDog= new LoudDog("ld");

        Pet[] petArray= {cat,dog,loudDog};
        Kennel k= new Kennel(petArray);
        System.out.println(k.allSpeak());

    }
}
