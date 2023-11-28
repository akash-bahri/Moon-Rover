/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myMoonRover;

/**
 *
 * @author Akash Bahri
 */
public interface State {
     public String current = "";
     public String substate = "";

     public String leftPedalOnce(Context context, Boolean Max);
     public String leftPedalThreeSec(Context context, Boolean Max);
     public String rightPedalOnce(Context context, Boolean Max);
     public String rightPedalThreeSec(Context context);

}
