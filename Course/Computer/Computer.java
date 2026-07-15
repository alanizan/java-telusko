class Pc
{
    void playMusic()
    {
        System.out.println("playing music");
    }

public String getMeAPen(int cost){
if (cost >= 10)return "Pen";
return "pay more";
}

    
}




class Computer {
    public static void main(String[] args)
    {
       // Calculator calculator = new Calculator();
        
        //int num1=4;
       // int num2=5;
    
    
    //int result = calculator.add(num1,num2);
   // System.out.println(result);

           Pc pc = new Pc();

        pc.playMusic();

        String s = pc.getMeAPen(10);
            System.out.println(s);
        

    }
}