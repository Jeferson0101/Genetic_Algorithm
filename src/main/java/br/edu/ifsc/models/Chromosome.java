/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.models;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jeferson
 */
public class Chromosome {

    // 40x20
    int classes[][] = new int[4][20];
    int evaluation = 0;
    Data data;
    // função de avaliação

    public Chromosome(Data data) {
        this.data = data;
    }

    public void evaluation() {
        for (int i = 0; i < 4; i++) {

            switch (i) {
                case 0:
                    // Ciência da Computação 2° fase
                    int id;
                    for (int j = 0; j < 20; j++) {
                        id = classes[i][j];
                        //for(int k =0; k< data.getLessons())
                    }

                    break;
                case 1:
                    // Ciência da Computação 4° fase
                    break;
                case 2:
                    // Ciência da Computação 6° fase
                    break;
                case 3:
                    // Ciência da Computação 8° fase
                    break;

                default:
                    System.out.println("Algo de errado no Switch!");
            }
        }
    }

    // escolha por elitismo
    public void elitism() {

    }

    // Escolha por roleta
    public void roulette() {

    }

    public int[][] getClasses() {
        return classes;
    }

    public void setClasses(int[][] classes) {
        this.classes = classes;
    }

    //generates the percentage between 0 and 100% 
    public int genPercentage() {
        Random rand = new Random();
        return rand.nextInt(101);
    }

    // função que pega valores aleatórios com reetições da lista de id's de disciplinas.
    public void setRandom(ArrayList<Subjects> repeteads, ArrayList<Subjects> noRepeteads) {
        // se uma materia tem x periodos por semana, ela é adicionada X vezes neste array e assim por diante
        // usada para garantir que o cromossomo tenha a quantidade certa de uma disciplina
        ArrayList<Integer> all = new ArrayList<>();
        int randomIndex;
        int randomElement;
        Random rand = new Random();
        //List<String> givenList = Arrays.asList("one", "two", "three", "four");
        System.out.println("SIZE 2 = "+noRepeteads.size());
        int numberOfElements = 20;
        // fazer verificação tipo: se for 0 até <4 -> CC se for de 4 até <8 outro curso aí atribui os id's nas posições
        //classes[i][j]
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < noRepeteads.size(); j++) {
                randomIndex = rand.nextInt(noRepeteads.size());
                //verificar segundo as lessons, quantos periods per week a disciplina tem e adicionar ela este
                // numero de vezes no cromossomo(matriz) "classes"

                randomElement = noRepeteads.get(randomIndex).getId();
                noRepeteads.remove(randomIndex);
                
                
                for (int k = 0; k < data.getLessons().size(); k++) {
                    if (data.getLessons().get(k).getSubjectId() == randomElement) {
                        for (int l = 0; l < data.getLessons().get(k).getPeriodsPerWeek(); l++) {
                            all.add(randomElement);
                            
                        }
                    }
                }
                //givenList.remove(randomIndex); // usar caso queira sem repetições ou pelo menos garantir que 
                // um de cada matéria está na matriz

            }

        }
//        for (Integer all1 : all) {
//            System.out.println(all1);
//        }
        for (int m = 0; m < 4; m++) {

            for (int n = 0; n < noRepeteads.size(); n++) {
                try {
                    classes[m][n] = all.get(m * 20 + n); // m*20 + n garante a sequencia do index 0 -> X
                    
                    System.out.println(classes[m][n]);
                } catch (Exception e) {
                    System.out.println(e);
                }
                

            }
            System.out.println("\n");

        }

    }

}
