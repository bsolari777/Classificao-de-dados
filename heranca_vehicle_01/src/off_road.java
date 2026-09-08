public class off_road extends vehicle{

    private int groundClearance;

    public off_road(int passengers, int mpg, int fuelCap, int groundClearance){
        super(passengers,mpg,fuelCap);

        this.groundClearance=groundClearance;

    }

    public int getGroundClearance(){
        return groundClearance;
    }

    public void setGroundClearance(int groundClearance){
        this.groundClearance=groundClearance;

    }
    public  String toString(){
        return ("veículo--> passageiros: "+ getPassengers()+" /milhas por galao: " +getMpg() + " /capacidade do tanque de combustível: "+ getFuelCap() + " /distancia entre o veiculo e o solo: " + groundClearance);

    }

}