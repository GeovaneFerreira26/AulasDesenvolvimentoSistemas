package org.example.atividade2;

public class Main {
    public static void main(String[] args) {
        Fisica fisica1 = new Fisica("Jéssica Silva", "71991287625", "12396587428", "985632147", "10/10/2000");
        Juridica jurid1 = new Juridica("VXCASE", "7132706633",
                "159268000136","9876325");

        System.out.println(fisica1.toString());
        System.out.println(jurid1.toString());
    }
}
