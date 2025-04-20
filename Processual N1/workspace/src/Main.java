import java.util.Scanner;

//Media das notas n1,n2,n3,n4;
class Media{
    public static void calcularMedia(){
        Scanner input = new Scanner(System.in);
        double nota1 = 0;
        double nota2 = 0;
        double nota3 = 0;
        double nota4 = 0;
        double resultadomedia = 0;

        System.out.print("Digite a  nota n1: ");
        nota1 = input.nextDouble();
        System.out.print("Digite a  nota n2: ");
        nota2 = input.nextDouble();
        System.out.print("Digite a  nota n3: ");
        nota3 = input.nextDouble();
        System.out.print("Digite a  nota n4: ");
        nota4 = input.nextDouble();
        resultadomedia = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Media da nota: " + resultadomedia);
    }
}

//Valor da parcela for inferior a 20% do salario o empréstimo e concedido
//Valor da parcela for superior a 20% do salario o empréstimo não e concedido
class Emprestimo{
    public static void Emprestimo(){
        double salario = 0;
        double valorparcela = 0;
        Scanner leitor = new Scanner(System.in);
        System.out.print("Digite o valor do parcela: ");
        valorparcela = leitor.nextDouble();
        System.out.print("Digite a quantidade do salario: ");
        salario = leitor.nextDouble();
        if(valorparcela >= salario/100*20){
            System.out.println("Emprestimo não permitido");
        } else if (valorparcela <= salario/100*20) {
            System.out.println(" Emprestimo realizado com sucesso");

        }
    }
}

//Calcular Índice de massa corporal
class Imc{
    public static void calcularImc() {
        Scanner input = new Scanner(System.in);
        double peso = 0;
        double altura = 0;
        double imc = 0;
        System.out.println("Digite o Peso: " );
        peso = input.nextDouble();
        System.out.println("Digite o Altura: " );
        altura = input.nextDouble();
        System.out.println("Peso digitado: " + peso);
        System.out.println("Altura digitado: " + altura);
        imc = peso/(altura*altura);
        System.out.printf("Seu IMC é: %.2f - ", imc);

        if(imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc < 25) {
            System.out.println("Peso normal");
        } else if(imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
    }
}


// calcular quantos litros de combustivel sera necessario para viagem
class CalculadoraCombustivel {
    public static void calcularCombustivel(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Distância da viagem (km): ");
        double distancia = input.nextDouble();

        System.out.print("Consumo médio do veículo (km/l): ");
        double consumo = input.nextDouble();

        System.out.print("Preço do litro de combustível: R$");
        double precoLitro = input.nextDouble();

        double litrosNecessarios = distancia / consumo;
        double custoTotal = litrosNecessarios * precoLitro;

        System.out.printf("\nVocê precisará de %.2f litros\n", litrosNecessarios);
        System.out.printf("\nCusto total da viagem: R$%.2f\n", custoTotal);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma opção: 1- CalcularMedia, 2- Emprestimo, 3- Imc,  4- CalculadoraCombustivel: ");
        int opcao = input.nextInt();
        if(opcao == 1){
            Media.calcularMedia();

        } else if (opcao == 2) {
            Emprestimo.Emprestimo();

        }
        else if (opcao == 3) {
            Imc.calcularImc();
        } else if (opcao == 4) {

            CalculadoraCombustivel.calcularCombustivel(args);
        }

    }
}