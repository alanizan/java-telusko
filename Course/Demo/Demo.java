
class Calculator
{
  
    public int add(int num1,int num2)
    {
        int result = num1 + num2;
        return result;
    }
}



class Demo {


    public static void main(String[] args)
    {
        Calculator calculator = new Calculator();
        
        int num1=4;
        int num2=5;
    
    
    int result = calculator.add(num1,num2);
    System.out.println(result);

    }
    }
