package Encapsulation;

class Amount{
    private int amount;
    void setRupees(int amount){
        this.amount=amount;
    }
    int getRupees(){
        return amount;
    }
}

public class Atm {
    public static void main(String[] args) {
        Amount obj = new Amount();
        obj.setRupees(100000);
        System.out.println(obj.getRupees());;
    }
}
