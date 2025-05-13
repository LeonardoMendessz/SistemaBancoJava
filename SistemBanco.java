import java.util.Scanner;

public class SistemBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o tipo de conta que deseja abrir: [CC / CP]");
        String tipoConta = teclado.nextLine(); // setTipoConta()

        System.out.println("Digite o nome do titular da conta:");
        String dono = teclado.nextLine(); // setDono()

        System.out.println("Digite o número da conta:");
        int numConta = teclado.nextInt(); // setNumConta()

        // Aqui já cria a conta automaticamente
        contaBancaria c1 = new contaBancaria(tipoConta, dono, numConta);

        int escolhaUsuario;
        double valor;
        double deposito;
        double taxa = 12.0; // Exemplo de taxa mensal

        do {
            System.out.println("-------------------------------------");
            System.out.println("            CONTA BANCÁRIA           ");
            System.out.println("-------------------------------------");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Sacar");
            System.out.println("3. Depositar");
            System.out.println("4. Fechar Conta");
            System.out.println("5. Exibir Dono");
            System.out.println("6. Pagar Mensalidade");
            System.out.println("7. Verificar Conta");
            System.out.println("0. Sair");
            System.out.println("-------------------------------------");
            System.out.print("Digite aqui a opção desejada: ");
            escolhaUsuario = teclado.nextInt();

            switch (escolhaUsuario) {
                case 1:
                    System.out.println("Saldo atual: R$ " + c1.getSaldo());
                    break;

                case 2:
                    System.out.print("Digite o valor que você quer sacar: ");
                    valor = teclado.nextDouble();
                    c1.sacar(valor);
                    break;

                case 3:
                    System.out.print("Informe o valor que você quer depositar: ");
                    deposito = teclado.nextDouble();
                    c1.depositar(deposito);
                    break;

                case 4:
                    c1.fecharConta();
                    break;

                case 5:
                    System.out.println("O titular da conta é: " + c1.getDono());
                    break;

                case 6:
                    c1.pagarMensalidade();
                    break;

                case 7:
                    System.out.println(c1.isStatusConta());
                    break;

                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Número inválido");
                    break;
            }

        } while (escolhaUsuario != 0);

        teclado.close();
    }
}
