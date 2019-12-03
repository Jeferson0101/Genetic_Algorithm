/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifsc.models;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Jeferson
 */
public class Reader {
    public Data init(){
        System.out.println("Reader..");
        Data data = null;
        
      try {
            String basePath = new File("").getAbsolutePath();
            String s = File.separator;
            data = Data.convertJsonInputToFrontObject(basePath + String.format("%ssrc%smain%sjava%sbr%sedu%sifsc%smodels%sdados.json",s,s,s,s,s,s,s,s));
            //front_ = front.getFront();
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Erro classe Reader");    
        }
        return data;
//        ArrayList <Lessons> c;
//        c = data.getLessons();
//        System.out.println("tamanho" + c.size());
//        for (int i = 0; i < c.size(); i++) {
//            System.out.println(c.get(i).getId());
//        }
    }
}
