public class Main{

    public static void main( String[] args ){

        Hospede h1 = new Hospede();
        h1.setnome ("Paulo");
        h1.setcpf (649.359.532.10);
        h1.setdata_nascimento (10/11/2001);
        h1.setendereco ("Av.13 de maio");
        h1.setnumero_celular ("81 9999-9999")

        Quartos q1 = new Quartos();
        q1.setquantidade_pessoas (5);
        q1.settempo_estadia ("1 mês");
        q1.setnumq (19);
        q1.sethorario_saida ("8:00 AM")
        q1.sethorario_entrada ("17:00 PM");

        Reserva r1 = new Reserva();
        r1.setcod_reserva (5264);
        r1.setdata_reserva (01/01/2024);
        r1.setvalor_diario (780,00f);
        r1.setforma_de_pagamento ("Cartão de crédito");
        r1.setid_emp (53862);
    }
}