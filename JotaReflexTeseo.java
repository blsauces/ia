/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package unalcol.agents.examples.labyrinth.teseo.jotajota;import unalcol.agents.examples.labyrinth.teseo.simple.SimpleTeseoAgentProgram;


import unalcol.agents.examples.labyrinth.teseo.simple.SimpleTeseoAgentProgram;

/**
 *
 * @author AntonioJose
 */
public class JotaReflexTeseo extends SimpleTeseoAgentProgram {
    //por el momento va a tener el mismo codigo del random hasta que se empieze a trabajar el algoritmo
    
    public JotaReflexTeseo() {}
    @Override
    public int accion(boolean PF, boolean PD, boolean PA, boolean PI, boolean MT) {
        if (MT) return -1;
        boolean flag = true;
        int k=0;
        while( flag ){
            k = (int)(Math.random()*4);
            switch(k){
                case 0:
                    flag = PF;
                    break;
                case 1:
                    flag = PD;
                    break;
                case 2:
                    flag = PA;
                    break;
                default:
                    flag = PI;
                    break;                    
            }
        }
        return k;
    }    
}
