
package examen.parcial;

import java.util.Scanner;

public class EXAMENPARCIAL {
   
    

    public static void main(String[] args) 
    {        
        Telefono tel = new Telefono();
        Operadores ope=new Operadores();
        String plan;
        Scanner input= new Scanner(System.in);
        System.out.println("-----------TIENDAS AA11-----------\n");
        op();
        String marca=input.nextLine();
        tel.celular(marca);        
        System.out.println("\nSelccione Operador"
                + "\n0: Claro"
                + "\n1: Movistar"
                + "\n2: Entel");
        String operador=input.nextLine();
        switch(operador)
        {
            case "0":
                System.out.println("Selecione Plan"
                        
                + "\n99"
                + "\n139"
                + "\n189");   
                plan=input.nextLine();
                ope.Claro(plan);
                if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
            case "1":
                System.out.println("Selecione Plan"
                        
                + "\n99"
                + "\n139"
                + "\n199");   
                plan=input.nextLine();
                ope.Movistar(plan);                
                if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
            case "2":
                System.out.println("Selecione Plan"
                        
                + "\n29"
                + "\n39"
                + "\n45");   
                plan=input.nextLine();
                ope.Entel(plan);
                
                if(marca.equals("S7")){System.out.println("Precio Total: "+ope.precio+9);}
                else if(marca.equals("H8")){System.out.println("Precio Total: "+ope.precio+1);}
                else{System.out.println("Precio Total: "+ope.precio+49);}
                    break;
        }
    }
    public static void op()
    {
        System.out.println("SELECCIONE TELEFONO CELULAR:"
                + "\nS7: SAMSUNG S7"
                + "\nI6: iPhone 6"
                + "\nH8: Huawei P8"
                + "\nS:  Salir");
    }
    }
 
class Telefono
{
  public String nombre="";
  public String Pantalla="";
  public String Procesador="";
  public String camara="";
    public void celular(String nom)
    { 
    switch(nom)
    {case "S7":
        nombre="Samsung S7";
        Pantalla="4.7 pulgadas";
        Procesador="1.4 GHz";
        camara="8MP";
        System.out.println
                ("\nPantalla: "+Pantalla
                + "\nProcesador: "+Procesador
                + "\nCamara:"+camara
                 + "Precio S/ 9"
                );
        break;
     case "I6":
         nombre="iPhone 6";
         Pantalla="4.7 pulgadas";
        Procesador="1.4 GHz";
        camara="8MP";
        System.out.println
                ("\nPantalla: "+Pantalla
                + "\nProcesador: "+Procesador
                + "\nCamara:"+camara
                 + "Precio S/ 49"
                );
        break;
     case "H8":
         nombre="Huawei P8";
         Pantalla="4.7 pulgadas";
        Procesador="1.4 GHz";
        camara="8MP";
       System.out.println
                ("\nPantalla: "+Pantalla
                + "\nProcesador: "+Procesador
                + "\nCamara:"+camara
                 + "Precio S/ 1"
                );
        break; 
        }
    }
}

class Operadores
{    
    public String plan="";public String Minutos,RPC,Internet,sms;
    public double precio;
 public void Entel(String planes)
 {
     if(planes.equals("29"))
 {
    plan="Chip 29";
    Minutos="200 Minutos";
    RPC="Ilimitados";
    Internet="1 GB";
    sms="500 mensajes";
    precio=29;
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
          
 }
 else if(planes.equals("39"))
 {
    plan="Chip 39";
    Minutos="500 sms";
    RPC="Ilimitados";
    Internet="1.5 GB";
    sms="Ilimitados";
    precio=149;
    
     
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
 }
 else if (planes.equals("45"))
 {
    plan="Chip 45";
    Minutos="500 sms";
    RPC="Ilimitados";
    Internet="2 GB";
    sms="Ilimitados";
    precio=45;
    
     
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
 }
     else {System.out.println("Plan Incorrecto");}  
     
     
 }
 public void Claro(String planes)
 {
 
 if(planes.equals("99"))
 {
    plan="Claro Max 99";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="6 GB";
    sms="Ilimitados";
    precio=99;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
          
 }
 else if(planes.equals("149"))
 {
    plan="Claro Max 149";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="8 GB";
    sms="Ilimitados";
    precio=149;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
 }
 else if (planes.equals("189"))
 {
    plan="Claro Max 189";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="10 GB";
    sms="Ilimitados";
    precio=189;
    
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
 }
 else {System.out.println("Plan Incorrecto");}
     
 }
 public void Movistar(String planes)
 {
     
 if(planes.equals("99"))
 {
    plan="Movistar Play 99";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="5 GB";
    sms="Ilimitados";
    precio=99;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
          
 }
 else if(planes.equals("139"))
 {
    plan="Movistar Play 139";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="8 GB";
    sms="Ilimitados";
    precio=139;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
 }
 else if (planes.equals("199"))
 {
    plan="Movistar Play 199";
    Minutos="Ilimitados";
    RPC="Ilimitados";
    Internet="10 GB";
    sms="Ilimitados";
    precio=199;
    
     System.out.println("\nPlan: "+plan
             + "\nMinutos: "+Minutos
             + "\nRPE: "+RPC
             + "\nInternet: "+Internet
             + "\nSMS: "+sms
             + "\nPrecio S/."+precio);
 }
 else {System.out.println("Plan Incorrecto");}      
 }
 }
    

