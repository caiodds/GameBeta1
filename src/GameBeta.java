import java.util.Scanner;

public class GameBeta {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo ao Game Beta");
        System.out.println("Digite seu nome aqui para se registrar");
        String nome = scanner.next();
        System.out.println("Escolha seu personagem aqui abaixo");
        System.out.println("(1) Red Dragon (Poder de 100 e 200 de vida)");
        System.out.println("(2) Blue Dragon (Poder de 150 e 250 de vida)");
        System.out.println("(3) Pink Dragon (Poder de 200 e 320 de vida)");
        Integer escolhaPersonagem = scanner.nextInt();

        if (escolhaPersonagem == 3){
            System.out.println("voce escolheu o Pink Dragon");
            System.out.println("Deseja partir para primeira missao? digite 1");
        }

        if (escolhaPersonagem == 2){
            System.out.println("Voce escolheu o Blue Dragon");
            System.out.println("se voce deseja ir para missao digite 1");
            Integer missao2 = scanner.nextInt();
        }

        if (escolhaPersonagem == 1){
            System.out.println("Parabens voce escolheu o Red Dragon");
            System.out.println("Se voce deseja partir para primeira missao digite 1");
            Integer missao = scanner.nextInt();

            if(missao == 1){
                System.out.println("Seja bem vindo a missão voce irar enfrentar o Tower Dragon com 150 de poder e 100 de vida Boa sorte!");
                System.out.println("Oque deseja atacar nele escolha abaixo o poder");
                System.out.println("(1) Bola de Fogo 35 de dano");
                System.out.println("(2) Bola de fogo extrema 67 de dano");
                Integer poder = scanner.nextInt();

                if (poder == 2){
                    System.out.println("Voce Acerteu ele deixando com 83 de vida");
                    System.out.println("Agora ele ira te atacar agora aguarde");
                    Thread.sleep(1000);
                    Thread.sleep(1000);
                    System.out.println("Ele errou o ataque que sorte em!");
                    System.out.println("Agora é sua vez de atacar");
                    System.out.println("(1) Bola de Fogo 35 de dano");
                    System.out.println("(2) Bola de fogo extrema 67 de dano");
                    Integer ataque = scanner.nextInt();
                }

                if (poder == 1){
                    System.out.println("Voce acertou ele deixando com 115 de vida Agora será á vez dele de atacar voce aguarde");
                    Thread.sleep(1000);
                    Thread.sleep(1000);
                    System.out.println("Ele lhe acerteu dando 25 de dano e te deixando com 175 de vida");
                    System.out.println("Acerte ele de volta!");
                    System.out.println("(1) Bola de Fogo 35 de dano");
                    System.out.println("(2) Bola de fogo extrema 67 de dano");
                    Integer poder2 = scanner.nextInt();

                    if (poder2 == 1){
                        System.out.println("Esse poder esta carreando agora é a vez do oponente aguarde");
                        Thread.sleep(1000);
                        Thread.sleep(1000);
                        System.out.println("Ele errou que sorte em amigo!");
                        System.out.println("Agora é sua vez!");
                        System.out.println("(1) Bola de Fogo 35 de dano");
                        System.out.println("(2) Bola de fogo extrema 67 de dano");
                        Integer poder3 = scanner.nextInt();

                        if (poder3 == 2){
                            System.out.println("Voce acertou ele deixando o inimigo com 48 de vida esta quase perto de vence-lo Agora é a vez dele");
                            Thread.sleep(1000);
                            Thread.sleep(1000);
                            System.out.println("Ele errou o atque que sorte!!");
                            System.out.println("Agora é a sua vez Boa Sorte!");
                            System.out.println("(1) Bola de Fogo 35 de dano");
                            System.out.println("(2) Bola de fogo extrema 67 de dano");
                            Integer poder4 = scanner.nextInt();
                            if (poder4 == 1){
                                System.out.println("Voce Acertou o ataque deixando o inimigo com 13 de vida agr é á vez dele aguarde");
                                Thread.sleep(1000);
                                Thread.sleep(1000);
                                System.out.println("Ele acertou o atque de 45 de dano lhe deixando com 130 de vida!");
                            }
                        }

                        if (poder3 == 1){
                            System.out.println("Voce errou o ataque que azar! agora será á vez dele");
                            Thread.sleep(1000);
                            Thread.sleep(1000);
                            System.out.println("Ele lhe acerteu com 34 de dano lhe deixando com 141 de vida ");
                            System.out.println("Agora é seua vez de atacar!");
                        }

                    }
                }
            }
        }
    }
}