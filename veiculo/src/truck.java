public class truck extends vehicle {

private int cargaCap;

public truck(int passengers, int mpg, int fuelCap, int cargaCap){

super(passengers,mpg,fuelCap);

this.cargaCap=cargaCap;
}

public int getCargaCap(){
    return cargaCap;
}
public void setCargaCap(int cargaCap){
    this.cargaCap=cargaCap;
}
    public  String toString(){
        return ("veículo--> passageiros: "+ getPassengers()+" /milhas por galao: " +getMpg() + " /capacidade do tanque de combustível: "+ getFuelCap() + " /capacidade de carga: " + cargaCap );

    }
}