public abstract class Pet {
    String myName;

    public Pet(String name){
        this.myName= name;
    }

    public String getMyName(){
        return myName;
    }

    public abstract String speak();
    }

