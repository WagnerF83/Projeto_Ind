public class Hospede{
   //Declaração de atributos
    public String nome;
    private int cpf;;
    public Date data_nascimento;
    protected String endereco;
    protected String numero_celular;
   //Construtor com paradigmas
    public Hospede (String nome, int cpf, date data_nascimento, String endereco, String numero_celular){
        this.nome
        this.cpf
        this.data_nascimento
        this.endereco
        this.numero_celular
    }

    //Construtor Vazio
     public Hospede (){

     }
    //Uso específico do construtor  
     public Hospede(String nome, int cpf, String numero_celular){
      this.nome
      this.cpf
      this.numero_celular
     }
     
     //Gets e Sets
        public void setnome(String NovoNome){
            this.nome=NovoNome
        }
         public String getnome(){
            return this.nome
         }

         private void setcpf (int Novocpf){
            this.cpf=Novocpf
         }
         private int getcpf(){
            return this.cpf
         }

         public void setdata_nascimento( Date NovaData){
            this.data_nascimento=NovaData
         }
         public Date getdata_nascimento(){
            return this.data_nascimento
         }

         protected void setendereco( String NovoEndereco){
            this.endereco=NovoEndereco
         }
         protected String getendereco(){
            return this.endereco
         }

         protected void setnumero_celular( String NovoNumero){
            this.numero_celular=NovoNumero
         }
         protected String getnumero_celular(){
            return this.numero_celular
         }
} 

        