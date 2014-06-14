/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dpm.Modules.Pass.Modelo.Clases;

import java.awt.Toolkit;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;

/**
 *
 * @author xavi
 */
public class Portador {
    
    private String PassString;
    
    public Portador( String PassString) {
        
        this.PassString = PassString;
    }

    public Portador( ) {}
    
    public String getPassString() {
        return PassString;
    }

    public void setPassString(String PassString) {
        this.PassString = PassString;
    }
    
    public void setPortador(){
        StringSelection stringSelection = new StringSelection(this.getPassString());
        java.awt.datatransfer.Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, (ClipboardOwner) clipboard);
    }
    
    @Override
    public String toString() {
        return "Clipboard{" + "PassString=" + PassString+ '}';
    }
}
