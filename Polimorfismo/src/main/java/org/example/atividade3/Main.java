package org.example.atividade3;

public class Main {
    public static void main(String[] args) {

        Motoboy boy1 = new Motoboy("Larissa", "95163214875", "01/01/2001", 2500, "QNB-9874");

        Gerente ger1 = new Gerente("Geovane", "74185296346","26/05/1985", 7500);

        System.out.println(boy1.toString());

        System.out.println(ger1.toString());

        ger1.admitir(boy1);
        ger1.demitir(boy1);

    }
}
