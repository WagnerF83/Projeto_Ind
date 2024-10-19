public class Reserva{

    public int cod_reserva
    public Date data_reserva
    public float valor_diario
    public String forma_de_pagamento
    protected int id_emp //ID da empresa

    public Reserva(int cod_reserva, Date data_reserva, float valor_diario, String forma_de_pagamento, int id_emp){
        this.cod_reserva
        this.data_reserva
        this.valor_diario
        this.forma_de_pagamento
        this.id_emp
    }

    public Reserva(){

    }

    public Reserva(int cod_reserva, float valor_diario, String forma_de_pagamento){
        this.cod_reserva
        this.valor_diario
        this.forma_de_pagamento
    }

    public void setcod_reserva( int novo_cod){
        this.cod_reserva=novo_cod
    }
    public int getcod_reserva(){
        return this.cod_reserva
    }

    public void setdata_reserva( Date nova_data){
        this.data_reserva=nova_data
    }
    public Date getdata_reserva(){
        return this.data_reserva
    }

    public void setvalor_diario( float novo_valor){
        this.valor_diario=novo_valor
    }
    public float getvalor_diario(){
        return this.valor_diario
    }
    public void setforma_de_pagamento( String novo_pag){
        this.forma_de_pagamento=novo_pag
    }
    public String getforma_de_pagamento(){
        return this.forma_de_pagamento
    }
    protected void setid_emp( int novo_id){
        this.id_emp=novo_id
    }
    protected int getid_emp(){
        return this.id_emp
    }
}