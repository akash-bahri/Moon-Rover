/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myMoonRover;

/**
 *
 * @author Akash Bahri
 */
public class Context {
    private State state;
    private String substate;

    public Context() {
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void setSubstate(String substate) {
        this.substate = substate;
    }
    
    public String getSubstate() {
        return substate;
    }
}
