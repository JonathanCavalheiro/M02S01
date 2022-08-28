import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musica {
    String artista;
    String titulo;
    boolean emExecucao;
   static Scanner input = new Scanner(System.in);
    static List<Musica> musicas = new ArrayList<>();
    static int selectedOption;
    static Musica musica = new Musica();


    public static void main(String[] args) {



        showMenu();
        while (!(selectedOption == 3)) {
            showMenu2(selectedOption);
            showMenu();
        }
        System.out.println("Operacao finalizada");
    }

        private static void showMenu() {
            System.out.println("Seleciona uma das opcoes abaixo: \n1-Cadastrar Musica\n2- Executar/Parar" +
                    "\n3-Sair");
            selectedOption = input.nextInt();
        }
        private static void showMenu2(int selectedOption){
            String seletedOption2 = "";
            switch (selectedOption) {
                case 1:
                    System.out.println("Informe o nome do artista:");
                    musica.artista = input.next();
                    System.out.println("Informe o titulo da1 musica:");
                    musica.titulo = input.next();
                    System.out.println("Se a música estiver em execucão responda com true, caso não " +
                            "estiver responda false.");
                    musica.emExecucao = input.nextBoolean();
                    musicas.add(musica);
                    break;
                case 2:
                    System.out.println("Informe o nome da musica para ver se ela esta em execucao");
                    seletedOption2 = input.next();
                    for (Musica musica : musicas) {
                        if (musica.titulo.equals(seletedOption2)) {
                            if (musica.emExecucao) {
                                musica.emExecucao = false;
                                System.out.println("A musica " + musica.titulo + " Esta em execucao");
                            } else {
                                System.out.println("A musica " + musica.titulo + " Nao esta em execucao");

                            }
                        }
                    }
            }


        }

    }


