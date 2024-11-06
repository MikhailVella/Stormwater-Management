import javax.swing.*;
import java.awt.*;
import java.text.DecimalFormat; 
public class StormwaterManagement
{
    public static int storm;
    public static double totalCost=0;
    public static double totalACost=0;
    public static double totalRain=0;
    public static double totalRunOff=0;
    public static boolean cisPass=false;
    public static boolean gRoofPass=false;
    public static boolean rGardenPass=false;
    public static boolean swalePass=false;
    public static boolean pPermPass=false;
    public static boolean paPermPass=false;
    public static boolean sPermPass=false;
    public static boolean dPermPass=false;
    public static boolean stPermPass=false;
    public static boolean treePass=false;
    public static boolean flowerPass=false;
    public static boolean vStripPass=false;
    public static boolean nativeVPass=false;
    public static boolean permPass=false;
    private static final DecimalFormat decfor = new DecimalFormat("0.00");
    public static double fRArea=0;
    public static double sWArea=0;
    public static double pPDeArea=0;
    public static double pSArea=0;
    public static double dArea=0;
    public static double sArea=0;
    public static double rainGArea=0;
    public static double mTArea=0;
    public static double vGArea;
    public static double vFSArea=0;
    public static double nVArea=0;
    public static void main (String args[])
    {
        UIManager.put("OptionPane.minimumSize",new Dimension(400,150));
        JOptionPane.showMessageDialog(null,"                            GREEN STORMWATER MANAGEMENT"+"\n"+
            "                                     CALCULATOR FOR MALTA"+"\n"+
            "The calculator allows you to examine how the Best Management Practices,"+"\n"+
            "you implement on the land, address rainfall capture and estimate runoff"+"\n"+
            "from the scenario given the rainfall expected over a period of one year");
        double tArea;
        do{
            String in=JOptionPane.showInputDialog(null,"Input total area of land(m\u00B2): ");
            if (in == null) {
                System.exit(0);
            }
            tArea=Double.parseDouble(in);
            if(tArea<=0){
                JOptionPane.showMessageDialog(null,"Land Area has to Be Greater than 0!");
            }
        }while(tArea<=0);
        double remArea=tArea;
        boolean pass=true;
        int choice;
        do{
            String in=JOptionPane.showInputDialog("You are being asked to define further the land by establishing"+"\n"+
                    "the roofs and paved areas and the green landscaped areas"+"\n"+
                    "Their total must amount to the total area of land"+"\n"+
                    "1.Roofs and Paved Areas\n"+
                    "2.Green Landscape Areas\n"+
                    "Input Choice:" );
            if (in == null) {
                System.exit(0);
            }
            choice=Integer.parseInt(in);
            switch(choice){
                case 1: 
                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Flat Roofs(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        fRArea = Double.parseDouble(input);
                        if(fRArea<0||fRArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Flat Roofs exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-fRArea;
                            JOptionPane.showMessageDialog(null,"Flat Roofs Area: "+decfor.format(fRArea)+"m\u00B2     Percent of total area: "+decfor.format((fRArea/tArea)*100)+"%"+"\n"+
                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Paths(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        sWArea = Double.parseDouble(input);
                        if(sWArea<0||sWArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Paths exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-sWArea;
                            JOptionPane.showMessageDialog(null,"Paths Area: "+decfor.format(sWArea)+"m\u00B2     Percent of total area: "+decfor.format((sWArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Patios,Pool Decks,etc(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        pPDeArea = Double.parseDouble(input);

                        if(pPDeArea<0||pPDeArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Patios,Pool Decks,etc exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-pPDeArea;
                            JOptionPane.showMessageDialog(null,"Patios,Pool Decks,etc Area: "+decfor.format(pPDeArea)+"m\u00B2     Percent of total area: "+decfor.format((pPDeArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();            
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Parking Surfaces(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        pSArea = Double.parseDouble(input);

                        if(pSArea<0||pSArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Parking Surfaces exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-pSArea;
                            JOptionPane.showMessageDialog(null,"Parking Surfaces Area: "+decfor.format(pSArea)+"m\u00B2     Percent of total area: "+decfor.format((pSArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Driveways(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        dArea = Double.parseDouble(input);

                        if(dArea<0||dArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Driveways exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-dArea;
                            JOptionPane.showMessageDialog(null,"Driveways Area: "+decfor.format(dArea)+"m\u00B2     Percent of total area: "+decfor.format((dArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Streets(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        sArea = Double.parseDouble(input);

                        if(sArea<0||sArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Streets exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-sArea;
                            JOptionPane.showMessageDialog(null,"Street Area: "+decfor.format(sArea)+"m\u00B2     Percent of total area: "+decfor.format((sArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    break;
                case 2:
                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Rain Gardens(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        rainGArea = Double.parseDouble(input);
                        if(rainGArea<0||rainGArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Rain Gardens exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-rainGArea;
                            JOptionPane.showMessageDialog(null,"Rain Gardens: "+decfor.format(rainGArea)+"m\u00B2     Percent of total area: "+decfor.format((rainGArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas Occupied by Mature Trees(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        mTArea = Double.parseDouble(input);
                        if(mTArea<0||mTArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area Occupied by Mature Trees exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-mTArea;
                            JOptionPane.showMessageDialog(null,"Mature Trees: "+decfor.format(mTArea)+"m\u00B2     Percent of total area: "+decfor.format((mTArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Vegetable/Flower Gardens(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        vGArea = Double.parseDouble(input);
                        if(vGArea<0||vGArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Vegetable/Flower Gardens exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-vGArea;
                            JOptionPane.showMessageDialog(null,"Vegetable/Flower Gardens Area: "+decfor.format(vGArea)+"m\u00B2     Percent of total area: "+decfor.format((vGArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Area of Vegetation Filter Strips(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        vFSArea = Double.parseDouble(input);
                        if(vFSArea<0||vFSArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Vegetation Filter Strips exceeded total land area!, Please try again!");
                        }
                        else{
                            pass=true;
                            remArea=remArea-vFSArea;
                            JOptionPane.showMessageDialog(null,"Vegetation Filter Strips Area: "+decfor.format(vFSArea)+"m\u00B2     Percent of total area: "+decfor.format((vFSArea/tArea)*100)+"%"+"\n"+

                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                        }
                        if(remArea==0){
                            RainMenu();
                        }
                    }while(pass!=true);

                    do{
                        String input=JOptionPane.showInputDialog("Input Total Areas of Native Vegetation(m\u00B2)");
                        if (input == null) {
                            System.exit(0);
                        }
                        nVArea = Double.parseDouble(input);
                        if(nVArea<0||nVArea>remArea){
                            pass=false;
                            JOptionPane.showMessageDialog(null,"Area of Native Vegetation exceeded total land area!, Please try again!");
                        }
                        else{
                            remArea=remArea-nVArea;
                            nVArea=nVArea+remArea;
                            pass=true;
                            JOptionPane.showMessageDialog(null,"Native Vegetations Area: "+decfor.format(nVArea)+"m\u00B2     Percent of total area: "+decfor.format((nVArea/tArea)*100)+"%"+"\n"+
                                "Remaining Area: "+decfor.format(remArea)+"m\u00B2");
                            remArea=0;    
                        }
                    }while(pass!=true);
                    break;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");
            }
        }while (remArea!=0);
        RainMenu();
    }

    public static void RainMenu()
    {
        int choice;
        do{
            String input=JOptionPane.showInputDialog(null,"Type of Rainfall"+"\n"+
                    "1.Average Distribution"+"\n"+
                    "2.1 in 5 year Storm"+"\n"+
                    "3.1 in 50 year Storm"+"\n"+
                    "4.1 in 200 year Storm"+"\n"+
                    "5.Exit"+"\n"+
                    "Input choice: ");
            if (input == null) {
                System.exit(0);
            }
            choice=Integer.parseInt(input);
            storm=choice;
            switch(choice){
                case 1:Averagedist();
                    break;
                case 2:OneInFive();
                    break;
                case 3:OneInFifty();
                    break;
                case 4:OneInTwoHundred();
                    break;
                case 5:
                    System.exit(0);
                default:
                    JOptionPane.showMessageDialog(null,"Invalid Choice!");
            }
        }while(choice!=5);
    }

    public static void Averagedist()
    {
        final int rDays[] = {4,3,3,3,1,1,2,1,2,3,3,3};
        final double rainfall[]={0.021,0.021,0.014,0.007,0.007,0.007,0.001,0.007,0.028,0.028,0.028,0.028};
        GreenImp(rDays,rainfall);
    }

    public static void OneInFive()
    {
        final int rDays[] = {4,3,3,3,1,1,2,1,2,1,3,3};
        final double rainfall[]={0.021,0.021,0.014,0.007,0.007,0.007,0.001,0.007,0.028,0.084,0.028,0.028};
        GreenImp(rDays,rainfall);
    }

    public static void OneInFifty(){
        final int rDays[] = {4,3,3,3,1,1,2,1,2,1,1,3};
        final double rainfall[]={0.021,0.021,0.014,0.007,0.007,0.007,0.001,0.007,0.028,0.140,0.028,0.028};
        GreenImp(rDays,rainfall);
    }

    public static void OneInTwoHundred()
    {
        final int rDays[] = {4,3,3,3,1,1,2,1,2,1,0,3};
        final double rainfall[]={0.021,0.021,0.014,0.007,0.007,0.007,0.001,0.007,0.028,0.168,0,0.028};
        GreenImp(rDays,rainfall);
    }

    public static void GreenImp(int rDays[],double rainfall[]){
        int choice;
        do{
            if(cisPass==true&&gRoofPass==true&&rGardenPass==true&&swalePass==true&&permPass==true&&treePass==true&&flowerPass==true&&vStripPass==true&&nativeVPass==true){
                Summary();
            }
            String input=JOptionPane.showInputDialog(null,"GREEN STORMWATER"+"\n"+
                    "BEST MANAGEMENT PRACTICES"+"\n"+
                    ""+"\n"+
                    "Roof Water Capture"+"\n"+
                    "1.Cisterns"+"\n"+
                    "2.Green Roof"+"\n"+
                    ""+"\n"+
                    "Water Redirection"+"\n"+
                    "3.Rain Garden"+"\n"+
                    "4.Swales"+"\n"+
                    "5.Permeable Pavements"+"\n"+
                    ""+"\n"+
                    "Green Landscape Areas"+"\n"+
                    "6.Trees"+"\n"+
                    "7.Vegetable/Flower Garden"+"\n"+
                    "8.Vegetation Filter Strip"+"\n"+
                    "9.Native Vegetation"+"\n"+
                    ""+"\n"+
                    "Enter choice: ");
            if (input == null) {
                return;
            }        
            choice = Integer.parseInt(input);
            switch(choice){
                case 1:
                    if(fRArea!=0&&cisPass==false)
                    {
                        Cistern(rDays,rainfall); 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Flat Roof Area Inputted/Already performed this Action!");
                        cisPass=true;
                    }
                    break;
                case 2:
                    if(fRArea!=0&&gRoofPass==false)
                    {
                        GreenRoof(rDays,rainfall); 
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Flat Roof Area Inputted/Left/Already performed this Action!");
                        gRoofPass=true;
                    }
                    break;
                case 3:
                    if(rainGArea!=0&&rGardenPass==false)
                    {
                        RainGarden(rDays,rainfall);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Rain Garden Area Inputted/Left/Already performed this Action!");
                        rGardenPass=true;
                    }
                    break;
                case 4:
                    if(swalePass==false){
                        RoadsideSwales(rDays,rainfall);

                    }
                    else{
                        System.out.println("Already performed this Action!");
                    }
                    break;
                case 5:
                    if(permPass==false)
                    {PermeableP(rDays,rainfall);}
                    else{
                        System.out.println("Already performed this Action!");
                    }
                    break;
                case 6:
                    if(mTArea!=0&&treePass==false)
                    {
                        Trees(rDays,rainfall);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Mature Trees Area Inputted/Already performed this Action!");
                        treePass=true;
                    }
                    break;
                case 7:
                    if(vGArea!=0&&flowerPass==false)
                    {
                        VegGarden(rDays,rainfall);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Vegetable/Flower Garden Area Inputted/Already performed this Action!");
                        flowerPass=true;
                    }
                    break;
                case 8:
                    if(vFSArea!=0&&vStripPass==false)
                    {
                        VegFilterStrip(rDays,rainfall);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Vegetation Filter Strip Area Inputted/Already performed this Action!");
                        vStripPass=true;
                    }
                    break;
                case 9:
                    if(nVArea!=0&&nativeVPass==false)
                    {
                        NativeVeg(rDays,rainfall);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"There is no Native Vegetation Area Inputted/Already performed this Action!");
                        nativeVPass=true;
                    }
                    break;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");    
            }
        }while(choice!=11);

    }

    public static void PermeableP(int rDays[], double rainfall[]){
        int choice;
        do{
            if(pPDeArea==0&&pSArea==0&&sWArea==0&&dArea==0&&sArea==0){
                JOptionPane.showMessageDialog(null,"Permeable Pavement does not apply to this land!"); 
                pPermPass=true;
                paPermPass=true;
                sPermPass=true;
                dPermPass=true;
                stPermPass=true;
                if(pPermPass==true&&paPermPass==true&&sPermPass==true&&dPermPass==true&&stPermPass==true){
                    permPass=true;
                }
                return;
            }
            String input=JOptionPane.showInputDialog(null,"Here you describe the permeable part"+"\n"+
                    "of these respective land areas"+"\n"+
                    "Permeable Pavement"+"\n"+
                    "1.Patio"+"\n"+
                    "2.Parking"+"\n"+
                    "3.Paths"+"\n"+
                    "4.Driveway"+"\n"+
                    "5.Street"+"\n"+
                    "6.Go Back"+"\n"+
                    "Enter Choice: ");
            if (input == null) {

                return;
            } 
            choice=Integer.parseInt(input);
            switch(choice){
                case 1:
                    if(pPDeArea==0)
                    {
                        JOptionPane.showMessageDialog(null,"There is no Area Left/Action Already Performed!");
                        pPermPass=true;
                    }
                    else{
                        PatioPerm(rDays,rainfall);
                    }
                    break;
                case 2:
                    if(pSArea==0)
                    {
                        JOptionPane.showMessageDialog(null,"There is no Area Left/Action Already Performed!");
                        paPermPass=true;
                    }
                    else{
                        ParkingPerm(rDays,rainfall);
                    }
                    break;
                case 3:
                    if(sWArea==0)
                    {
                        JOptionPane.showMessageDialog(null,"There is no Area Left/Action Already Performed!");
                        sPermPass=true;
                    }
                    else{
                        PathsPerm(rDays,rainfall);
                    }
                    break;
                case 4:
                    if(dArea==0)
                    {
                        JOptionPane.showMessageDialog(null,"There is no Area Left/Action Already Performed!");
                        dPermPass=true;
                    }
                    else{
                        DrivewayPerm(rDays,rainfall);
                    }
                    break;
                case 5:
                    if(sArea==0)
                    {
                        JOptionPane.showMessageDialog(null,"There is no Area Left/Action Already Performed!");
                        stPermPass=true;
                    }
                    else{
                        StreetPerm(rDays,rainfall);
                    }
                    break;
                case 6:
                    if(pPermPass==true&&paPermPass==true&&sPermPass==true&&dPermPass==true&&stPermPass==true){
                        permPass=true;
                    }
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");    
            }
        }while(choice!=6);
    }

    public static void Cistern(int rDays[], double rainfall[])
    {
        double runOff=0.0;
        double cisRain=0.0;
        int typicalUsefulLife=100;
        String input=JOptionPane.showInputDialog(null,"Input the total volume of the cisterns: ");
        if (input == null) {

            return;
        } 
        double cisVol = Double.parseDouble(input);
        JOptionPane.showMessageDialog(null,"Area Available of Flat Roof: "+decfor.format(fRArea)+"m\u00B2");
        input=JOptionPane.showInputDialog(null,"Input Area of Flat Roof to be used by Cistern(m\u00B2)");
        if (input == null) {

            return;
        } 
        double cisArea=Double.parseDouble(input);
        fRArea=fRArea-cisArea;
        double conCost=500;
        double annualMCost=50;
        int choice;
        do{
            if(cisPass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Cisterns"+"\n"+
                "1.Standard Cisterns"+"\n"+
                "2.Custom Cisterns"+"\n"+
                "3.Go Back"+"\n"+
                "Go Back:");
            if (input == null) {

                return;
            } 
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    cisPass=true;
                    for(int i=0; i<rDays.length;i++){
                        if(cisRain<cisVol){
                            cisRain=cisRain+(rDays[i]*rainfall[i]*cisArea);
                            if(cisRain>cisVol){
                                runOff=cisRain-cisVol;
                                cisRain=cisRain-runOff;
                            }
                        }
                        else{
                            runOff=runOff+(rDays[i]*rainfall[i]*cisArea);
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Cistern is "+decfor.format(cisRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(runOff)+"m\u00B3"+"\n"+
                        "The construction cost of Cisterns is €"+decfor.format(conCost*cisVol)+"\n"+
                        "The annual maintenance cost of Cisterns is €"+decfor.format(annualMCost*cisVol)+"\n"+
                        "The typical lifetime of Cisterns is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+cisRain;
                    totalRunOff=totalRunOff+runOff;
                    totalCost=totalCost+(conCost*cisVol);
                    totalACost=totalACost+(annualMCost*cisVol);
                    break;
                case 2:
                    cisPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B3)");
                    if (input == null) {

                        return;
                    } 
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B3)");
                    if (input == null) {

                        return;
                    } 
                    annualMCost= Double.parseDouble(input);
                    for(int i=0; i<rDays.length;i++){
                        if(cisRain<cisVol){
                            cisRain=cisRain+(rDays[i]*rainfall[i]*cisArea);
                            if(cisRain>cisVol){
                                runOff=cisRain-cisVol;
                                cisRain=cisRain-runOff;
                            }
                        }
                        else{
                            runOff=runOff+(rDays[i]*rainfall[i]*cisArea);
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Cistern is "+decfor.format(cisRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(runOff)+"m\u00B3"+"\n"+
                        "The construction cost of Cisterns is €"+decfor.format(conCost*cisVol)+"\n"+
                        "The annual maintenance cost of Cisterns is €"+decfor.format(annualMCost*cisVol)+"\n"+
                        "The typical lifetime of Cisterns is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+cisRain;
                    totalRunOff=totalRunOff+runOff;
                    totalCost=totalCost+(conCost*cisVol);
                    totalACost=totalACost+(annualMCost*cisVol);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");      
            }
        }while(choice!=3||cisPass!=true);
    }

    public static void GreenRoof(int rDays[], double rainfall[]){
        double runOff=0.0;
        double gRRain=0.0;
        boolean pass = true;
        double aGreen;
        double actRunOff=0.0;
        double actRain=0.0;
        JOptionPane.showMessageDialog(null,"Area Available of Flat Roof for Green Roof: "+decfor.format(fRArea)+"m\u00B2");
        do{
            String input=JOptionPane.showInputDialog(null,"Input area of Green Roof (m\u00B2)");
            if (input == null) {

                return;
            } 
            aGreen = Double.parseDouble(input);
            if(aGreen>fRArea||aGreen<0){
                pass=false;
                JOptionPane.showMessageDialog(null,"Invalid Input!");
            }
            else{
                pass=true;
            }
        }while(pass!=true);
        fRArea=fRArea-aGreen;
        int typicalUsefulLife=40;
        String input;
        double conCost=150;
        double annualMCost=10;
        double vGreen;
        double gM;
        double gMP;
        double dL;
        double dLP;
        int choice;
        do{
            if(gRoofPass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Green Roof"+"\n"+
                "1.Standard Green Roof"+"\n"+
                "2.Custom Green Roof"+"\n"+
                "3.Go Back"+"\n"+
                "Go Back:");
            if (input == null) {

                return;
            } 
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    gRoofPass=true;
                    gM=0.15;
                    gMP=0.3;
                    dL=0.05;
                    dLP=0.25;
                    vGreen=((gM*gMP)+(dL*dLP))*aGreen;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            gRRain=gRRain+((rDays[i]/rDays[i])*rainfall[i]*aGreen);
                            if(gRRain>vGreen){
                                runOff=gRRain-vGreen;
                                gRRain=gRRain-runOff;
                            }
                            actRain=actRain+gRRain;
                            gRRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Green Roofs is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of Green Roofs is €"+decfor.format(conCost*aGreen)+"\n"+
                        "The annual maintenance cost of Green Roofs is €"+decfor.format(annualMCost*aGreen)+"\n"+
                        "The typical lifetime of Green Roofs is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aGreen);
                    totalACost=totalACost+(annualMCost*aGreen);
                    break;
                case 2:
                    gRoofPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost(€ per m\u00B2)");
                    if (input == null) {

                        return;
                    } 
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost(€ per m\u00B2)");
                    if (input == null) {

                        return;
                    } 
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Growth Medium depth(m): ");
                    if (input == null) {

                        return;
                    } 
                    gM=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Growth Medium Porosity: ");
                    if (input == null) {

                        return;
                    } 
                    gMP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Drainage Layer depth(m): ");
                    if (input == null) {

                        return;
                    } 
                    dL=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Drainage Layer Porosity: ");
                    if (input == null) {

                        return;
                    } 
                    dLP=Double.parseDouble(input);
                    vGreen=((gM*gMP)+(dL*dLP))*aGreen;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            gRRain=gRRain+((rDays[i]/rDays[i])*rainfall[i]*aGreen);
                            if(gRRain>vGreen){
                                runOff=gRRain-vGreen;
                                gRRain=gRRain-runOff;
                            }
                            actRain=actRain+gRRain;
                            gRRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Green Roofs is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of Green Roofs is €"+decfor.format(conCost*aGreen)+"\n"+
                        "The annual maintenance cost of Green Roofs is €"+decfor.format(annualMCost*aGreen)+"\n"+
                        "The typical lifetime of Green Roofs is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aGreen);
                    totalACost=totalACost+(annualMCost*aGreen);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");      
            }
        }while(choice!=3||gRoofPass!=true);
    }

    public static void RainGarden(int rDays[], double rainfall[])
    {
        double rGArea=rainGArea;
        int typicalUsefulLife=25;
        String input;
        double conCost =70;
        double annualMCost= 5;
        double runOff=0.0;
        double rGRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double aRoof=0.0;
        if(fRArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from flat roof? (Y/N): ");
            if (input == null) {

                return;
            } 
            char fR=input.charAt(0);
            if(fR=='Y'||fR=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Flat Roof: "+decfor.format(fRArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Roof to be Redirected to Rain Garden(m\u00B2):");
                    if (input == null) {

                        return;
                    } 
                    aRoof = Double.parseDouble(input);
                    if(aRoof>fRArea||aRoof<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
                fRArea=fRArea-aRoof;
            }
        }
        double aPaths=0;
        if(sWArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from Paths? (Y/N): ");
            if (input == null) {

                return;
            } 
            char sW=input.charAt(0);
            if(sW=='Y'||sW=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Paths: "+decfor.format(sWArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Paths to be Redirected to Rain Garden(m\u00B2):");
                    if (input == null) {

                        return;
                    } 
                    aPaths =Double.parseDouble(input);
                    if(aPaths>sWArea||aPaths<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            sWArea=sWArea-aPaths;
        }
        double aParkingS=0;
        if(pSArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from Parking Surface? (Y/N): ");
            if (input == null) {

                return;
            } 
            char pS=input.charAt(0);
            if(pS=='Y'||pS=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Parking Surface: "+decfor.format(pSArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Parking Surface to be Redirected to Rain Garden(m\u00B2):");
                    if (input == null) {

                        return;
                    } 
                    aParkingS =Double.parseDouble(input);
                    if(aParkingS>pSArea||aParkingS<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            pSArea=pSArea-aParkingS;
        }
        double aDriveway=0;
        if(dArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from Driveway? (Y/N): ");
            if (input == null) {

                return;
            } 
            char d=input.charAt(0);
            if(d=='Y'||d=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Driveway: "+decfor.format(dArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Driveway to be Redirected to Rain Garden(m\u00B2):");
                    if (input == null) {
                        return;
                    }
                    aDriveway = Double.parseDouble(input);
                    if(aDriveway>dArea||aDriveway<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            dArea=dArea-aDriveway;
        }
        double aStreet=0;
        if(sArea!=0){
            input =JOptionPane.showInputDialog(null,"Do you want water to be redirected from Street? (Y/N): ");
            if (input == null) {

                return;
            } 
            char sW=input.charAt(0);
            if(sW=='Y'||sW=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Street: "+decfor.format(sArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Street to be Redirected to Rain Garden(m\u00B2):");
                    if (input == null) {
                        return;
                    }
                    aStreet = Double.parseDouble(input);
                    if(aStreet>sWArea||aStreet<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            sWArea=sWArea-aStreet;
        }
        double vGreen;
        double pD;
        double aS;
        double aSP;
        double aD;
        double aP;
        int choice;
        do{
            if(rGardenPass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Rain Garden"+"\n"+
                "1.Standard Rain Garden"+"\n"+
                "2.Custom Rain Garden"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    rGardenPass=true;
                    pD=0.2;
                    aS=0.2;
                    aSP=0.35;
                    aD=0.05;
                    aP=0.25;
                    vGreen=((aS*aSP)+(aD*aP)+(pD*0.667)*rGArea);
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            rGRain=rGRain+((rDays[i]/rDays[i])*rainfall[i]*(aRoof+rGArea+aPaths+aParkingS+aDriveway+aStreet));
                            if(rGRain>vGreen){
                                runOff=rGRain-vGreen;
                                rGRain=rGRain-runOff;
                            }
                            actRain=actRain+rGRain;
                            rGRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Rain Gardens is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of Rain Gardens is €"+decfor.format(conCost*rGArea)+"\n"+
                        "The annual maintenance cost of Rain Gardens is €"+decfor.format(annualMCost*rGArea)+"\n"+
                        "The typical lifetime of Rain Gardens is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*rGArea);
                    totalACost=totalACost+(annualMCost*rGArea);
                    break;
                case 2:
                    rGardenPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost(€ per m\u00B2)");
                    if (input == null) {

                        return;
                    } 
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost(€ per m\u00B2)");
                    if (input == null) {

                        return;
                    } 
                    annualMCost= Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Ponding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    pD=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Amended Soil Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    aS=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Amended Soil Porosity: ");
                    if (input == null) {
                        return;
                    }
                    aSP=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Depth of Aggregate(m): ");
                    if (input == null) {
                        return;
                    }
                    aD=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Porosity of Aggregate: ");
                    if (input == null) {
                        return;
                    }
                    aP=Double.parseDouble(input);
                    vGreen=((aS*aSP)+(aD*aP)+(pD*0.667)*rGArea);
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            rGRain=rGRain+((rDays[i]/rDays[i])*rainfall[i]*(aRoof+rGArea+aPaths+aParkingS+aDriveway+aStreet));
                            if(rGRain>vGreen){
                                runOff=rGRain-vGreen;
                                rGRain=rGRain-runOff;
                            }
                            actRain=actRain+rGRain;
                            rGRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Rain Gardens is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of Rain Gardens is €"+decfor.format(conCost*rGArea)+"\n"+
                        "The annual maintenance cost of Rain Gardens is €"+decfor.format(annualMCost*rGArea)+"\n"+
                        "The typical lifetime of Rain Gardens is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*rGArea);
                    totalACost=totalACost+(annualMCost*rGArea);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");      
            }
        }while(choice!=3||rGardenPass!=true);
    }

    public static void RoadsideSwales(int rDays[], double rainfall[])
    {
        String input=JOptionPane.showInputDialog(null,"Input the total Area of the Swale(m\u00B2): ");
        if (input == null) {
            return;
        }
        double rSArea=Double.parseDouble(input);
        int typicalUsefulLife=25;
        double conCost =200;
        double annualMCost=3;
        double runOff=0.0;
        double rSRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double aRoof=0.0;
        if(fRArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from flat roof? (Y/N): ");
            if (input == null) {

                return;
            } 
            char fR=input.charAt(0);
            if(fR=='Y'||fR=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Flat Roof: "+decfor.format(fRArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Roof to be Redirected to Roadside Swale(m\u00B2):");
                    if (input == null) {

                        return;
                    } 
                    aRoof = Double.parseDouble(input);
                    if(aRoof>fRArea||aRoof<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
                fRArea=fRArea-aRoof;
            }
        }
        double aPaths=0;
        if(sWArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from Paths? (Y/N): ");
            if (input == null) {

                return;
            } 
            char sW=input.charAt(0);
            if(sW=='Y'||sW=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Paths: "+decfor.format(sWArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Paths to be Redirected to Roadside Swale(m\u00B2):");
                    if (input == null) {

                        return;
                    } 
                    aPaths =Double.parseDouble(input);
                    if(aPaths>sWArea||aPaths<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            sWArea=sWArea-aPaths;
        }
        double aParkingS=0;
        if(pSArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from Parking Surface? (Y/N): ");
            if (input == null) {

                return;
            } 
            char pS=input.charAt(0);
            if(pS=='Y'||pS=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Parking Surface: "+decfor.format(pSArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Parking Surface to be Redirected to Roadside Swale(m\u00B2):");
                    if (input == null) {

                        return;
                    } 
                    aParkingS =Double.parseDouble(input);
                    if(aParkingS>pSArea||aParkingS<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            pSArea=pSArea-aParkingS;
        }
        double aDriveway=0;
        if(dArea!=0){
            input=JOptionPane.showInputDialog(null,"Do you want water to be redirected from Driveway? (Y/N): ");
            if (input == null) {

                return;
            } 
            char d=input.charAt(0);
            if(d=='Y'||d=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Driveway: "+decfor.format(dArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Driveway to be Redirected to Roadside Swale(m\u00B2):");
                    if (input == null) {
                        return;
                    }
                    aDriveway = Double.parseDouble(input);
                    if(aDriveway>dArea||aDriveway<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            dArea=dArea-aDriveway;
        }
        double aStreet=0;
        if(sArea!=0){
            JOptionPane.showInputDialog(null,"Do you want water to be redirected from Street? (Y/N): ");
            if (input == null) {

                return;
            } 
            char sW=input.charAt(0);
            if(sW=='Y'||sW=='y'){
                JOptionPane.showMessageDialog(null,"Area Available of Street: "+decfor.format(sArea)+"m\u00B2");
                boolean pass = false;
                do{
                    input=JOptionPane.showInputDialog(null,"Input area of Street to be Redirected to Roadside Swale(m\u00B2):");
                    if (input == null) {
                        return;
                    }
                    aStreet = Double.parseDouble(input);
                    if(aStreet>sWArea||aStreet<0){
                        pass=false;
                        JOptionPane.showMessageDialog(null,"Invalid Input!");
                    }
                    else{
                        pass=true;
                    }
                }while(pass!=true);
            }
            sWArea=sWArea-aStreet;
        }
        double vGreen;
        double tW;
        double aS;
        double aSP;
        double aD;
        double aP;
        int choice;
        do{
            if(swalePass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Roadside Swale"+"\n"+
                "1.Standard Swale"+"\n"+
                "2.Custom Swale"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    swalePass=true;
                    tW=0.6;
                    aS=0.15;
                    aSP=0.35;
                    aD=0.30;
                    aP=0.25;
                    vGreen=((aS*aSP)+(aD*aP))*tW*rSArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            rSRain=rSRain+((rDays[i]/rDays[i])*rainfall[i]*(aRoof+rSArea+aPaths+aParkingS+aDriveway+aStreet));
                            if(rSRain>vGreen){
                                runOff=rSRain-vGreen;
                                rSRain=rSRain-runOff;
                            }
                            actRain=actRain+rSRain;
                            rSRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Swales is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of Swales is €"+decfor.format(conCost*rSArea)+"\n"+
                        "The annual maintenance cost of Swales is €"+decfor.format(annualMCost*rSArea)+"\n"+
                        "The typical lifetime of Swales is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*rSArea);
                    totalACost=totalACost+(annualMCost*rSArea);
                    break;
                case 2:
                    swalePass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost(€ per m\u00B2)");
                    if (input == null) {

                        return;
                    } 
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost(€ per m\u00B2)");
                    if (input == null) {

                        return;
                    } 
                    annualMCost= Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Top Width(m): ");
                    if (input == null) {
                        return;
                    }
                    tW=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Amended Soil depth(m): ");
                    if (input == null) {
                        return;
                    }
                    aS=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Amended Soil Porosity: ");
                    if (input == null) {
                        return;
                    }
                    aSP=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Depth of Aggregate(m): ");
                    if (input == null) {
                        return;
                    }
                    aD=Double.parseDouble(input);
                    JOptionPane.showInputDialog(null,"Input Porosity of Aggregate: ");
                    if (input == null) {
                        return;
                    }
                    aP=Double.parseDouble(input);
                    vGreen=((aS*aSP)+(aD*aP))*tW*rSArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            rSRain=rSRain+((rDays[i]/rDays[i])*rainfall[i]*(aRoof+rSArea+aPaths+aParkingS+aDriveway+aStreet));
                            if(rSRain>vGreen){
                                runOff=rSRain-vGreen;
                                rSRain=rSRain-runOff;
                            }
                            actRain=actRain+rSRain;
                            rSRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Swales is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of Swales is €"+decfor.format(conCost*rSArea)+"\n"+
                        "The annual maintenance cost of Swales is €"+decfor.format(annualMCost*rSArea)+"\n"+
                        "The typical lifetime of Swales is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*rSArea);
                    totalACost=totalACost+(annualMCost*rSArea);
                    break;
                case 3:return;
                default:JOptionPane.showInputDialog(null,"Invalid Choice!");      
            }
        }while(choice!=3||swalePass!=true);
    }

    public static void PatioPerm(int rDays[], double rainfall[])
    {
        JOptionPane.showMessageDialog(null,"Area Available of Patio: "+decfor.format(pPDeArea)+"m\u00B2");
        boolean pass = false;
        double aPatio;
        String input;
        do{
            input=JOptionPane.showInputDialog(null,"Input area of Patio to be Permeable(m\u00B2): ");
            if (input == null) {
                return;
            }
            aPatio = Double.parseDouble(input);
            if(aPatio>pPDeArea||aPatio<0){
                pass=false;
                JOptionPane.showMessageDialog(null,"Invalid Input!");
            }
            else{
                pass=true;
            }
        }while(pass!=true);
        int typicalUsefulLife=30;
        double conCost=100;
        double annualMCost=0.25;
        double runOff=0.0;
        double pPRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double beD;
        double beP;
        double baD;
        double baP;
        double sD;
        double sP;
        double vPav;
        int choice;
        do{
            if(pPermPass==true){
                PermeableP(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Patio"+"\n"+
                "1.Standard Pavement"+"\n"+
                "2.Custom Pavement"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    pPermPass=true;
                    beD=0.05;
                    beP=0.25;
                    baD=0.1;
                    baP=0.25;
                    sD=0.05;
                    sP=0.25;
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aPatio;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aPatio));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Patio Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aPatio)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aPatio)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aPatio);
                    totalACost=totalACost+(annualMCost*aPatio);
                    break;
                case 2:
                    pPermPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    beD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Porosity: ");
                    if (input == null) {
                        return;
                    }
                    beP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    baD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    baP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    sD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    sP=Double.parseDouble(input);
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aPatio;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aPatio));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Patio Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aPatio)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aPatio)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aPatio);
                    totalACost=totalACost+(annualMCost*aPatio);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");     
            }
        }while(choice!=3||pPermPass!=true);
    }

    public static void ParkingPerm(int rDays[], double rainfall[])
    {

        JOptionPane.showMessageDialog(null,"Area Available of Parking Surface: "+decfor.format(pSArea)+"m\u00B2");
        boolean pass = false;
        double aParking;
        String input;
        do{
            input=JOptionPane.showInputDialog(null,"Input area of Parking Surface to be Permeable(m\u00B2): ");
            if (input == null) {
                return;
            }
            aParking = Double.parseDouble(input);
            if(aParking>pSArea||aParking<0){
                pass=false;
                JOptionPane.showMessageDialog(null,"Invalid Input!");
            }
            else{
                pass=true;
            }
        }while(pass!=true);
        int typicalUsefulLife=30;
        double conCost=100;
        double annualMCost=0.25;
        double runOff=0.0;
        double pPRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double beD;
        double beP;
        double baD;
        double baP;
        double sD;
        double sP;
        double vPav;
        int choice;
        do{
            if(paPermPass==true){
                PermeableP(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Parking Surface"+"\n"+
                "1.Standard Pavement"+"\n"+
                "2.Custom Pavement"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    paPermPass=true;
                    beD=0.05;
                    beP=0.25;
                    baD=0.1;
                    baP=0.25;
                    sD=0.05;
                    sP=0.25;
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aParking;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aParking));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Parking Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aParking)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aParking)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aParking);
                    totalACost=totalACost+(annualMCost*aParking);
                    break;
                case 2:
                    paPermPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    beD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Porosity: ");
                    if (input == null) {
                        return;
                    }
                    beP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    baD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    baP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    sD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    sP=Double.parseDouble(input);
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aParking;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aParking));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Parking Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aParking)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aParking)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;totalCost=totalCost+(conCost*aParking);
                    totalACost=totalACost+(annualMCost*aParking);
                    break;
                case 3:
                    return;

                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");     
            }
        }while(choice!=3||paPermPass!=true);
    }

    public static void PathsPerm(int rDays[], double rainfall[])
    {
        JOptionPane.showMessageDialog(null,"Area Available of Paths: "+decfor.format(sWArea)+"m\u00B2");
        boolean pass = false;
        double aWalk;
        String input;
        do{
            input=JOptionPane.showInputDialog(null,"Input area of Paths to be Permeable(m\u00B2): ");
            if (input == null) {
                return;
            }
            aWalk = Double.parseDouble(input);
            if(aWalk>sWArea||aWalk<0){
                pass=false;
                JOptionPane.showMessageDialog(null,"Invalid Input!");
            }
            else{
                pass=true;
            }
        }while(pass!=true);
        int typicalUsefulLife=30;
        double conCost=100;
        double annualMCost=0.25;
        double runOff=0.0;
        double pPRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double beD;
        double beP;
        double baD;
        double baP;
        double sD;
        double sP;
        double vPav;
        int choice;
        do{
            if(sPermPass==true){
                PermeableP(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Paths"+"\n"+
                "1.Standard Pavement"+"\n"+
                "2.Custom Pavement"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    sPermPass=true;
                    beD=0.05;
                    beP=0.25;
                    baD=0.1;
                    baP=0.25;
                    sD=0.05;
                    sP=0.25;
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aWalk;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aWalk));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Paths Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aWalk)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aWalk)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aWalk);
                    totalACost=totalACost+(annualMCost*aWalk);
                    break;
                case 2:
                    sPermPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    beD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Porosity: ");
                    if (input == null) {
                        return;
                    }
                    beP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    baD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    baP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    sD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    sP=Double.parseDouble(input);
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aWalk;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aWalk));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Paths Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aWalk)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aWalk)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aWalk);
                    totalACost=totalACost+(annualMCost*aWalk);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");     
            }
        }while(choice!=3||sPermPass!=true);
    }

    public static void DrivewayPerm(int rDays[], double rainfall[])
    {
        String input;
        JOptionPane.showMessageDialog(null,"Area Available of Driveway: "+decfor.format(dArea)+"m\u00B2");
        boolean pass = false;
        double aDrive;
        do{
            input=JOptionPane.showInputDialog(null,"Input area of Driveway to be Permeable(m\u00B2): ");
            if (input == null) {
                return;
            }
            aDrive = Double.parseDouble(input);
            if(aDrive>dArea||aDrive<0){
                pass=false;
                JOptionPane.showMessageDialog(null,"Invalid Input!");
            }
            else{
                pass=true;
            }
        }while(pass!=true);
        int typicalUsefulLife=30;
        double conCost=100;
        double annualMCost=0.25;
        double runOff=0.0;
        double pPRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double beD;
        double beP;
        double baD;
        double baP;
        double sD;
        double sP;
        double vPav;
        int choice;
        do{
            if(dPermPass==true){
                PermeableP(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Driveway"+"\n"+
                "1.Standard Pavement"+"\n"+
                "2.Custom Pavement"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    dPermPass=true;
                    beD=0.05;
                    beP=0.25;
                    baD=0.1;
                    baP=0.25;
                    sD=0.05;
                    sP=0.25;
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aDrive;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aDrive));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Driveway Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aDrive)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aDrive)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aDrive);
                    totalACost=totalACost+(annualMCost*aDrive);
                    break;
                case 2:
                    dPermPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    beD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Porosity: ");
                    if (input == null) {
                        return;
                    }
                    beP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    baD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    baP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    sD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    sP=Double.parseDouble(input);
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aDrive;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aDrive));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Driveway Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aDrive)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aDrive)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aDrive);
                    totalACost=totalACost+(annualMCost*aDrive);
                    break;
                case 3:
                    return;
                default:    JOptionPane.showMessageDialog(null,"Invalid Choice!");                         
            }
        }while(choice!=3||dPermPass!=true);
    }

    public static void StreetPerm(int rDays[], double rainfall[])
    {
        String input;
        JOptionPane.showMessageDialog(null,"Area Available of Street: "+decfor.format(sArea)+"m\u00B2");
        boolean pass = false;
        double aStreet;
        do{
            input=JOptionPane.showInputDialog(null,"Input area of Street to be Permeable(m\u00B2): ");
            if (input == null) {
                return;
            }
            aStreet = Double.parseDouble(input);
            if(aStreet>sArea||aStreet<0){
                pass=false;
                JOptionPane.showMessageDialog(null,"Invalid Input!");
            }
            else{
                pass=true;
            }
        }while(pass!=true);
        int typicalUsefulLife=30;
        double conCost=100;
        double annualMCost=0.25;
        double runOff=0.0;
        double pPRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double beD;
        double beP;
        double baD;
        double baP;
        double sD;
        double sP;
        double vPav;
        int choice;
        do{
            if(stPermPass==true){
                PermeableP(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Street"+"\n"+
                "1.Standard Pavement"+"\n"+
                "2.Custom Pavement"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    stPermPass=true;
                    beD=0.05;
                    beP=0.25;
                    baD=0.1;
                    baP=0.25;
                    sD=0.05;
                    sP=0.25;
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aStreet;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aStreet));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Street Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aStreet)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aStreet)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*aStreet);
                    totalACost=totalACost+(annualMCost*aStreet);
                    break;
                case 2:
                    stPermPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    beD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Bedding Porosity: ");
                    if (input == null) {
                        return;
                    }
                    beP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    baD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    baP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    sD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Sub-Base Porosity: ");
                    if (input == null) {
                        return;
                    }
                    sP=Double.parseDouble(input);
                    vPav=((beD*beP)+(baD*baP)+(sD*sP))*aStreet;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            pPRain=pPRain+((rDays[i]/rDays[i])*rainfall[i]*(aStreet));
                            if(pPRain>vPav){
                                runOff=pPRain-vPav;
                                pPRain=pPRain-runOff;
                            }
                            actRain=actRain+pPRain;
                            pPRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Street Pavement is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Pavement is €"+decfor.format(conCost*aStreet)+"\n"+
                        "The annual maintenance cost of Pavement is €"+decfor.format(annualMCost*aStreet)+"\n"+
                        "The typical lifetime of Pavement is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;totalCost=totalCost+(conCost*aStreet);
                    totalACost=totalACost+(annualMCost*aStreet);
                    break;
                case 3:
                    return;
                default:    JOptionPane.showMessageDialog(null,"Invalid Choice!");                         
            }
        }while(choice!=3||stPermPass!=true);
    }

    public static void Trees(int rDays[], double rainfall[])
    {
        String input;
        int typicalUsefulLife=80;
        double conCost=100;
        double annualMCost=20;
        double runOff=0.0;
        double treeRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double cP;
        double tP;
        double aS;
        double aSP;
        double canopy;
        int trees;
        double temp1;
        double temp2;
        double vTrees;
        int choice;
        do{
            if(treePass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Trees"+"\n"+
                "1.Standard Trees"+"\n"+
                "2.Custom Trees"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    treePass=true;
                    canopy=18;
                    temp1=mTArea/canopy;
                    trees=(int)temp1;
                    temp2=temp1-trees;
                    if(temp2>0&&temp2<1){
                        trees++;
                    }
                    cP=0.01;
                    tP=1.5;
                    aS=0.45;
                    aSP=0.4;
                    vTrees=((canopy*cP)+(aS*aSP*tP))*trees;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            treeRain=treeRain+((rDays[i]/rDays[i])*rainfall[i]*(mTArea));
                            if(treeRain>vTrees){
                                runOff=treeRain-vTrees;
                                treeRain=treeRain-runOff;
                            }
                            actRain=actRain+treeRain;
                            treeRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"This land holds "+trees+" mature trees"+"\n"+
                        "The volume of water stored in the Trees is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Trees is €"+decfor.format(conCost*trees)+"\n"+
                        "The annual maintenance cost of the Trees is €"+decfor.format(annualMCost*trees)+"\n"+
                        "The typical lifetime of Trees is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*trees);
                    totalACost=totalACost+(annualMCost*trees);
                    break;
                case 2:
                    treePass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Canopy Area per Tree(m\u00B2): ");
                    if (input == null) {
                        return;
                    }
                    canopy=Double.parseDouble(input);
                    temp1=mTArea/canopy;
                    trees=(int)temp1;
                    temp2=temp1-trees;
                    if(temp2>0&&temp2<1){
                        trees++;
                    }
                    input=JOptionPane.showInputDialog(null,"Input Canopy Porosity: ");
                    if (input == null) {
                        return;
                    }
                    cP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Tree Pit Area(m\u00B2): ");
                    if (input == null) {
                        return;
                    }
                    tP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    aS=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Porosity: ");
                    if (input == null) {
                        return;
                    }
                    aSP=Double.parseDouble(input);
                    vTrees=((canopy*cP)+(aS*aSP*tP))*trees;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            treeRain=treeRain+((rDays[i]/rDays[i])*rainfall[i]*(mTArea));
                            if(treeRain>vTrees){
                                runOff=treeRain-vTrees;
                                treeRain=treeRain-runOff;
                            }
                            actRain=actRain+treeRain;
                            treeRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"This land holds "+trees+" mature trees"+"\n"+
                        "The volume of water stored in the Trees is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Trees is €"+decfor.format(conCost*trees)+"\n"+
                        "The annual maintenance cost of the Trees is €"+decfor.format(annualMCost*trees)+"\n"+
                        "The typical lifetime of Trees is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*trees);
                    totalACost=totalACost+(annualMCost*trees);
                    break;
                case 3:
                    return;
                default:    JOptionPane.showMessageDialog(null,"Invalid Choice!");                     
            }
        }while(choice!=3||treePass!=true);
    }

    public static void VegGarden(int rDays[], double rainfall[])
    {
        String input;
        int typicalUsefulLife=100;
        double conCost=3;
        double annualMCost=0.25;
        double runOff=0.0;
        double garRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double aS;
        double aSP;
        double vGarden;
        int choice;
        do{
            if(flowerPass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Vegetable/Flower Garden"+"\n"+
                "1.Standard Garden"+"\n"+
                "2.Custom Garden"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    flowerPass=true;
                    aS=0.15;
                    aSP=0.35;
                    vGarden=aS*aSP*vGArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            garRain=garRain+((rDays[i]/rDays[i])*rainfall[i]*(vGArea));
                            if(garRain>vGarden){
                                runOff=garRain-vGarden;
                                garRain=garRain-runOff;
                            }
                            actRain=actRain+garRain;
                            garRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in the Vegetable/Flower Garden is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Garden is €"+decfor.format(conCost*vGArea)+"\n"+
                        "The annual maintenance cost of Garden is €"+decfor.format(annualMCost*vGArea)+"\n"+
                        "The typical lifetime of Garden is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*vGArea);
                    totalACost=totalACost+(annualMCost*vGArea);
                    break;
                case 2:
                    flowerPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    aS=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Porosity: ");
                    if (input == null) {
                        return;
                    }
                    aSP=Double.parseDouble(input);
                    vGarden=aS*aSP*vGArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            garRain=garRain+((rDays[i]/rDays[i])*rainfall[i]*(vGArea));
                            if(garRain>vGarden){
                                runOff=garRain-vGarden;
                                garRain=garRain-runOff;
                            }
                            actRain=actRain+garRain;
                            garRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in the Vegetable/Flower Garden is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Garden is €"+decfor.format(conCost*vGArea)+"\n"+
                        "The annual maintenance cost of Garden is €"+decfor.format(annualMCost*vGArea)+"\n"+
                        "The typical lifetime of Garden is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*vGArea);
                    totalACost=totalACost+(annualMCost*vGArea);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");
            }
        }while(choice!=3||flowerPass!=true);
    }

    public static void VegFilterStrip(int rDays[], double rainfall[])
    {
        String input;
        int typicalUsefulLife=30;
        double conCost=6;
        double annualMCost=0.5;
        double runOff=0.0;
        double filterRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double tW;
        double pD;
        double aS;
        double aSP;
        double aD;
        double aP;
        double vFilter;
        int choice;
        do{
            if(vStripPass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Vegetation Filter Strip"+"\n"+
                "1.Standard Filter Strip"+"\n"+
                "2.Custom Filter Strip"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice){
                case 1:
                    vStripPass=true;
                    tW=0.3;
                    pD=0.3;
                    aS=0.2;
                    aSP=0.35;
                    aD=0.2;
                    aP=0.25;
                    vFilter=((aS*aSP)+(aD*aP)+(pD*0.667))*tW*vFSArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            filterRain=filterRain+((rDays[i]/rDays[i])*rainfall[i]*(vFSArea));
                            if(filterRain>vFilter){
                                runOff=filterRain-vFilter;
                                filterRain=filterRain-runOff;
                            }
                            actRain=actRain+filterRain;
                            filterRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Vegetation filter strip "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Vegetation filter strip is €"+decfor.format(conCost*vFSArea)+"\n"+
                        "The annual maintenance cost of Vegetation filter strip is €"+decfor.format(annualMCost*vFSArea)+"\n"+
                        "The typical lifetime of Vegetation filter strip is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*vFSArea);
                    totalACost=totalACost+(annualMCost*vFSArea);
                    break;
                case 2:
                    vStripPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Top Width(m): ");
                    if (input == null) {
                        return;
                    }
                    tW=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Ponding Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    pD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil: ");
                    if (input == null) {
                        return;
                    }
                    aS=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Porosity: ");
                    if (input == null) {
                        return;
                    }
                    aSP=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Depth of Aggregate(m): ");
                    if (input == null) {
                        return;
                    }
                    aD=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Porosity of Aggregate: ");
                    if (input == null) {
                        return;
                    }
                    aP=Double.parseDouble(input);
                    vFilter=((aS*aSP)+(aD*aP)+(pD*0.667))*tW*vFSArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            filterRain=filterRain+((rDays[i]/rDays[i])*rainfall[i]*(vFSArea));
                            if(filterRain>vFilter){
                                runOff=filterRain-vFilter;
                                filterRain=filterRain-runOff;
                            }
                            actRain=actRain+filterRain;
                            filterRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in Vegetation filter strip "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Vegetation filter strip is €"+decfor.format(conCost*vFSArea)+"\n"+
                        "The annual maintenance cost of Vegetation filter strip is €"+decfor.format(annualMCost*vFSArea)+"\n"+
                        "The typical lifetime of Vegetation filter strip is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*vFSArea);
                    totalACost=totalACost+(annualMCost*vFSArea);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");
            }
        }while(choice!=3||vStripPass!=true);
    }

    public static void NativeVeg(int rDays[], double rainfall[])
    {
        String input;
        int typicalUsefulLife=100;
        double conCost=2;
        double annualMCost=0.5;
        double runOff=0.0;
        double nativeRain=0.0;
        double actRunOff=0.0;
        double actRain=0.0;
        double aS;
        double aSP;
        double vNative;
        int choice;
        do{
            if(nativeVPass==true){
                GreenImp(rDays,rainfall);
            }
            input=JOptionPane.showInputDialog(null,"Water Capture by Native Vegetation"+"\n"+
                "1.Standard Vegetation"+"\n"+
                "2.Custom Vegetation"+"\n"+
                "3.Go Back"+"\n"+
                "Input Choice:");
            if (input == null) {
                return;
            }
            choice=Integer.parseInt(input);
            switch(choice)
            {
                case 1:
                    nativeVPass=true;
                    aS=0.2;
                    aSP=0.35;
                    vNative=aS*aSP*nVArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            nativeRain=nativeRain+((rDays[i]/rDays[i])*rainfall[i]*(nVArea));
                            if(nativeRain>vNative){
                                runOff=nativeRain-vNative;
                                nativeRain=nativeRain-runOff;
                            }
                            actRain=actRain+nativeRain;
                            nativeRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in the Native Vegetation is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Native Vegetation is €"+decfor.format(conCost*nVArea)+"\n"+
                        "The annual maintenance cost of Native Vegetation is €"+decfor.format(annualMCost*nVArea)+"\n"+
                        "The typical lifetime of Native Vegetation is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*nVArea);
                    totalACost=totalACost+(annualMCost*nVArea);
                    break;
                case 2:
                    nativeVPass=true;
                    input=JOptionPane.showInputDialog(null,"Input the construction cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    conCost = Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input the annual maintenance cost (€ per m\u00B2)");
                    if (input == null) {
                        return;
                    }
                    annualMCost= Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Depth(m): ");
                    if (input == null) {
                        return;
                    }
                    aS=Double.parseDouble(input);
                    input=JOptionPane.showInputDialog(null,"Input Amended Soil Porosity: ");
                    if (input == null) {
                        return;
                    }
                    aSP=Double.parseDouble(input);
                    vNative=aS*aSP*nVArea;
                    for(int i=0; i<rDays.length; i++)
                    {
                        int temp=rDays[i];
                        for(int m=0; m<temp;m++){
                            nativeRain=nativeRain+((rDays[i]/rDays[i])*rainfall[i]*(nVArea));
                            if(nativeRain>vNative){
                                runOff=nativeRain-vNative;
                                nativeRain=nativeRain-runOff;
                            }
                            actRain=actRain+nativeRain;
                            nativeRain=0.0;
                            actRunOff=actRunOff+runOff;
                            runOff=0.0;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"The volume of water stored in the Native Vegetation is "+decfor.format(actRain)+"m\u00B3"+"\n"+
                        "The volume of water which is runoff is "+decfor.format(actRunOff)+"m\u00B3"+"\n"+
                        "The construction cost of the Native Vegetation is €"+decfor.format(conCost*nVArea)+"\n"+
                        "The annual maintenance cost of Native Vegetation is €"+decfor.format(annualMCost*nVArea)+"\n"+
                        "The typical lifetime of Native Vegetation is "+typicalUsefulLife+" Years");
                    totalRain=totalRain+actRain;
                    totalRunOff=totalRunOff+actRunOff;
                    totalCost=totalCost+(conCost*nVArea);
                    totalACost=totalACost+(annualMCost*nVArea);
                    break;
                case 3:
                    return;
                default:JOptionPane.showMessageDialog(null,"Invalid Choice!");
            }
        }while(choice!=3||nativeVPass!=true);
    }

    public static void Summary(){
        if(storm==1){
            JOptionPane.showMessageDialog(null,"FOR THE ANNUAL AVERAGE STORM"+"\n"+
                "The total volume of water stored in the land is "+decfor.format(totalRain)+"m\u00B3"+"\n"+
                "The total volume of water which is runoff is "+decfor.format(totalRunOff)+"m\u00B3"+"\n"+
                "The total construction cost of the Green Improvements is €"+decfor.format(totalCost)+"\n"+
                "The total annual maintenance cost of the Green Improvements is €"+decfor.format(totalACost));
        }
        if(storm==2){
            JOptionPane.showMessageDialog(null,"FOR THE ANNUAL 1 IN 5 STORM"+"\n"+
                "The total volume of water stored in the land is "+decfor.format(totalRain)+"m\u00B3"+"\n"+
                "The total volume of water which is runoff is "+decfor.format(totalRunOff)+"m\u00B3"+"\n"+
                "The total construction cost of the Green Improvements is €"+decfor.format(totalCost)+"\n"+
                "The total annual maintenance cost of the Green Improvements is €"+decfor.format(totalACost));
        }
        if(storm==3){
            JOptionPane.showMessageDialog(null,"FOR THE ANNUAL 1 IN 50 STORM"+"\n"+
                "The total volume of water stored in the land is "+decfor.format(totalRain)+"m\u00B3"+"\n"+
                "The total volume of water which is runoff is "+decfor.format(totalRunOff)+"m\u00B3"+"\n"+
                "The total construction cost of the Green Improvements is €"+decfor.format(totalCost)+"\n"+
                "The total annual maintenance cost of the Green Improvements is €"+decfor.format(totalACost));
        }
        if(storm==4){
            JOptionPane.showMessageDialog(null,"FOR THE ANNUAL 1 IN 200 STORM"+"\n"+
                "The total volume of water stored in the land is "+decfor.format(totalRain)+"m\u00B3"+"\n"+
                "The total volume of water which is runoff is "+decfor.format(totalRunOff)+"m\u00B3"+"\n"+
                "The total construction cost of the Green Improvements is €"+decfor.format(totalCost)+"\n"+
                "The total annual maintenance cost of the Green Improvements is €"+decfor.format(totalACost));
        }
        System.exit(0);
    }
}
