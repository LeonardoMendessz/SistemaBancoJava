public class contaBancaria{
        private int numConta;
    private String tipoConta;
    private String dono;
    private double saldo;
    private boolean statusConta;

    public contaBancaria(String tipoConta, String dono, int numConta) {
        this.tipoConta = tipoConta;
        this.dono = dono;
        this.numConta = numConta;
        abrirConta();
    }

  //------------------------------ GETTERS ----------------------------

 public int getNumConta(){
return this.numConta;

}

public String getTipoConta(){
return this.tipoConta;
}

public String getDono(){
return this.dono;
}

public double getSaldo(){
return this.saldo;
}

public boolean isStatusConta(){
return this.statusConta;
}


//------------------------------------ SETTERS -------------------------------

public void setNumConta(int numConta){
this.numConta = numConta;
}


public void setTipoConta(String tipoConta){
if(statusConta){
this.tipoConta = tipoConta;
} else {
System.out.println("Erro ao escolher o tipo de conta, conta está fechada");
}
}

public void setDono(String dono){
this.dono = dono;
}


public void setSaldo(double saldo){

this.saldo = saldo;
}


// --------------------- METODOS -----------------------------------------//


public void setStatusConta(boolean statusConta){

this.statusConta = statusConta;
} 

    public void abrirConta() {
        statusConta = true;
        System.out.println("Conta aberta, Seja bem-vindo ao banco!");

        if (tipoConta.equals("CC")) {
            saldo = 50;
        } else if (tipoConta.equals("CP")) {
            saldo = 150;
        }
    }

    public void depositar(double valor) {
        if(statusConta){
        saldo += valor;
} else{
System.out.println("Erro ao depositar,Conta está fechada");
}
    }

    public void sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
System.out.println("Saque Realizado: " + valor);
        } else {
            System.out.println("Saque não realizado, saldo insuficiente.");
        }
    }

    public void fecharConta() {
        if (saldo == 0) {
            statusConta = false;
            System.out.println("Conta encerrada!");
        } else {
            System.out.println("Erro: conta com saldo diferente de zero.");
        }
    }

    public void pagarMensalidade() {
        int taxa = 15;
        if (saldo >= taxa) {
            saldo -= taxa;
        } else {
            System.out.println("Saldo insuficiente para pagar a mensalidade.");
        }
    }

}