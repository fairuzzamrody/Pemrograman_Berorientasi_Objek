/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import View.ViewConsole;

/**
 *
 * @author Fairuz Zamrody (19051397056)
 */
public class Driver2 {
    public static void main(String[] args){
        Application app = new Application();
        ViewConsole view = new ViewConsole(app);
        view.MainMenu();
    }
}