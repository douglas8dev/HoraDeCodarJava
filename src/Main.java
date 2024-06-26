import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //ex 1
 //       String Planeta = "Plutão";
 //       System.out.println("O Planeta é: " + Planeta);

        //ex2
 //       Scanner entrada = new Scanner(System.in);
 //       System.out.print("Digite o seu nome: ");
 //       String nomeUsuario = entrada.nextLine();
 //       System.out.print("Bom dia, " + nomeUsuario);

        //ex3

 //       System.out.println("Informe seu nome");
//        String nomeUsuario = entrada.nextline();
//        System.out.println("Informe sua idade");
//        int idade = entrada.nextInt();
//        System.out.print("Bom dia, " + nomeUsuario + ", sua idade é " + idade);

        //ex4

//        System.out.print("Informe um lado: ");
//        double lado = entrada.nextDouble();
//        area lado * lado;
//        System.out.println("A soma do quadrado é: " + area);


//        System.out.println("Informe a diagonal maior");
//        double diagonalMaior = entrada.nextDouble();

//        System.out.println("Informe a diagonal menor");
//        double diagonalMenor = entrada.nextDouble();

//        double area = diagonalMaior * diagonalMenor / 2;

//        System.out.println("A area é: " + area );

//        System.out.println("Calculo da área do paralelogramo");
//        System.out.print("informe a base: ");
//        double baseParalelogramo = scanner.nextDouble();
//        System.out.print("informe a altura: ");
//        double alturaParlelogramo = scanner.nextDouble();
//        double areaParalelogaramo = baseParalelogramo * alturaParalelogramo;
//        System.out.println("A área do paralelogramo é: " + areaParalelogramo);

//        System.out.println("\nCálculo da área do triângulo");
//        System.out.print("informe a base: ")
//        double baseTriangulo = scanner.nextDouble();
//        System.out.print("informe a altura: ");
//        double alturaTriangulo= scanner.nextDouble();
//        double areaTriangulo = (baseTriangulo * alturaTriangulo) /2;
//        System.out.println("A área do triangulo é: " + areaTriangulo);

//        System.out.println("\nCalculo da área do círculo");
//        System.out.print("informe o raio: ");
//        double raio = scanner.next double();
//        duoble areaCirculo = Math.PI * Math.pow(raio, 2);
//        System.out.println("á area do circulo é: " + areaCirculo);

        //ex5

//        System.out.println("Informe o valor ");
//        double valor = entrada.nextDouble();
//        if(valor>0){
//            System.out.println("O valor informado é positivo");
//        }else if(valor<0){
//            System.out.println("O valor informado é negativo");
//        }else{
//            System.out.println("O valor informado é neutro");
//        }

        //ex6

//        System.out.print("Digite três valores diferentes: ");
//        double valor1 = scanner.nextDouble();
//        double valor2 = scanner.nextDouble();
//        double valor3 = scanner.nextDouble();
//        double maxValue = Math.max(valor1, Math.max(valor2, valor3));
//        System.out.println("o maior valor é: " + maxValue);

        //ex7

        //ex8

//        Scanner sc = new Scanner(System.in);
//        int valor1 = 0;
//        int valor2 = 0;
//        do{
//            System.out.println(x: "Informe dois valores");
//            valor1 = sc.nextInt();
//            valor2 = sc.nextInt();
//        } while(valor2<=0);
//        double resultado = valor1/valor2;
//
//        System.out.println("Resultado: "+resultado);

        //ex9

//        Scanner entrada = new Scanner(System.in);
//
//        double soma = 0;
//        int quantidade = 10;
//
//        System.out.println("Digite " + quantidade + "valores: ");
//
//        for (int i = 1; i <= quantidade; i++) {
//            System.out.print("Valor + 1 + ": ");
//            double valor = entrada.nextDouble();
//            soma += valor;
//        }
//
//        double media soma quantidade;
//        System.out.println("\nA média aritmética é: + media);

        //ex10

//        double n1,n2,n3,n4, media;
//        System.out.println("Digite a primeira média:");
//        n1 = scanner.nextDouble();
//        System.out.println("Digite a segunda média:");
//        n2 = scanner.nextDouble();
//        System.out.println("Digite a terceira média:");
//        n3 = scanner.nextDouble();
//        System.out.println("Digite a quarta média:");
//        n4 = scanner.nextDouble();
//
//        media = (n1,n2,n3,n4) / 4;
//        System.out.println("A média do semestre " + media);
//        if(media >= 6){
//            System.out.println("Parabéns, você foi aprovado");
//        }else {
//            System.out.println("Você foi reprovado");
//        }

        //ex11

//          int contador = 30;
//          for (int i = 1; contador >= i; contador--) {
//              System.out.println(contador);
//              if (contador == 0) {
//                  System.out.println("Explodiu");
//              }
//          }

        //ex 12

//            for(int i = 10; i>0; i--){
//                System.out.println(i);
//            }
//        }

        //ex13

//        int nUm, nDois, count = 0;
//        double media = 0;
//        System.out.print("adicione o primeiro numero menor que o segundo: ");
//        nUm = scanner.nextInt();
//        System.out.println("Adicione o segundo número: ");
//        nDois = scanner.nexInt();
//            do{
//                count++;
//                media += nUm;
//                nUm++;
//            }while (nDois >= nUm);
//            media = media / count;
//        System.out.println("A média é: " + media);

        //ex 14

//        double n1, n2, n3, n4, n5, n6, media = 0,aprovados = 0, reprovados = 0;
//        String resp = "sim";
//        while(resp.equals("sim")){
//            System.out.println("digite a Primeira nota");
//            n1 = scanner.nextDouble();
//            System.out.println("digite a segunda nota");
//            n2 = scanner.nextDouble();
//            System.out.println("digite a terceira nota");
//            n3 = scanner.nextDouble();
//            System.out.println("digite a quarta nota");
//            n4 = scanner.nextDouble();
//            System.out.println("digite a quinta nota");
//            n5 = scanner.nextDouble();
//            System.out.println("digite a sextaa nota");
//            n6 = scanner.nextDouble();
//            media = (n1+n2+n3+n4+n5+n6) / 6;
//            System.out.println("a média foi de: " + media);
//            if(media <= 6.5) {
//                System.out.println("faz o L");
//                reprovados++;
//            }else {
//                System.out.println("aprovation");
//                aprovados++;
//            }
//            System.out.println("deseja calcular outra média? ");
//            resp = scanner.next();
//        }
//
//        System.out.println("a quantidade de alunos aprovados foi: " + aprovados);
//        System.out.println("a quantidade de alunos reprovados foi: " + reprovados);


        //ex15

//        int anos = 0;
//        double felisberto = 1.10;
//        double anacleto = 1.50;
//
//        while (felisberto < anacleto) {
//        felisberto += 0.3;
//        anacleto += 0.02;
//        anos++;
//        }
//        System.out.println("Foram necessarios " + anos + " a nos");

        //ex16

//        System.out.println("\nVamos calcular os votos! \nDigite o total de eleitores: ");
//        int totalEleitores = entrada.nextInt();
//        System.out.println("Digite o percentual de votos brancos");
//        double pBrancos = entrada.nextDouble();
//        System.out.println("Digite o percentual de votos válidos: ");
//        double pValidos = entrada.nextDouble();
//        System.out.println("Digite o percentual de votos nulos: ");
//        double pNulos = entrada.nextDouble();
//
//        double vBrancos = totalEleitores * (pBrancos / 100);
//        double vValidos = totalEleitores * (pValidos / 100);
//        double vNulos = totalEleitores * (pNulos / 100);
//        System.out.println("\nQuantidade de votos de cada categoria: ");
//        System.out.println("Votos brancos: " + vBrancos);
//        System.out.println("Votos válidos: " + vValidos);
//        System.out.println("Votos nulos: " + vNulos);

        //ex 17

//        double fabrica, distribuidora, custoFinal;
//        System.out.print("informe o valor do carro na fabrica: ");
//        fabrica = scanner.nextDouble();
//        System.out.print("informe o valor cobrado pela distribuidora: ");
//        distribuidora = scanner.nextDouble();
//        fabrica += fabrica * 1.28;
//        distribuidora += distribuidora * 1.45;
//
//        fabrica = 0.28;
//        distribuidora *= 0.45;
//        custoFinal = fabrica + distribuidora;
//        System.out.println("0 Consumidor final pagará: " + custoFinal);


        //ex18

//        double salarioFixo = 5000.00;
//        System.out.println("Informe o número de carros vendidos: ");
//        int carrosVendidos = scanner.nextInt();
//
//        System.out.println("Informe o valor total das vendas: ");
//        double valorTotalVendas = scanner.nextDouble();
//
//        System.out.println("Informe a comissão fixa por carro vendido: ");
//        double comissaoFixaPorCarro = scanner.nextDouble();
//
//        double comissaoTotalPorCarros = carrosVendidos * comissaoFixaPorCarro;
//        double comissaoPercentualSobreVendas = valorTotalVendas * 0.05;
//        double salarioFinal = salarioFixo + comissaoTotalPorCarros + comissaoPercentualSobreVendas;
//
//        System.out.println("Detalhes do salário do vendedor:");
//        System.out.println("Salário fixo mensal: R$ " + salarioFixo);
//        System.out.println("Número de carros vendidos: " + carrosVendidos);
//        System.out.println("Comissão fixa por carro vendido: R$ " + comissaoFixaPorCarro);
//        System.out.println("Comissão total por carros vendidos: R$ " + comissaoTotalPorCarros);
//        System.out.println("5% do valor total das vendas: R$ " + comissaoPercentualSobreVendas);
//        System.out.println("Salário final do vendedor: R$ " + salarioFinal);

        //ex19

//        System.out.println("Digite o primeiro numero: ");
//        double num1 = leitor.nextDouble();leitor.nextLine();
//
//        System.out.println("Digite o segundo numero: ");
//        double num2 = leitor.nextDouble();leitor.nextLine();
//
//        System.out.println("Digite o terceiro numero: ");
//        double num3 = leitor.nextDouble();leitor.nextLine();
//
//        if (num1 < (num2 + num3) && num2 < (num1 + num3) && num3 < (num2 + num1)){
//            System.out.println("Foi possível formar um triângulo! ");
//            return;
//        }
//        System.out.println("Não foi possível formar um triângulo! ");

      //ex 20

//        public class Produto {
//            private String nome;
//            private int quantidade;
//            private double precoUnitario;
//
//            public Produto(String nome, int quantidade, double precoUnitario) {
//                this.nome = nome;
//                this.quantidade = quantidade;
//                this.precoUnitario = precoUnitario;
//            }
//
//            public double calcularValorVenda() {
//                return quantidade * precoUnitario;
//            }
//
//            public double calcularDesconto() {
//                double desconto;
//                if (quantidade <= 5) {
//                    desconto = 0.02;
//                } else if (quantidade > 5 && quantidade <= 10) {
//                    desconto = 0.03;
//                } else {
//                    desconto = 0.05;
//                }
//                return calcularValorVenda() * desconto;
//            }
//
//            public double calcularImposto() {
//                return calcularValorVenda() * 0.20;
//            }
//
//            public double calcularTotalAPagar() {
//                return calcularValorVenda() - calcularDesconto() + calcularImposto();
//            }
//
//            public void exibirRecibo() {
//                System.out.println("Recibo:");
//                System.out.println("Nome do Produto: " + nome);
//                System.out.println("Quantidade Adquirida: " + quantidade);
//                System.out.println("Preço Unitário: " + precoUnitario);
//                System.out.println("Valor da Venda: " + calcularValorVenda());
//                System.out.println("Desconto: " + calcularDesconto());
//                System.out.println("Imposto: " + calcularImposto());
//                System.out.println("Total a Pagar: " + calcularTotalAPagar());


        //ex21

        //ex23

//        for (int i = 1; i <= 20 ; i++) {
//            System.out.print("("+i+", ");
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(j);
//                if (j == 10){
//                    System.out.print(")");
//                    System.out.println();
//                }
//            }
//        }

        //ex24

//            public static void main(String[] args) {
//                Scanner scanner = new Scanner(System.in);
//                System.out.println("Informe quantas horas você trabalhou esse mês");
//                int horasTrabalhadas = scanner.nextInt();
//                System.out.println("Informe seu salário por hora");
//                double salarioHora = scanner.nextDouble();
//                if (horasTrabalhadas < 160) {
//                    throw new RuntimeException("Um trabalhador não pode ter menos que 160 horas por mês");
//                }
//                int horasNormais = 160;
//                int horasExtras = horasTrabalhadas - horasNormais;
//                double salarioHoraExtra = salarioHora * 1.5;
//                double valorHorasExtras = horasExtras * salarioHoraExtra;
//                double salarioTotal = (horasNormais * salarioHora) + valorHorasExtras;
//                System.out.println("Seu salário deve ser de " + salarioTotal);
            }

        //ex 25

//                    Scanner scanner = new Scanner(System.in);
//                    String[] array = new String[12];
//                    System.out.println("Informe doze elementos (letras ou números):");
//                    for (int i = 0; i < 12; i++) {
//                        array[i] = scanner.next();
//                    }
//                    // Saída 1: Inversão simples
//                    String[] invertidoSimples = new String[12];
//                    for (int i = 0; i < 12; i++) {
//                        invertidoSimples[i] = array[11 - i];
//                    }
//                    System.out.println("Saída 1: Inversão simples");
//                    for (String elemento : invertidoSimples) {
//                        System.out.print(elemento + " ");
//                    }
//                    System.out.println();
//                    String[] numeros = new String[12];
//                    String[] letras = new String[12];
//                    int numCount = 0;
//                    int letraCount = 0;
//                    for (String elemento : array) {
//                        if (Character.isDigit(elemento.charAt(0))) {
//                            numeros[numCount++] = elemento;
//                        } else {
//                            letras[letraCount++] = elemento;
//                        }
//                    }
//                    String[] numerosInvertidos = new String[numCount];
//                    for (int i = 0; i < numCount; i++) {
//                        numerosInvertidos[i] = numeros[numCount - 1 - i];
//                    }
//                    String[] letrasInvertidas = new String[letraCount];
//                    for (int i = 0; i < letraCount; i++) {
//                        letrasInvertidas[i] = letras[letraCount - 1 - i];
//                    }
//                    System.out.println("Saída 2: Inversão separada por tipo");
//                    for (String numero : numerosInvertidos) {
//                        System.out.print(numero + " ");
//                    }
//                    System.out.print(" - ");
//                    for (String letra : letrasInvertidas) {
//                        System.out.print(letra + " ");
//                    }
//                    System.out.println();
//                }