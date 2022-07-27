
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        Wrapper wrap = new Wrapper();
        return wrap;
    }

    @Override
    abstract public float price();

}
