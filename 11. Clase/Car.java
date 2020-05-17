package pack;

public class Car 
{
    private int nrUsi;
    private boolean volanStanga = true;
    
    // This is a getter
    public boolean isVolanStanga() {
        return volanStanga;
    }
    
    // This is a setter
    public void setVolanStanga(boolean volanStanga) {
        this.volanStanga = volanStanga;
    }
    
    // This is a getter
    public int getNrUsi() {
        return nrUsi;
    }


    // Ctor fara param.
    public Car()
    {
        System.out.println("S-a chemat ctor fara param!");
    }
    
    // Ctor cu doi param.
    public Car(int nrUsi, boolean volan)
    {
        this.nrUsi = nrUsi;
        this.volanStanga = volan;

        System.out.println("S-a chemat ctor cu param!");

    }

    public void afiseazaMasina()
    {
        System.out.println("S-a chemat metoda mea din clasa Car");
    }
}
