package org.example.atividade4;

public class Main {
    public static void main(String[] args) {

        Motoboy boy1= new Motoboy("João","95163247800","987654321", Sexo.MASCULINO, 1480.51f, "26/07/1999", "01/01/2024", "QNB-9988");
        Gerente ger1 = new Gerente("Fernanda", "98754123659", "986532741", Sexo.FEMININO, 3500, "01/12/2000", "02/02/2022", Bonificacao.GERENTE);
        Diretor dir1 = new Diretor("Geovane", "33366655521", "144855966", Sexo.MASCULINO, 6890, "26/05/1985", "01/08/2021", Bonificacao.DIRETOR);

        System.out.println(dir1.toString());
        System.out.println(ger1.toString());
        System.out.println(boy1.toString());

        dir1.admitir(boy1);
        dir1.demitir(ger1);
    }
}
