package pack;

public class TNumeros {
    
    private int num1;
    private int num2;
    
    public TNumeros(){
        num1 = 0;
        num2 = 0;
    }

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    
    public void setNum2(int num2) {
        this.num2 = num2;
    }        
    
    public long Sumatoria(){
        int i;
        long sum = 0;
        
        for(i = num1; i<=num2; i++){
            sum++;            
        }
        return sum;
    }
    public long ProductoPares(){
     int i;
     long prod = 1;
     
     for(i = num1; i <= num2;i++){
         if(i%2==0){
            prod = prod*i;
         }             
        }
        return prod;
    }        
    
    public float ProductoImpares(){
        int i, cant = 0;
        long sum = 0;
        
        for(i = num1; i <= num2; i++){
            if(i%2 != 0){
                cant++;
                sum=sum + i;
            }
        }   
        if(cant > 0){
            return (float)sum/cant;
        }else{
            return 0;
        }
    }
    
    public int CalMCD(){
        int d, mcd;
        d = 1;
        mcd = 1;
        
        while(d <= num1 && d <= num2 ){
            if(num1%d == 0 && num2%d == 0){
                mcd = d;
            }
            d++;
        }            
        return mcd;
    }
    
    public int CalMCM(){     
        return (num1*num2)/CalMCD();
    }
        
}
