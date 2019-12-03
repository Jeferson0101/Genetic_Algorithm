import br.edu.ifsc.models.Chromosome;
import br.edu.ifsc.models.Data;
import br.edu.ifsc.models.Lessons;
import br.edu.ifsc.models.Reader;
import br.edu.ifsc.models.Separator;
import br.edu.ifsc.models.Subjects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jeferson
 */
public class Main {

    public static void main(String[] args) {
        Reader reader = new Reader();
        Data data = reader.init();
        ArrayList<String> abv = new ArrayList<>();
        ArrayList<String> newList = new ArrayList<>();
        
        Separator sep = new Separator(data);
        sep.putLessonsInEachClass();
        sep.separate("GCC");
        sep.repeatedSubjects();
        //sep.separate("GCC");
        
        
//        for (int i = 0; i < data.getClasses().size(); i++) {
//            if(i == 0){
//                newList.add(data.getClasses().get(i).getAbbreviation());
//                //abv.add(data.getClasses().get(i).getAbbreviation());
//            }
//            
//            if(newList.contains(data.getClasses().get(i).getAbbreviation())){
//                //System.out.println("Abv: "+ data.getClasses().get(i).getAbbreviation());
//            }else{
//                newList.add(data.getClasses().get(i).getAbbreviation());
//            }    
//        }
        
//        for (String newList1 : newList) {
//            
//            System.out.println(newList1);
//        }
        
        

    }
    

}
