/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demoframe1;

/**
 *
 * @author minhphuong16px
 */
public class Word {
    private String target;
    
    private String explain;
    public Word(String target, String explain) {
        super();
        this.target = target;
        this.explain = explain;
    }
    public Word(){
        
    }
    
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }
}
