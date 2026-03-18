package org.example.atividade3;

public class Main {
    public static void main(String[] args) {
        Motoboy boy1 = new Motoboy("Geovane", "03565478915","26/05/1985", 2560, "QNB-8965");
        Gerente ger1 = new Gerente("Larissa", "95135785246", "12/05/2000", 12000, Bonificacao.GERENTE);

        System.out.println(boy1.toString());
        System.out.println(ger1.toString());

        ger1.admitir(boy1);
        ger1.demitir(ger1);
    }
}
