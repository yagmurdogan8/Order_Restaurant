public abstract class ColdDrink implements Item {


    @Override
    public Packing packing() {
        Bottle bottle = new Bottle();
        return bottle;
    }

    @Override
    abstract public float price();

}
