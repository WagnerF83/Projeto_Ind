public class Quartos{

    public int quantidade_pessoas;
    public String tempo_estadia;
    protected int numq; //numero do quarto
    protected String horario_entrada;
    protected String horario_saida;

    public Quartos (int quantidade_pessoas, String tempo_estadia, int numq, String horario_entrada, String horario_saida){
        this.quantidade_pessoas
        this.tempo_estadia
        this.numq
        this.horario_entrada
        this.horario_saida
    }
    
    public Quartos(){

    }

    
    public Quartos (int quantidade_pessoas, String tempo_estadia, int numq){
        this.quantidade_pessoas
        this.tempo_estadia
        this.numq
    }
    
    
        public void setquantidade_pessoas( int nova_quant){
            this.quantidade_pessoas=nova_quant
        }
        public int getquantidade_pessoas(){
            return this.quantidade_pessoas
        }

        public void settempo_estadia( String novo_tempo){
            this.tempo_estadia=novo_tempo
        }
        public String gettempo_estadia(){
            return this.tempo_estadia
        }
        
        protected void setnumq( int novo_num){
            this.numq=novo_num
        }
        protected int getnumq(){
            return this.numq
        }
        protected void sethorario_entrada( String horario_e){
            this.horario_entrada=horario_e
        }
        protected String gethorario_entrada(){
            return this.horario_entrada
        }
        protected void sethorario_saida( String horario_s){
            this.horario_saida=horario_s
        }
        protected String gethorario_saida(){
            return this.horario_saida
        }
}