package Encapsulation;

class Temperature{
    private int celsius;
    void getTemp(int celsius){
        this.celsius = celsius;
        System.out.println("Celsius : " + celsius);
    }
    double Fahrenheit(){
        double F = (celsius* 9/5) + 32;
        return F;
    }
}

public class TemperatureChange {
    public static void main(String[] args) {
        Temperature obj = new Temperature();
        obj.getTemp(25);
        System.out.println("Fahrenheit : "+obj.Fahrenheit());
    }
}
