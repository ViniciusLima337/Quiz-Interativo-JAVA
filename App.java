import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    static Scanner input = new Scanner(System.in);
    static int pontucao = 0;
    static int erro = 0;

   public static void main(String[] args) throws Exception {
        menu(0);
    }

    public static int menu (int menu){
        
        System.out.println(" --- Bem vindo! --- ");
        System.out.println("[1] - Jogar ");
        System.out.println("[2] - Instruções ");
        System.out.println("[3] - Créditos");
        System.out.println("[4] - Sair ");

        Scanner input = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("Escolha uma opção: ");
            opcao = input.nextInt();
            switch (opcao){
                case 1:
                    jogar(opcao);
                    break;
                case 2:
                    instrucoes(opcao);
                    break;
                case 3:
                    creditos(opcao);
                    break;
                case 4:
                    sair();
                    break;
                default:
                    System.out.println("Opção invalida!\n ");
            }
        }while (opcao != 4);
        input.close();
        return menu;
    }

    public static int jogar (int jogar){

            questao1();
            questao2();
            questao3();
            questao4();
            questao5();
            questao6();
            questao7();
            questao8();
            questao9();
            questao10();


            return jogar;
    }

    public static void questao1(){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Itália"); //Alternativa Correta
        alternativas.add("Espanha");
        alternativas.add("França");
        alternativas.add("Japão");
        alternativas.add("México");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual destes países é famoso por ter uma cena gastronômica incrível?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Itália")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta.\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Itália")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Itália")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Itália")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Itália")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n\n");
                }
            
            }while (erro < 2 && !acertou); 
    }

    public static void questao2(){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Camberra"); //Alternativa Correta
        alternativas.add("Sidney");
        alternativas.add("Melbourne");
        alternativas.add("Brisbane");
        alternativas.add("Perth");
        char resposta;
        
        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual é a capital da Austrália?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            resposta = input.next().charAt(0);
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case 'a':
                case 'A':
                    if(alternativas.get(0).equals("Camberra")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case 'b':
                case 'B':
                    if(alternativas.get(1).equals("Camberra")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case 'c':
                    case 'C':
                        if(alternativas.get(2).equals("Camberra")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case 'd':
                    case 'D':
                        if(alternativas.get(3).equals("Camberra")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case 'e':
                    case 'E':
                        if(alternativas.get(4).equals("Camberra")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n\n");
                }
            
            }while (erro < 2 && !acertou);  
    }

    public static void questao3 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Alemanha"); //Alternativa Correta
        alternativas.add("Itália");
        alternativas.add("França");
        alternativas.add("Espanha");
        alternativas.add("Rússia");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual destes países é conhecido por ter uma cultura rica em contos de fadas?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Alemanha")){
                        System.out.println("Resposta Correta!\n\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta.\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Alemanha")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Alemanha")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Alemanha")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Alemanha")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }

    public static void questao4 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();//Ao utilizar ArrayList lembre-se de "Estipular" o tipo do array, String, int, double etc... 
         
        alternativas.add("Brasil"); //Alternativa Correta
        alternativas.add("Argentina");
        alternativas.add("Colômbia");
        alternativas.add("Peru");
        alternativas.add("Chile");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual é o maior país da América do Sul em termos de área territorial?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Brasil")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Brasil")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Brasil")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Brasil")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Brasil")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }
 
    public static void questao5 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Japão"); //Alternativa Correta
        alternativas.add("Alemanha");
        alternativas.add("França");
        alternativas.add("Reino Unido");
        alternativas.add("Estados Unidos");

        do{

            Collections.shuffle(alternativas);

            System.out.println("QUal destes países tem umfamoso sistema de transporte público com trens de alta velocidade?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Japão")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Japão")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Japão")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Japão")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Japão")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }

    public static void questao6 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Dólar Canadense"); //Alternativa Correta
        alternativas.add("Euro");
        alternativas.add("Dólar Americano");
        alternativas.add("Libra Estrelina");
        alternativas.add("Iene Japonês");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual é a moeda oficial do Canadá?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Dólar Canadense")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Dólar Canadense")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Dólar Canadense")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Dólar Canadense")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Dólar Canadense")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }

    public static void questao7 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Brasil"); //Alternativa Correta
        alternativas.add("Canadá");
        alternativas.add("Austrália");
        alternativas.add("África do Sul");
        alternativas.add("Rússia");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual destes países é conhecido por suas florestas tropicais e sua grande biodiversidade?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Brasil")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Brasil")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Brasil")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Brasil")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Brasil")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }

    public static void questao8 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Wellington"); //Alternativa Correta
        alternativas.add("Auckland");
        alternativas.add("Christchurch");
        alternativas.add("Queenstown");
        alternativas.add("Hamilton");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual é a capital da Nova Zelândia?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Wellington")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Wellington")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Wellington")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Wellington")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Wellington")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }

    public static void questao9 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("Itália"); //Alternativa Correta
        alternativas.add("França");
        alternativas.add("Espanha");
        alternativas.add("Holanda");
        alternativas.add("Alemanha");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual destes países é conhecido por seus canais e gôndolas?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("Itália")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("Itália")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("Itália")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("Itália")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("Itália")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);
    }

    public static void questao10 (){
        boolean acertou = false;
        
        List<String> alternativas = new ArrayList<String>();
        
        alternativas.add("China"); //Alternativa Correta
        alternativas.add("Estados Unidos");
        alternativas.add("Índia");
        alternativas.add("Itália");
        alternativas.add("Nigeria");

        do{

            Collections.shuffle(alternativas);

            System.out.println("Qual é o país mais populoso do mundo?\n");
            System.out.println("[A] " + alternativas.get(0));
            System.out.println("[B] " + alternativas.get(1));
            System.out.println("[C] " + alternativas.get(2));
            System.out.println("[D] " + alternativas.get(3));
            System.out.println("[E] " + alternativas.get(4));

            System.out.println("Escolha uma alternativa: \n");
            String resposta = input.nextLine();
            System.out.println("Voce escolheu a resposta \n" + resposta);

            switch(resposta){
                case "a":
                case "A":
                    if(alternativas.get(0).equals("China")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;
                
                case "b":
                case "B":
                    if(alternativas.get(1).equals("China")){
                        System.out.println("Resposta Correta!\n");
                        acertou = true;
                        pontucao++;
                    } else {
                        System.out.println("Resposta Incorreta!\n");
                        erro++;
                    }
                    break;

                    case "c":
                    case "C":
                        if(alternativas.get(2).equals("China")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else { 
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "d":
                    case "D":
                        if(alternativas.get(3).equals("China")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    case "e":
                    case "E":
                        if(alternativas.get(4).equals("China")){
                            System.out.println("Resposta Correta!\n");
                            acertou = true;
                            pontucao++;
                        } else {
                            System.out.println("Resposta Incorreta!\n");
                            erro++;
                        }
                        break;

                    default: 
                        System.out.println("Escolha invalida!\n");
                }
            
            }while (erro < 2 && !acertou);

            System.out.println("Sua pontuação foi de: " + pontucao);
            System.out.println("Você errou: " + erro);
            System.out.println("\nParabens você chegou ao fim do jogo...\n\n O que quer Fazer agora?");
            System.out.println("[1] - Jogar ");
            System.out.println("[2] - Instruções ");
            System.out.println("[3] - Créditos");
            System.out.println("[4] - Sair ");
    }

    public static int instrucoes(int instrucoes){
        System.out.println("\n ---- Instruções ----\n");
        System.out.println("Olá bem vindo ao Quiz interativo!\n ");
        System.out.println("Para jogar utilize as letras de A a E para efetuar sua escolha de alternativa...\n");
        System.out.println("O jogo se resume a 10 quesões com o tema: Paises.\n ");
        System.out.println(" !!! Fique atento !!!\n ");
        System.out.println("Voce só tem 1 tentativa a cada questão! Boa Sorte!\n\n ");
        System.out.println("[1] - Jogar ");
        System.out.println("[2] - Instruções ");
        System.out.println("[3] - Créditos");
        System.out.println("[4] - Sair ");
        return instrucoes;
    }

    public static int creditos(int creditos){
        System.out.println("\n ---- Créditos ---- \n");
        System.out.println("Vinicius Lima, TADS - SENAC São Paulo ");
        System.out.println("2023 All Rights Reserved.\n\n");
        System.out.println("[1] - Jogar ");
        System.out.println("[2] - Instruções ");
        System.out.println("[3] - Créditos");
        System.out.println("[4] - Sair ");
        return creditos;
    }

    public static void sair(){
        System.out.println("Obrigado por jogar!");
    }

}