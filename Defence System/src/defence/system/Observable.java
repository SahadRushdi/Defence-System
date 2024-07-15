/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author USER
 */
public class Observable {
    private Observer[] ob = new Observer[0];

    private static Observable instance = null;

    private String name;
    private String massage;

    private Observable() {}

    public void addComponent(Observer component) {
        System.out.println("add");
        extendArray();
        ob[ob.length - 1] = component;
    }

    private void extendArray() {
        Observer[] temp = new Observer[ob.length + 1];
        for (int i = 0; i < ob.length; i++) {
            System.out.println(i);
            temp[i] = ob[i];
        }
        ob = temp;
    }

    public static Observable getInstance(){
        if (instance == null) {
            instance = new Observable();
        }
        return instance;
    }

    public void getMassage(String name, String massage) {
        this.name = name;
        this.massage = massage;
        System.out.println("Controller > " + name + ": " + massage);
        notifyMassage();
    }

    public void notifyMassage() {
        for (int i = 0; i < ob.length; i++) {
            System.out.println(i);
            ob[i].update(this.name, this.massage);
        }
    }
}
