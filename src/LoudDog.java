public class LoudDog extends Dog{

    public LoudDog(String name){
        super(name);
    }
    @Override
    public String speak() {
        String response= super.speak();
        response= response + " " + response;
        return response;
    }
}
