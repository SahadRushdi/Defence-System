/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package defence.system;

/**
 *
 * @author USER
 */
public interface Observer {
    String updateArea(String situation);
    void sendStrength(int strength);
    void update(String name, String text);
}
