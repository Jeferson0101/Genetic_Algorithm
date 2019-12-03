/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.models;

import java.util.ArrayList;

/**
 *
 * @author Jeferson
 */
public class Separator {

    Data data;
    Chromosome chromosome;

    // variável guarda disciplinas não repetidas só para comparar
    ArrayList<String> noRepeteads = new ArrayList<>();
    // variável guarda disciplinas não repetidas
    ArrayList<Subjects> noRepeteads2 = new ArrayList<>();

    // variável guarda disciplinas repetidas
    ArrayList<Subjects> repeteads = new ArrayList<>();

    public Separator(Data data) {
        this.data = data;
        this.chromosome = new Chromosome(data);
    }

    // array to store subject's id
    ArrayList<Subjects> subjects = new ArrayList<>();

    public void putLessonsInEachClass() {

        for (int i = 0; i < data.getLessons().size(); i++) {
            for (int j = 0; j < data.getClasses().size(); j++) {
                if (data.getClasses().get(j).getId() == data.getLessons().get(i).getClassId()) {
                    data.getClasses().get(j).getLessons().add(data.getLessons().get(i));
                }
            }

        }
// Mostra todas turmas e suas respectivas aulas
//        for (int i = 0; i < data.getClasses().size(); i++) {
//            System.out.println(i);
//            System.out.println("Nome do Curso:"  + data.getClasses().get(i).getName());
//            System.out.println("Lessons:");
//            for (Lessons lesson : data.getClasses().get(i).getLessons()) {
//
//                System.out.println(lesson.getId());
//
//            }
//
//        }

    }

    public void separate(String c) {

        int ids, subjectID;

        System.out.println("iniciando..");

        //Pegando todos id's das Disciplinas de uma curso específico
        for (int i = 0; i < data.getClasses().size(); i++) {
            if (data.getClasses().get(i).getAbbreviation().contains(c)) { // retirar depois

                ids = data.getClasses().get(i).getId();
                System.out.println(ids);
                for (int j = 0; j < data.getLessons().size(); j++) {
                    if (data.getLessons().get(j).getClassId() == ids) {
                        subjectID = data.getLessons().get(j).getSubjectId();
                        for (int k = 0; k < data.getSubjects().size(); k++) {
                            if (data.getSubjects().get(k).getId() == subjectID) {
                                subjects.add(data.getSubjects().get(k)); // vai adicionando as disciplinas no arrayList

                            }
                        }
                    }
                }

                //System.out.println(data.getClasses().get(i).getName());
            }

        }
        //System.out.println("Subjects Size = "+subjects.size());
        //chromosome.setRandom(subjects, c);
    }

    public void repeatedSubjects() {
        
        for (int i = 0; i < subjects.size(); i++) {

            if (noRepeteads.contains(subjects.get(i).getName())) {
                repeteads.add(subjects.get(i));
                System.out.println(subjects.get(i).getName());
            } else {
                noRepeteads2.add(subjects.get(i));
            }

        }

//        for (int i = 0; i < data.getSubjects().size(); i++) {
//
//            if (noRepeteads.contains(data.getSubjects().get(i).getName())) {
//                repeteads.add(data.getSubjects().get(i));
//                System.out.println(data.getSubjects().get(i).getName());
//            } else {
//                noRepeteads2.add(data.getSubjects().get(i));
//            }
//
//        }
        System.out.println("SIZE 1 =" + noRepeteads2.size());
        chromosome.setRandom(repeteads, noRepeteads2);

    }

}
