//This program was made by Rafael Leon Estrada, September 2018
package estrada.leon.rafael.calculadora;

public class Conversiones {
    public Conversiones(){

    }
    public String setDecOct(int Dec){
        String binary="";
        String binario="";
        int cos=0;
        int res=0;
        if(Dec<=7){
            binary=String.valueOf(Dec);
        }
        else{
            while (Dec/8>=1)
            {
                cos=(int)(Dec/8);
                res=(int)(Dec%8);
                Dec=cos;
                binario=binario+res;
            }
            res=(int)(Dec%8);
            binario=binario+res;
            for (int x=binario.length()-1;x>=0;x--){
                binary=binary+String.valueOf(binario.charAt(x));
            }
        }


        return binary;
    }
    public String setOctDec(String Oct){
        int z=Oct.length(),y=0,a,ind,mul;
        String resultado="";
        int result=0;
        if(Integer.parseInt(Oct)<=7){
            resultado=Oct;
        }
        else{
            for (int x=z-1;x>=0;x--){
                a=(int)Math.pow(8,y);
                ind=Integer.parseInt(String.valueOf(Oct.charAt(x)));
                mul=a*ind;
                result+=mul;
                y++;

            }
            resultado=String.valueOf(result);
        }

        return resultado;
    }
    public int setBinDec(String binario){
        int x=0,z=binario.length(),y=0,resultado=0,contador=1;
        for (x=z;x>0;x--){
            if(binario.substring(binario.length()-contador,binario.length()-y).equals("1")){
                resultado= resultado+(int)Math.pow(2, y);
            }
            y++;
            contador++;
        }
        return resultado;
    }

    public String setDecBin (Double numero){
        String binary="";
        String binario="";
        int cos;
        int res=0;
        while (numero/2>=1)
        {
            cos=(int)(numero/2);
            res=(int)(numero%2);
            numero=Double.valueOf(cos);
            binario=binario+res;
        }
        res=(int)(numero%2);
        binario=binario+res;
        for (int x=binario.length()-1;x>=0;x--){
            binary=binary+binario.charAt(x);
        }
        return binary;
    }

    public String setBinOct(String Bin){
        Bin=String.valueOf(setBinDec(Bin));
        Bin=setDecOct(Integer.parseInt(Bin));
        return Bin;
    }

    public String setOctBin(String Oct){
        Oct=setOctDec(Oct);
        Oct=setDecBin(Double.valueOf(Oct));
        return Oct;
    }

    public String setHexDec(String Hex){
        int x=0,z=Hex.length(),y=0,resultado=0,contador=1,potencia=0,num=0;
        for (x=z;x>0;x--){
            potencia=(int)Math.pow(16, y);
            if (String.valueOf(Hex.charAt(x-1)).equals("A")){
                num=10*potencia;
                resultado=resultado+num;
            }
            else if (String.valueOf(Hex.charAt(x-1)).equals("B")){
                num=11*potencia;
                resultado=resultado+num;
            }
            else if (String.valueOf(Hex.charAt(x-1)).equals("C")){
                num=12*potencia;
                resultado=resultado+num;
            }
            else if (String.valueOf(Hex.charAt(x-1)).equals("D")){
                num=13*potencia;
                resultado=resultado+num;
            }
            else if (String.valueOf(Hex.charAt(x-1)).equals("E")){
                num=14*potencia;
                resultado=resultado+num;
            }
            else if (String.valueOf(Hex.charAt(x-1)).equals("F")){
                num=15*potencia;
                resultado=resultado+num;
            }
            else{
                num=(Integer.parseInt(String.valueOf(Hex.charAt(x-1))))*potencia;
                resultado=resultado+num;
            }
            y++;
            contador++;
        }
        return String.valueOf(resultado);
    }

    public String setHexOct(String Hex){
        Hex=setHexDec(Hex);
        Hex=setDecOct(Integer.parseInt(Hex));
        return Hex;
    }
    public String setHexBin(String Hex){
        Hex=setHexDec(Hex);
        Hex=setDecBin(Double.valueOf(Hex));
        return Hex;
    }
    public String setDecHex(Double Dec){
        String result="";
        String resultado="";
        int cos;
        int res=0;
        while (Dec/16>=1)
        {
            cos=(int)(Dec/16);
            res=(int)(Dec%16);
            Dec=Double.valueOf(cos);
            if(res==10.0){
                resultado="A"+resultado;
            }
            else if(res==11.0){
                resultado="B"+resultado;}
            else if(res==12.0){
                resultado="C"+resultado;}
            else if(res==13.0){
                resultado="D"+resultado;}
            else if(res==14.0){
                resultado="E"+resultado;}
            else if(res==15.0){
                resultado="F"+resultado;}
            else
                resultado=res+resultado;
        }
        res=(int)(Dec%16);

        if(res==10.0){
            resultado="A"+resultado;
        }
        else if(res==11.0){
            resultado="B"+resultado;}
        else if(res==12.0){
            resultado="C"+resultado;}
        else if(res==13.0){
            resultado="D"+resultado;}
        else if(res==14.0){
            resultado="E"+resultado;}
        else if(res==15.0){
            resultado="F"+resultado;}
        else
            resultado=res+resultado;
        for (int x=resultado.length()-1;x>=0;x--){
            result=resultado.charAt(x)+result;
        }
        return result;
    }

    public Double Factorial(Double number){
        for (Double x=number;x>=2.0;x--){
            number=number*(x-1);
        }
        return number;
    }
    public String setOctHex(String Oct){
        Oct=setOctDec(Oct);
        Oct=setDecHex(Double.valueOf(Oct));
        return Oct;
    }
    public String setBinHex(String Bin){
        Bin=String.valueOf(setBinDec(Bin));
        Bin=setDecHex(Double.valueOf(Bin));
        return Bin;
    }


    public String elevar(Double num,int potencia){
        Double numero=num;
        for(int x=1;x<potencia;x++){
            num*=numero;
        }
        return String.valueOf(num);
    }

    public String porcentaje(Double num,Double percent){
        return String.valueOf(num*Double.valueOf(percent)/100.0);
    }

    public String elevarCuadrado(Double num){
        num=num*num;
        return String.valueOf(num);

    }
}
