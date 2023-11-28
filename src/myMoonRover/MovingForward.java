/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myMoonRover;

/**
 *
 * @author Akash Bahri
 */
public class MovingForward implements State {
    public MovingForward() {
    
    }

    @Override
    public String leftPedalOnce(Context context, Boolean Max){
        if(Max==true && context.getSubstate()=="Accelerate Forward"){
            context.setSubstate("Maximum Forward Speed");
            return "Maximum Forward Speed";
        }
        else if(context.getSubstate() == "Constant Forward Speed"||context.getSubstate()=="Accelerate Forward") {
            context.setSubstate("Accelerate Forward");
            return "Accelerate Forward";
        }
        else if(context.getSubstate() == "Maximum Forward Speed") {
            return "Maximum Forward Speed";  
        }
        else return "Unknown Substate";
    };
    @Override
    public String leftPedalThreeSec(Context context, Boolean Max){
        return null;
    };
    @Override
    public String rightPedalOnce(Context context, Boolean Max){
        if(Max==true){
         context.setSubstate("At Rest");  
         context.setState(new AtRest()); 
         return "At Rest";
        }
        context.setSubstate("DeAccelerate Forward");
        return "DeAccelerate Forward";
    };
    @Override
    public String rightPedalThreeSec(Context context){
        if(context.getSubstate()=="Accelerate Forward")
        context.setSubstate("Constant Forward Speed");
        return "Constant Forward Speed";
    };
    };    

