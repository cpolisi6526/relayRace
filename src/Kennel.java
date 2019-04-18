import java.util.ArrayList;
import java.util.List;

public class Kennel {
    List<Pet> pets= new ArrayList<Pet>();

    public Kennel(Pet[] petArray){
        for(Pet x: petArray){
            this.pets.add(x);
        }
    }

    public String allSpeak(){
        String y= "";
        for(Pet x: pets){
            y+= " " +x.getMyName()+ ": "+ x.speak();
        }
        return y;
    }
}
