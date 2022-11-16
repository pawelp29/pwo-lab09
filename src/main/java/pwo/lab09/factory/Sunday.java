/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author pawelp
 */
public class Sunday implements MessageFactory {
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "Czas na trochę odpoczynku";
    }

    @Override
    public String createClosingMessage() {
        return "Niedziela dobiega końca";
    }
}
