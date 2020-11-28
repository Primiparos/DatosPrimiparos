
public class TCola extends TVecDatos {
 
 private int Final;   
 private int Frente; 
 private int Tam;
 private String Datos[];  
 
 public TCola(){
  super();   
  Final=-1;
  Frente=0;
 }

 public void setTam(int N){
  Tam=N; 
  if(Tam>0){
   Datos=new String[Tam];   
  }
  else{
   Datos=null;   
  }
 } 

 public int getTam(){
  return Tam;   
 }
 
 public boolean Vacia(){
  return Final<0;   
 }
 
 public boolean LLena(){
  return Final>=getTam()-1;   
 }
 
 public void Agregar(String Val){
  if(!LLena()){
   Final++;
   Datos[Final]=Val;
  }   
 }
 
 public void Eliminar(){
  int i;   
  if(!Vacia()){
   for(i=1;i<=Final;i++){   
    Datos[i-1]=Datos[i];
   } 
   Datos[Final]="";
   Final--;
  }   
 }
 
 public String ValorFrente(){
  return Datos[Frente];   
 }  
 
 public String ValorFinal(){
  return Datos[Final];   
 } 
 
}
