/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoframe1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author minhphuong16px
 */
public class Dictionary {
    ArrayList<Word> listWord= new ArrayList();
    public ArrayList<Word> listFind = new ArrayList();
    //public Dictionary dc= new Dictionary();
    public void listWord(Word w){
        listWord.add(w);
    }
    
    public void insertFromFile(){
         try{
             File f= new File("dictionaries.txt");
             FileReader fr= new FileReader(f);
             BufferedReader br= new BufferedReader(fr);
             String line;
             while((line= br.readLine())!= null){
                String[] Lineword;
                Lineword = line.split("\\s",2);
                //dictionary.word.add(new Word(Lineword[0], Lineword[1]));
                String target = Lineword[0];
                String explain = Lineword[1];
                Word w = new Word(target, explain);
                listWord(w);
                
             }
         }
        catch(IOException e){
             System.out.println("Loi doc file"+e);
         }
     }
    public String lookUp(String lookup){
        //System.out.println("Nhap tu can tim: ");
         
         
         for(int i=0; i<listWord.size(); i++){
             if(lookup.equals(listWord.get(i).getTarget())){
                 return listWord.get(i).getExplain();
             }
             else {
                 
             }
            
         }
         return "NOT FIND";
         
    }
    
    public void dictionarySearcher(String word){
        listFind.clear();
        for(int i=0; i<listWord.size(); i++){
            if(listWord.get(i).getTarget().startsWith(word)){
                listFind.add(new Word(listWord.get(i).getTarget(), listWord.get(i).getExplain()));
                //System.out.println(listWord.get(i).getTarget()+" " +listWord.get(i).getExplain());
                
                
            }
        }
    }
    
    public void dictionaryExportToFile(){
    try {
        FileWriter fr= new FileWriter("dictionaries.txt");
        try (BufferedWriter bw = new BufferedWriter(fr)) {
            for(int i=0; i<listWord.size(); i++){
                String data= listWord.get(i).getTarget()+" "+listWord.get(i).getExplain();
                bw.write(data);
                bw.write("\n");
            }
        }
    }
    catch (IOException e){
        System.out.println("Error");
    }
    
}
     
    
}
