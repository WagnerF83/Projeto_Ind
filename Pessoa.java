public class Pessoa extends Hospede {
    protected int rg;
    public String nacionalidade;

    public Pessoa(String nome, int cpf, Date data_nascimento, String endereco, String numero_celular){
        super( nome, cpf, data_nascimento, endereco, numero_celular)
    }
}

protected void setrg( int novo_rg ){
    this.rg=novo_rg
}
protected int getrg(){
    return this.rg
}

public void setnacionalidade( String nova_nac){
    this.nacionalidade=nova_nac
}
public String getnacionalidade(){
    return this.nacionalidade
}