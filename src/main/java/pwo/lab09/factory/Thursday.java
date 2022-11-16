/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author pawelp
 */
public class Thursday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Czwartek.";
    }

    @Override
    public String createMainMessage() {
        return "Czwartkowa praca idzie najlepiej";
    }

    @Override
    public String createClosingMessage() {
        return "Czwarty dzień pracy w tym tygodniu minął";
    }
}
