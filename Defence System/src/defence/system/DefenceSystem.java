/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package defence.system;

/**
 *
 * @author USER
 */
public class DefenceSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Observable observable = Observable.getInstance();
        
        MainController mainController = new MainController();
        Helicopter helicopter = new Helicopter();
        Submarine submarine = new Submarine();
        Tank tank = new Tank();
        
        mainController.setVisible(true);
        helicopter.setVisible(true);
        submarine.setVisible(true);
        tank.setVisible(true);
        
        observable.addComponent(mainController);
        observable.addComponent(helicopter);
        observable.addComponent(submarine);
        observable.addComponent(tank);
        
    }
    
}
