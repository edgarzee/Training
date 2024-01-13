package pasa;

public class Dog {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("Bark Bark!!!11");
    }
    public void barkButWithAnException() throws BarkingException {
        bark();
        throw new BarkingException();
    }
    public void barkButWithAQuietException() {
        bark();
        throw new BarkingRuntimeException();
    }
}
