package poo;

public class Soldado {

    private final int deslocamento = 5;
    private static int soldados;
    private String arma;
    private int distancia;


    public Soldado(){
        soldados++;
    }
    public void setArma(String arma){
        this.arma = arma;
    }
    public String mover(){
        distancia += deslocamento;
        return "Soldado movendo-se "+deslocamento+" distâncias";
    }

    public String mover(int distancia){
        this.distancia += distancia;
        return "Soldado movendo-se "+distancia+" distâncias";
    }

    public static String atacar(){

        if(soldados < 10){
            return "Ainda não, esperando exércio ficar maior!";
        }else{
            return "Atacando com fuzil!";

        }
    }

    public static String atacar(String arma){

        if(soldados < 10){
            return "Ainda não, esperando exércio ficar maior!";
        }else{
            return "Atacando com "+arma+"!";

        }
    }


}
