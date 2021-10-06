package comp.comp152;

import java.util.Random;

public class GovernmentProgram {
    private String programType;

    public GovernmentProgram(){
        String[] type = {"Medicare", "Medicaid", "VA", "ObamaCare", "CongressCare"};

        var numberPick = new Random();
        var pick = numberPick.nextInt(5);
        programType = type[pick];
    }

    public void payBill (double bill){
        if(programType.equals("CongressCare"))
            System.out.println(programType + " just paid a bill of "+ bill*3);
        else
            System.out.println(programType + " just paid a bill of "+ bill);
    }
}
