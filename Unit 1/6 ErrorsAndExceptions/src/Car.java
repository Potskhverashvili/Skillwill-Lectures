public class Car {

    private String brand;

    Car(String brand){
        this.brand = brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {

        if(this.brand == obj){
            return true;
        }

        return false;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
