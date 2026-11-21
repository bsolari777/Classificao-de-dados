public class vehicle{

    private int passengers;
    private int mpg;
    private int fuelCap;

    public vehicle(int passengers, int mpg, int fuelCap){
        this.passengers=passengers;
        this.mpg=mpg;
        this.fuelCap=fuelCap;

    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers){
        this.passengers=passengers;
    }

    public int getMpg(){
        return mpg;
    }

    public void setMpg(int mpg){
        this.mpg=mpg;

    }

    public int getFuelCap(){
        return fuelCap;
    }

    public void setFuelCap(int fuelCap){
        this.fuelCap=fuelCap;

    }

    public  String toString(){
        return ("veículo--> passageiros: "+ passengers +" /milhas por galao: " +mpg+ " /capacidade do tanque de combustível: "+ fuelCap );

    }
}
