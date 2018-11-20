/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tree;

/**
 *
 * @author Mohammed El-Agha
 */
public class Main {
    public static void main(String[] args) {
        Node<String> root = new Node("root");
        
        Node<String> rootLC = new Node("rootLC");
        Node<String> rootRC = new Node("rootRC");
        
        root.addChild(rootLC);
//        root.addChild(rootRC);
        
//        rootLC.addParent(root);
        rootRC.addParent(root);
        
        System.out.println(root.getChildren().size() + "");
    }
}
