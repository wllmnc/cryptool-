/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BooleanFunctionsTT;
import com.maplesoft.externalcall.*;
import com.maplesoft.openmaple.Algebraic;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utileria.Maple.HerramientaMaple;

/**
 *
 * @author wllmNunez
 */
public class Aniquiladores2
{
    /**
     * @param args the command line arguments
     */
    private int n34;
    public Aniquiladores2(){
    
    }
    /*publicAniquiladores2s(int n_)
    {
        n34=n_;
    }*/
    /*
    public static void main(String[] args) throws MapleException {
        // TODO code application logic here
        new HerramientaMaple();
        int n=7;
        int d=1;
      Aniquiladores2es an=nAniquiladores2res();
        booleanFunctions ventana=new booleanFunctions();
        
        ventana.show();
        
//System.out.println(an.xor("001","010101"));//010100
        //System.out.print(an.getPolinomio(new int[]{0,0,0}));
        
        /*walsh       
        String ref="0011";
        double[] WalshS=an.Walsh(n, ref);
        System.out.print("WS("+n+","+ref+")=["); 
        for(int i=0;i<WalshS.length;i++){
            System.out.print(WalshS[i]+","); 
       }
        System.out.println("]");
        
            /*walsh        */
        /*
        
        String[] functionG=an.getGenericFuction(n,d);
        
       for(int i=functionG.length-1;i>0;i--){
            System.out.print(functionG[i]+" + "); 
       }
       System.out.println(functionG[0]); 
       System.out.println(functionG.length);
        //String[] result=an.evaluateThao(new int[]{1,1,0,1,1},functionG,false);
       
        */    
        /*
        an.getGenericFuction(16,16);
        System.out.println(an.multiplicarArrayPolinomiosGenericosGF2(new String[]{"g1*x2*x3+x2*x4","x1*x6","x2+x5"}));//x1*x2*x3*x6+x2*x1*x6(x2+x5)=x1*x2*x3*x6+x2*x1*x6+x1*x2*x3*x6*x5+x2*x1*x6*x5
        System.out.println(an.reducirPolinomiosGenericosGF2(an.multiplicarArrayPolinomiosGenericosGF2(new String[]{"x1*x2*x3+x2*x3","x1*x6","x2+x5"})));
        //System.out.println("\nhashCode \nx1x2x3x4="+an.getHashCode("x1*x2*x3*x4")+"\nx3x4x1x2="+an.getHashCode("x3*x4*x1*x2"));
        System.out.println("\nTabla de verdad");
       String f="11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111";
       List<int[]> trueTable=an.getTrueTable(n);
                //"11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111"
       List<int []> OnSet=an.getListIntOnSet(f); 
       
       String FNA="";//=an.getFNA(OnSet);
       //System.out.println("funcion f="+f+" FNA(f)= \n"+FNA);
       
        double n2=7.0;
        System.out.println("\nMetodo de Creacion de funciones Techo "+Math.ceil(n2/2.0));
        String f1= an.getFunctionPrueba(n2,Math.ceil(n2/2.0));
        List<int[]> trueTable2=an.getTrueTable((int)n2);
        OnSet=an.getListIntOnSet(f1); 
        //FNA=an.getFNA(OnSet);
        System.out.println("funcion wt(f)="+f1.length()+"/"+an.wt(f1)+" f="+f1+" FNA(f)= \n"+FNA);
        
         System.out.println("\nMetodo de Creacion de funciones Piso "+Math.floor(n2/2.0));
        f1= an.getFunctionPrueba(n2,Math.floor(n2/2.0));
        OnSet=an.getListIntOnSet(f1);
        //FNA=an.getFNA(OnSet);
        System.out.println("funcion wt(f)="+f1.length()+"/"+an.wt(f1)+" f="+f1+" FNA(f)= \n"+FNA);
        
        */
        /*
        String funcion;
        int nFuncionNueva=5;//wt(x):==:2||wt(x):>:3&&
        
        List<String> APolinomioGenerico=an.getGenericFuction(nFuncionNueva,(int)Math.floor(nFuncionNueva/2.0));
        funcion=an.createBooleanFunction(nFuncionNueva,"xx1:2","");   
        List<List> OnSet=an.getListIntOnSet(funcion);
        List<List> OnSetFplus1=an.getListIntOnSet(funcion,true);
        List<String> aThaos=an.getListTrueTable(nFuncionNueva);
        List<int[]> aIThaos=an.getTrueTable(nFuncionNueva);
        System.out.println("Funcion nueva");
        int cont=0;
        for(String sThao:aThaos)
        {
            System.out.println(sThao+" "+an.wt(sThao)+" "+funcion.charAt(cont));
            cont++;
        }
        System.out.println("wt(f)= "+an.wt(funcion)+"/"+funcion.length());
        List<Integer> spectro=an.computingWalshSpectra(funcion);
        System.out.println("Espectro de walsh ");
        for(int i=0;i<spectro.size();i++)
        {
             System.out.print(spectro.get(i)+", ");
        }
        System.out.println("\nNL(f)= "+ an.getNL(spectro));
        //System.out.println("Es Balanceada:"+((an.isBalanced(funcion))?"Si":"No"));
        System.out.println("Es Balanceada:"+((an.isBalanced(spectro))?"Si":"No"));
        System.out.println("Es Simetrica:"+((an.isSimetricFunction(funcion,aThaos))?"Si":"No"));
        
        long timeIni=System.currentTimeMillis();
        String sFNA=an.getFNA(funcion);
        long timeEnd=System.currentTimeMillis();
        System.out.println("Tiempo que tomo sFNA1:"+(timeEnd-timeIni));
        
        timeIni=System.currentTimeMillis();
        sFNA=an.getFNA2(funcion);
        timeEnd=System.currentTimeMillis();
        System.out.println("Tiempo que tomo sFNA2:"+(timeEnd-timeIni));
        
        System.out.println("Grado Algebraico de f:"+ an.getAlgebraicDegree(sFNA)+"\nFNA="+sFNA);
        
        
        int nTemp=(int)((Math.log(funcion.length())/Math.log(2)));
        List<int[]> intArrayTrueTable=an.getTrueTable(nTemp);
        HashMap hmTahoFuncion=new HashMap();
        for(int i=0;i<aThaos.size();i++)
        {
            String fv=funcion.substring(i,i+1);
           if(fv.equals("1")){
            hmTahoFuncion.put(aThaos.get(i),Integer.parseInt(fv));
           }
        }
        List<Integer> coeffientCorrelation=new ArrayList();//int[intArrayTrueTable.length];
        
        for(int i=0;i<intArrayTrueTable.size();i++)
        {
            int[] u=intArrayTrueTable.get(i);
            coeffientCorrelation.add(an.autoCorrelationCoeffient(u,funcion,aIThaos,hmTahoFuncion));
            System.out.println(i);
        }
        System.out.println("Coeficientes de autocorrelacion");
         for(int i=0;i<coeffientCorrelation.size();i++)
        {
           System.out.print(coeffientCorrelation.get(i)+", ");
        }
        System.out.println("\nindicador absoluto de f "+an.getMaxVAIntArray(coeffientCorrelation));
        try {
            boolean haveAnhilator=an.aniquilador(OnSet, APolinomioGenerico,nFuncionNueva);
             System.out.println("\ntiene f aniquilador? "+haveAnhilator);
             if(!haveAnhilator){
                 haveAnhilator=an.aniquilador(OnSetFplus1, APolinomioGenerico,nFuncionNueva);
                System.out.println("\ntiene f+1 aniquilador? "+haveAnhilator);
             }
            /*String a[];
            Engine t;
            int i;
            a = new String[1];
            a[0] = "java";
            try
            {
            t = new Engine( a, new EngineCallBacksDefault(), null, null );
            t.evaluate( "int( x,x );" );
            }
            catch ( MapleException e )
            {
            System.out.println( "An exception occurred\n" );
            return;
            }
            System.out.println( "Done\n" );*/
            //String[] APolinomioGenerico=getGenericFuction(grado,grado);
            /*
            System.out.println("\nSistema De ecuaciones");
            List<String []> SysEcuations=an.getEcuacionesG(OnSet,APolinomioGenerico,nFuncionNueva);
            String Solve="solve({";
            for(int i=0;i<SysEcuations.size();i++)
            {
            System.out.print("eq"+i+":="+SysEcuations.get(i)[0]);
            for(int j=1;j<SysEcuations.get(i).length;j++)
            {
            System.out.print("+"+SysEcuations.get(i)[j]); 
            }
            Solve+="eq"+i+"=0,";
            System.out.println(";"); 
            }
            String variables="";
            for(int i=1;i<APolinomioGenerico.size();i++)
            {
            variables+="a"+i+",";
            }
            variables+="a0";
            Solve+="},{"+variables+"});";
            System.out.println(Solve);
            */
    /*
        } catch (MapleException ex) {
            Logger.getLogAniquiladores2ores.class.getName()).log(Level.SEVERE, null, ex);
        }
                
    }
    */
    public boolean aniquilador(List<List> OnSet,List<String> APolinomioGenerico,int grado) throws MapleException
    {
        new HerramientaMaple();
        boolean result=false;
        //System.out.println("\nSistema De ecuaciones");
        String systemEquations="";
        List<String []> SysEcuations=getEcuacionesG(OnSet,APolinomioGenerico,grado);
        String Solve="solve({";
        for(int i=0;i<SysEcuations.size();i++)
        {
            systemEquations+="eq"+i+":="+SysEcuations.get(i)[0]; 
            for(int j=1;j<SysEcuations.get(i).length;j++)
            {
                systemEquations+="+"+SysEcuations.get(i)[j];
            }
            Solve+="eq"+i+"=0,";
            systemEquations+=";";
        }
        Solve=Solve.substring(0,Solve.length()-1);
        String variables="";
        for(int i=1;i<APolinomioGenerico.size();i++)
        {
            variables+="a"+i+",";
        }
        variables+="a0";
        Solve+="},{"+variables+"});";
        systemEquations+=Solve;
        System.out.println(systemEquations);

        Algebraic alg=HerramientaMaple.regresaAlgebraic(systemEquations);
        String resultMaple=alg.toString();
        if(!resultMaple.equals("")){
        String[] aString=resultMaple.split("= 0");
        
        //String cadena="{a0 = 0, a1 = 0, a10 = 0, a11 = 0, a12 = 0, a13 = 0, a14 = 0, a15 = 0, a2 = 0, a3 = 0, a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0, a9 = 0}";
        //aString=cadena.split("= 0");
        //System.out.println((APolinomioGenerico.size())+"/"+aString.length+"\n"+alg.toString());
        result= (APolinomioGenerico.size()==aString.length-1);
        }else{
            result=false;
        }
        return result;
    }
     public int getAlgebraicDegree(String FNA)
    {
        int result=0;
        String[] APolinomio=FNA.split("[+]");
        if(APolinomio.length>0){
            for(int i=0;i<1;i++)
            {
                String TerminoMayor=APolinomio[i];
                if(!TerminoMayor.equals("0")||!TerminoMayor.equals("1"))
                {
                  String[] terminos=TerminoMayor.split("x");
                  result=terminos.length;
                }
            }
        }
        return result;
    }
    /*
    public int getAlgebraicDegree(String funcion)
    {
        int result;
        int nTemp=(int)((Math.log(funcion.length())/Math.log(2)));
        //int[][] trueTable=getTrueTable(nTemp);
        List<int[]> onSet=getListIntOnSet(funcion);
        result=getAD(nTemp,onSet);
        return result;
    }
    */
    private List<int[]> getListInteger(List<String> ListString)
    {
        List<int[]> result=new ArrayList(ListString.size());
        for(String sThao:ListString)
        {
            //result.add(sThao.split("|"));
        }
        return result;
    }
    public String getFNA(String funcion)
    {
        String result;
        int nTemp=(int)((Math.log(funcion.length())/Math.log(2)));
        //int[][] trueTable=getTrueTable(nTemp); 
        List<List> onSet=getListIntOnSet(funcion);
        result=getFNA(nTemp,onSet);
        return result;
    }
    
    public String getFNA(String funcion, int degree,List<List> onSet,javax.swing.JProgressBar proggresbar, double incremento, int valueinicial)
    {
        String result=getFNA(degree,onSet);
        return result;
    }
     public String getFNA2(String funcion)
    {
        String result;
        int nTemp=(int)((Math.log(funcion.length())/Math.log(2)));
        //int[][] trueTable=getTrueTable(nTemp);
        List<List> onSet=getListIntOnSet(funcion);
        result=getFNA(nTemp,onSet);
        return result;
    }
    public String createBooleanFunction(int nVariables,String condiciones1, String condicionesNo)
    {
        List<String> lsttrueTable=getListTrueTable(nVariables);
        boolean orValue;
        boolean andValue; 
        String result="";
        for(String sThao: lsttrueTable)
        {
            int wtThao=wt(sThao);
            //for(int i=0;i<sThao.length();i++)
            //{
                String[] aCondicionesOr=condiciones1.split("\\|\\|");
                orValue=false;
                for(String sCondicionesOr:aCondicionesOr)
                {
                    String[] aCondicionesAnd=sCondicionesOr.split("&&");
                    andValue=true;
                    for(String condicion: aCondicionesAnd)
                    {
                        String[] aArgumentos=condicion.split(":");
                        switch( aArgumentos[0] )
                        {
                            case "wt(x)":
                                    switch( aArgumentos[1] )
                                    {
                                        case ">":
                                            andValue=andValue&&(wtThao>Integer.parseInt(aArgumentos[2]));
                                            break;
                                        case "<":
                                            andValue=andValue&&(wtThao<Integer.parseInt(aArgumentos[2]));
                                            break;
                                        case ">=":
                                            andValue=andValue&&(wtThao>=Integer.parseInt(aArgumentos[2]));
                                            break;
                                        case "<=":
                                            andValue=andValue&&(wtThao<=Integer.parseInt(aArgumentos[2]));
                                            break;
                                        default:
                                            andValue=andValue&&(wtThao==Integer.parseInt(aArgumentos[2]));
                                            break;
                                    }
                                break;
                            case "xi":
                                    int valorRef;
                                    boolean resultOperation;
                                    switch( aArgumentos[1] )
                                    {
                                        case ">":
                                            valorRef=Integer.parseInt(aArgumentos[2]);
                                            valorRef=((valorRef<=sThao.length())?valorRef:sThao.length());
                                            resultOperation=(valorRef<sThao.length());
                                            for(int i=valorRef;i<sThao.length();i++)
                                            {
                                                if(!sThao.substring(i, i+1).equals(aArgumentos[3]))
                                                {
                                                    resultOperation=false;
                                                    i=sThao.length();
                                                }
                                            }
                                            andValue=andValue&&resultOperation;
                                            break;
                                        case "<":
                                            valorRef=Integer.parseInt(aArgumentos[2]);
                                            valorRef=((valorRef<=sThao.length())?valorRef:sThao.length());
                                            resultOperation=(valorRef>1);
                                            for(int i=0;i<valorRef-1;i++)
                                            {
                                                if(!sThao.substring(i, i+1).equals(aArgumentos[3]))
                                                {
                                                    resultOperation=false;
                                                    i=sThao.length();
                                                }
                                            }
                                            andValue=andValue&&resultOperation;
                                            break;
                                        case ">=":
                                            valorRef=Integer.parseInt(aArgumentos[2]);
                                            resultOperation=(valorRef<=sThao.length());
                                            //valorRef=((valorRef<=sThao.length())?valorRef:sThao.length());
                                            for(int i=valorRef-1;i<sThao.length();i++)
                                            {
                                                if(!sThao.substring(i, i+1).equals(aArgumentos[3]))
                                                {
                                                    resultOperation=false;
                                                    i=sThao.length();
                                                }
                                            }
                                            andValue=andValue&&resultOperation;
                                            break;
                                        case "<=":
                                            valorRef=Integer.parseInt(aArgumentos[2]);
                                            resultOperation=(valorRef>0);
                                            //valorRef=((valorRef<=sThao.length())?valorRef:sThao.length());
                                            for(int i=0;i<valorRef;i++)
                                            {
                                                if(!sThao.substring(i, i+1).equals(aArgumentos[3]))
                                                {
                                                    resultOperation=false;
                                                    i=sThao.length();
                                                }
                                            }
                                            andValue=andValue&&resultOperation;
                                            break;
                                        default:
                                            resultOperation=false;
                                            valorRef=Integer.parseInt(aArgumentos[2]);
                                            if(valorRef<=sThao.length()){
                                            resultOperation=true;
                                            int i=valorRef-1;
                                                if(!sThao.substring(i, i+1).equals(aArgumentos[3]))
                                                {
                                                    resultOperation=false;
                                                    //i=sThao.length();
                                                }
                                            }
                                            andValue=andValue&&resultOperation;
                                            break;
                                    }
                                break;
                            case "xx1":
                                String sTemp="";
                                int nLimit=Integer.parseInt(aArgumentos[1]);
                                for(int i=0;i<nLimit;i++)
                                {
                                    sTemp+="1";
                                }
                                andValue=(sThao.contains(sTemp));
                                break;
                            case "xx0":
                                String sTemp0="";
                                int nLimit0=Integer.parseInt(aArgumentos[1]);
                                for(int i=0;i<nLimit0;i++)
                                {
                                    sTemp0+="0";
                                }
                                andValue=(!sThao.contains(sTemp0));
                                break;
                        }
                       if(!andValue)
                       {
                           break;
                       }

                    }
                    orValue=orValue||andValue;
                }
            //}
            result+=((orValue)?"1":"0");
        }
        
        /*
                String[] aSubCondicionesOr=sSubCondicionesOr.split("\\|");
                for(String sSubCondicionesAnd:aSubCondicionesOr)
                {
                    String[] aSubCondicionesAnd=sSubCondicionesAnd.split("&");
                    aSubCondicionesAnd=aSubCondicionesAnd;
                }
        */
        return result;
    }
    public String getBInary(int value,int nVariables)
    {
        //String result="";
        return Integer.toBinaryString(value);
        //return result;
    }
    public int autoCorrelationCoeffient(int[] u, String f, List<int[]> ListTrueTable, HashMap<String,Integer> hsThaoFuncion)
    {
        int result=0;
        for(int i=0;i<ListTrueTable.size();i++)
        {
            int[] x=ListTrueTable.get(i);
            int[] xor=xor(u,x);
            String xorT=intArrayToString(xor);
            //int indexOfXorValue= ListTrueTable.indexOf(xorT);
            int potencia=Integer.parseInt(f.substring(i,i+1))+((hsThaoFuncion.containsKey(xorT))?1:0);
            result+=Math.pow(-1,potencia);
        }
        return result;
    }
    public int autoCorrelationCoeffient(String u, String f, List<String> ListTrueTable, HashMap<String,Integer> hsThaoFuncion)
    {
        int result=0;
        for(int i=0;i<ListTrueTable.size();i++)
        {
            String x=ListTrueTable.get(i);
            String xor=xor(u,x);
            //String xorT=intArrayToString(xor);
            //int indexOfXorValue= ListTrueTable.indexOf(xorT);
            int potencia=Integer.parseInt(f.substring(i,i+1))+((hsThaoFuncion.containsKey(xor))?1:0);
            result+=Math.pow(-1,potencia);
        }
        return result;
    }
     public double getNL(String function)
    {
        double result;
        List<Integer> walshSpectra=computingWalshSpectra(function);
        int whMax=getMaxVAIntArray(walshSpectra);
        double nTemp=Math.log(walshSpectra.size())/Math.log(2);
        result=(Math.pow(2,nTemp)-whMax)/2;
        return result;
    }
    public double getNL(List<Integer> walshSpectra)
    {
        double result;
        int whMax=getMaxVAIntArray(walshSpectra);
        double nTemp=Math.log(walshSpectra.size())/Math.log(2);
        result=(Math.pow(2,nTemp)-whMax)/2;
        return result;
    }
    public boolean isBalanced(String funcion)
    {
        int contUnos=0;
        for(int i=0;i<funcion.length();i++)
        {
            if(funcion.charAt(i)=='1')contUnos++;
        }
        return (funcion.length()/2==contUnos);
    }
    public boolean isBalanced(List<Integer> WalshSpectra)
    {
        return (WalshSpectra.get(0)==0);
    }
    public int getMaxVAIntArray(List<Integer> intArray)
    {
        int result=0;
        int numTemp;
        for(int i=0;i<intArray.size();i++)
        {
            numTemp=Math.abs(intArray.get(i));
            if(numTemp>result)result=numTemp;
        }
        return result;
    }
    public int wt(String f)
    {
        int iWt=0;
        for(int i=0;i<f.length();i++)
        {
            if(f.charAt(i)=='1')iWt++;
        }
        return iWt;
    }
    public String getFunctionPrueba(double dN, double d)
    {
        String result="";
        int nTemp=(int)dN;
        for(int[] Thaos:getTrueTable(nTemp))
        {
            int cont=0;
            for(int j=0;j<Thaos.length;j++)
            {
                if(Thaos[j]==1)cont++;
            }
            result+=(cont>=d)?"1":"0";
        }
        return result;
    }
    public List<Integer> computingWalshSpectra(String function)
    {
        List<Integer> aTransformada=new ArrayList();
        for(int i=0;i<function.length();i++)
        {
            aTransformada.add((function.charAt(i)=='1')?-1:1);
        }
        List<Integer> resultTemp= computingWalshSpectra(aTransformada,2);
        return resultTemp;
    }
    public List<Integer> computingWalshSpectra(List<Integer> atransformWalshSpectra,int index, int n)
    {
       int aumento=n/2;
       int limite=(index+aumento);
       for(int i=index;i<limite;i++)
       {
           int a=atransformWalshSpectra.get(i) + atransformWalshSpectra.get(i+aumento);
           int b=atransformWalshSpectra.get(i) - atransformWalshSpectra.get(i+aumento);
           atransformWalshSpectra.set(i,a);
           atransformWalshSpectra.set(i+aumento,b);
       }
        if(n!=atransformWalshSpectra.size())
        {
                if(index==(atransformWalshSpectra.size()-n))
                {
                   n=n*2;
                   index=0;
                   atransformWalshSpectra=computingWalshSpectra(atransformWalshSpectra,index,n);
                }else{
                      atransformWalshSpectra=computingWalshSpectra(atransformWalshSpectra,index+n,n);
                      }
        }
        return atransformWalshSpectra;
    }
    public List<Integer> computingWalshSpectra(List<Integer> atransformWalshSpectra, int n)
    {
        int aumento=n/2;
        for(int j=0;j<atransformWalshSpectra.size();j+=n){
            int limite=(j+aumento);
            for(int i=j;i<limite;i++)
            {
                int a=atransformWalshSpectra.get(i) + atransformWalshSpectra.get(i+aumento);
                int b=atransformWalshSpectra.get(i) - atransformWalshSpectra.get(i+aumento);
                atransformWalshSpectra.set(i,a);
                atransformWalshSpectra.set(i+aumento,b);
            }
        }
        if(n!=atransformWalshSpectra.size())
        {
            atransformWalshSpectra=computingWalshSpectra(atransformWalshSpectra,n*2);
        }
        return atransformWalshSpectra;
    }
    public String getFNA(int grado,List<List> onSet)
    {
        String result="";
        for(List<Integer> thao:onSet)
        {
            result="+"+result+"+"+getPolinomy(thao,grado); 
            result=reducirF2(result.substring(1, result.length()));
            //System.out.println(i+"/"+onSet.size());
        }
       
        result=ordenarGF2(grado,result);
        return result;
    }
    public String getFNA(int grado,List<List> onSet,javax.swing.JProgressBar proggresbar, double incremento, int valueinicial)
    {
        String result="";
        for(List<Integer> thao:onSet)
        {
            result="+"+result+"+"+getPolinomy(thao,grado); 
            result=reducirF2(result.substring(1, result.length()));
            //System.out.println(i+"/"+onSet.size());
            proggresbar.setValue(valueinicial+(int)incremento);
        }
       
        result=ordenarGF2(grado,result);
        return result;
    }
     public String getFNA2(int grado,List<List> onSet)
    {
        String result="";
        for(int i=0;i<onSet.size();i++)
        {
            result="+"+result+"+"+getPolinomy(onSet.get(i),grado);
        }
        result=reducirF2(result.substring(1, result.length()));
        result=ordenarGF2(grado,result);
        return result;
    }
    public int getAgebraicDeegre(int grado,List<List> onSet)
    {
        int result;
        String resultTemp="";
        for(int i=0;i<onSet.size();i++)
        {
            resultTemp+="+"+getPolinomy(onSet.get(i),grado); 
                  }
        result=reducirF2Degree(grado,resultTemp.substring(1, resultTemp.length()));
        return result;
    }
    public String getPolinomy(List<Integer> thao, int grado)
    {
        String result;
        String[] repoTemP= new String[grado];
        for(int i=grado-1;i>=grado-thao.size();i--)
        {
            repoTemP[i]="x"+(i+1) + ((thao.get(i-(grado-thao.size()))==0)? "+1": "");
        }
        for(int i=grado-thao.size()-1;i>=0;i--)
        {
            repoTemP[i]="x"+(i+1) + "+1";
        }
        result=multiplicarArrayPolinomios(repoTemP);
        return result;
    }
    public boolean isSimetricFunction(int grado,String funcion)
    {
        boolean result=true;
        List<String> lWThaos= getListTrueTable(grado);
        List<Integer> wtThaos= new ArrayList();
        for(String sThao:lWThaos)
        {
            wtThaos.add(wt(sThao));
        }
        HashMap hashT=new HashMap();
        for(int i=0;i<lWThaos.size();i++)
        {
            int wThao=wtThaos.get(i);
            if(hashT.containsKey(wThao))
            {
              int valueOld=(int)hashT.get(wThao);
              if(valueOld!=(int)(funcion.charAt(i)))
              {
                  result=false;
                  i=lWThaos.size();
              }
            }else{
                    hashT.put(wThao,(int)(funcion.charAt(i)));
                    }
        }
        return result;
    }
    public boolean isSimetricFunction(String funcion, List<String> lThao)
    {
        boolean result=true;
        List<Integer> lWThaos=new ArrayList();
        for(String sThao:lThao)
        {
            lWThaos.add(wt(sThao));
        }
        HashMap hashT=new HashMap();
        for(int i=0;i<lWThaos.size();i++)
        {
            int wThao=lWThaos.get(i);
            if(hashT.containsKey(wThao))
            {
              int valueOld=(int)hashT.get(wThao);
              if(valueOld!=(int)(funcion.charAt(i)))
              {
                  result=false;
                  i=lWThaos.size();
              }
            }else{
                    hashT.put(wThao,(int)(funcion.charAt(i)));
                    }
        }
        return result;
    }
    public String multiplicarArrayPolinomios(String[] polinomios)
    {
        String result="";
        String termA=polinomios[0];
        for(int i=1;i<polinomios.length;i++)
        {
            result="";
            String[] ATermA=termA.split("[+]");
            String[] ATermB=polinomios[i].split("[+]");
            for(String termJ:ATermA)
            {
             if(!termJ.equals("")){   
                if(!termJ.equals("1")){
                    for(String termB:ATermB)
                    {
                        if(!termB.equals("")){
                        result+="+"+((termB.equals("1"))?termJ:termJ+""+termB);
                         }
                    }
                }else{
                    for(String poliTerm:ATermB)
                    {
                         if(!poliTerm.equals("")){
                          result+="+"+poliTerm;
                         }
                    }   
                }
                }
            }
            termA=result.substring(1, result.length());
        }
        result=result.substring(1, result.length());
        return result;
    }
    public String multiplicarArrayPolinomiosGenericosGF2(String[] polinomios)
    {
        String result="";
        String termA=polinomios[0];
        for(int i=1;i<polinomios.length;i++)
        {
            result="";
            String[] ATermA=termA.split("[+]");
            String[] ATermB=polinomios[i].split("[+]");
            for(String termJ:ATermA)
            {
             if(!termJ.equals("")){   
                if(!termJ.equals("1")){
                    for(String termB:ATermB)
                    {
                        if(!termB.equals("")){
                            String[] aItemsTB=termB.split("\\*");
                            String resultMult=termJ;
                            for(String itemTb:aItemsTB)
                            {
                                if(!termJ.contains(itemTb))
                                {
                                    resultMult+=((itemTb.equals("1"))?"":"*"+itemTb);
                                }
                            }
                            
                            result+="+"+resultMult;
                         }
                    }
                }else{
                    for(String poliTerm:ATermB)
                    {
                         if(!poliTerm.equals("")){
                          result+="+"+poliTerm;
                         }
                    }   
                }
                }
            }
            termA=result.substring(1, result.length());
        }
        result=result.substring(1, result.length());
        return result;
    }
     public String reducirPolinomiosGenericosGF2(String polinomio)
    {
        String result="+";
        String[] APolinomio=polinomio.split("[+]");
        HashMap listMonomios=new HashMap();
        HashMap listHashCode=new HashMap();
        for(String sElement:APolinomio)
        {
            int hashcode=getHashCode(sElement);
            if(listHashCode.containsKey(hashcode))
            {
                    listHashCode.remove(hashcode);                
            }else{
                listHashCode.put( hashcode, 1);
                listMonomios.put(hashcode,sElement);
                    }
        }
        Object[] aKeys=listHashCode.keySet().toArray();
        for(Object oKey:aKeys)
        {
            int key=(int)oKey;
            result+=listMonomios.get(key);
        }
        result=result.substring(1);
       //Object[] sKeys=listMonomios.keySet().toArray();
        return (result.equals(""))?"0\n":result+"\n";
    }
     public int getHashCode(String monomio)
     {
         int result=0;
         String[] aItemsMonomio=monomio.split("\\*");
         for(String itemsMonomio:aItemsMonomio)
         {
             result+=((!itemsMonomio.equals(""))?itemsMonomio.hashCode():0);
         }
         return result;
     }
    public String reducirF2Temp(int grado,String polinomio)
    {
        String result="";
        String[] APolinomio=polinomio.split("[+]");
        HashMap listMonomios=new HashMap();
        for(String sElement:APolinomio)
        {
            if(listMonomios.containsKey(sElement))
            {
                listMonomios.put( sElement, (Integer.parseInt(listMonomios.get(sElement).toString())+1));
            }else{
                listMonomios.put( sElement, 1);
                    }
        }
       List<String> APolinomioGenerico=getGenericFuction(grado,grado);
       for(int i=APolinomioGenerico.size()-1;i>1;i--)
        {
           String key=APolinomioGenerico.get(i);
           if(listMonomios.containsKey(key)){
                int value=Integer.parseInt(listMonomios.get(key)+"");
                if(value%2!=0)
                {
                    result+="1\t";
                }
           }else{
               result+="0\t";
                 }
        }
        result+=((listMonomios.containsKey("1"))?"1\t":"0\t");
        //result=result.substring(2, result.length());
        return result+"\n";
    }
    public String reducirF2(String polinomio)
    {
        String result="";
        String[] APolinomio=polinomio.split("[+]");
        HashMap<String,Integer> listMonomios=new HashMap();
        for(String sElement:APolinomio)
        {
            if(listMonomios.containsKey(sElement))
            {
                listMonomios.remove(sElement);
            }else{
                listMonomios.put( sElement, 1);
                    }
        }
       for(String key:listMonomios.keySet())
       {
           result+="+"+key;
       }
       result=result.substring(1, result.length());
       return result;
    }
    public String ordenarGF2(int grado,String polinomio)
    {
        String result="";
        String[] APolinomio=polinomio.split("[+]");
        HashMap listMonomios=new HashMap();
        for(String sElement:APolinomio)
        {
                listMonomios.put( sElement, 1);
        }
        List<String> APolinomioGenerico=getGenericFuction(grado,grado);
        for(int i=APolinomioGenerico.size()-1;i>0;i--)
        {
                String key=APolinomioGenerico.get(i);
                if(listMonomios.containsKey(key)){
                        result+=key+"+";
                }
        }
       if(listMonomios.containsKey("1")){
            result+="1";
       }else{
           if(!result.equals(""))result=result.substring(0, result.length()-1);
       }
        return result;
    }
    public int reducirF2Degree(int grado,String polinomio)
    {
        int result=0;
        String[] APolinomio=polinomio.split("[+]");
        HashMap listMonomios=new HashMap();
        for(String sElement:APolinomio)
        {
            if(listMonomios.containsKey(sElement))
            {
                listMonomios.put( sElement, (Integer.parseInt(listMonomios.get(sElement).toString())+1));
            }else{
                listMonomios.put( sElement, 1);
                    }
        }
       List<String> APolinomioGenerico=getGenericFuction(grado,grado);
       for(int i=APolinomioGenerico.size()-1;i>0;i--)
        {
                String key=APolinomioGenerico.get(i);
                if(listMonomios.containsKey(key)){
                    int value=Integer.parseInt(listMonomios.get(key)+"");
                    if(value%2!=0)
                    {
                        String subKey=key.replace("x","");
                        result=subKey.length();
                        i=0;
                    }
                }
        }
        return result;
    }
    public List getEcuacionesG(List<List> onSet,List<String> functionGeneric, int grado)
    {
        List result = new ArrayList();
        for(List<Integer> thao:onSet)
        {
            result.add(evaluateThao(thao,functionGeneric,grado));
        }
        return result;
    }
    public List<List> getListIntOnSet(String function)
    {
         List<List> result = new ArrayList();
         for(int i=0;i<function.length();i++)
         {
             char item=function.charAt(i);
             if(item=='1')
             {
                     String binaryValue=Integer.toBinaryString(i);
                     List<Integer> resultTemp = new ArrayList(binaryValue.length());
                     for(int j=0;j<binaryValue.length();j++)
                     {
                         resultTemp.add(Integer.parseInt(binaryValue.substring(j, j+1)));
                     }
                     result.add(resultTemp);
             }
         }
         return result;
    }
    public List<List> getListIntOnSet(String function, boolean isFpuls1)
    {
         List<List> result = new ArrayList();
         if(!isFpuls1){
         for(int i=0;i<function.length();i++)
         {
             char item=function.charAt(i);
             
             if(item=='1')
             {
                     String binaryValue=Integer.toBinaryString(i);
                     List<Integer> resultTemp = new ArrayList(binaryValue.length());
                     for(int j=0;j<binaryValue.length();j++)
                     {
                         resultTemp.add(Integer.parseInt(binaryValue.substring(j, j+1)));
                     }
                     result.add(resultTemp);
             }
         }
         }else{
                for(int i=0;i<function.length();i++)
                {
                    char item=function.charAt(i);

                    if(item=='0')
                    {
                            String binaryValue=Integer.toBinaryString(i);
                            List<Integer> resultTemp = new ArrayList(binaryValue.length());
                            for(int j=0;j<binaryValue.length();j++)
                            {
                                resultTemp.add(Integer.parseInt(binaryValue.substring(j, j+1)));
                            }
                            result.add(resultTemp);
                    }
                }
               }
         return result;
    }
    public List<String> getListStringOnSet(String function)
    {
         List<String> result = new ArrayList();
         for(int i=0;i<function.length();i++)
         {
             char item=function.charAt(i);
             if(item=='1')
             {
                     result.add(Integer.toBinaryString(i));
             }
         }
         return result;
    }
    public List<int[]> getTrueTable(int n)
    {
        List<int[]> result=new ArrayList();
       
        for(int i=0;i<Math.pow(2,n);i++)
        {
            String binaryValue=Integer.toBinaryString(i);
            int[] resultTemp = new int[binaryValue.length()];
            for(int j=0;j<binaryValue.length();j++)
            {
                 resultTemp[j]=Integer.parseInt(binaryValue.substring(j, j+1));
            }
            result.add(resultTemp);
        }
        
        /*
        int sizeTable=(int)Math.pow(2,n);
        int[][] result=new int[sizeTable][n];
        int cicloItem=sizeTable/2;
        for(int i=0;i<n;i++)
        {
            int numItem=0;
            int valueItem=0;
            for(int j=0;j<sizeTable;j++)
            {
                if(numItem>=cicloItem)
                {
                    valueItem=(valueItem+1)%2;
                    numItem=0;
                }
                result[j][i]=valueItem;
                numItem++;
            }
            cicloItem=cicloItem/2;
        }*/
        return result;
    }
    public List<String> getListTrueTable(int n)
    {
        List resultTemp = new ArrayList();
        for(int i=0;i<Math.pow(2,n);i++)
        {
            resultTemp.add(Integer.toBinaryString(i));
        }
        /*
        int sizeTable=(int)Math.pow(2,n);
        int[][] result=new int[sizeTable][n];
        int cicloItem=sizeTable/2;
        for(int i=0;i<n;i++)
        {
            int numItem=0;
            int valueItem=0;
            for(int j=0;j<sizeTable;j++)
            {
                if(numItem>=cicloItem)
                {
                    valueItem=(valueItem+1)%2;
                    numItem=0;
                }
                result[j][i]=valueItem;
                numItem++;
            }
            cicloItem=cicloItem/2;
        }
        
        for(int[] thao:result)
        {
            String sThao="";
            for(int itemThao:thao)
            {
                sThao+=itemThao;
            }
            resultTemp.add(sThao);
        }
                */
        return resultTemp;
    }
    /**
     * 
     * @param thao
     * @param function
     * @param witha
     * @return String array with the polynomi 
     */
    public String[] evaluateThao(List<Integer> thao,List<String> function, int n)
    {
        String result=function.get(0);
        int cont=1;
        for(String monomio:function)
        {
            if(!monomio.equals("a0"))
            {
                String[] itemsMonomio=monomio.split("x");
                int diferencia=n-thao.size();
                boolean allOne=true;
                for(int j=0;j<itemsMonomio.length;j++)
                {
                    if(!itemsMonomio[j].equals(""))
                    {
                        int index=Integer.parseInt(itemsMonomio[j])-1-diferencia;
                        if(index>=0)
                        {
                            int value=thao.get(index);
                            if(value==0)
                            {
                                allOne=false;
                                j=itemsMonomio.length;
                            }
                        }else{
                             allOne=false;
                             j=itemsMonomio.length;
                        }
                    }
                }
                if(allOne)
                {
                    result+="-a"+cont;
                }
              cont++;  
            }
        }
        return result.split("-");
    }
    public List<String> getGenericFuction(int n, int d)
    {
        int dimencion=0;
        for(int i=0;i<=n;i++)
        {
            if(d>=i)
            {
                int dimenciont=Combinacion(n,i);
                dimencion+=dimenciont;
            }
        }
        List<String> result=new ArrayList(dimencion);
        
        //x1 + x2 + x3 + x4 + x1x2 + x1x3 + x1x4 + x2x3 + x2x4 + x3x4 + x1x2x3 + x1x2x4 + x1x3x4 + x2x3x4 + x1x2x3x4
       result.add("a0");
       int cont=1;
       for(int i=1;i<=d;i++)//monomios de grado i
       { 
           int pasosAtras=Combinacion(n,i-1);//combinacion de n en i de ese grado
           if(i==1)//si son de grado 1
                {
                   for(int j=1;j<=n;j++)
                   {
                    result.add("x"+j);
                    cont++;
                   } 
           }else{//de cualquier otro grado
                    int contI=cont;
                    for(int itemConcat=contI-pasosAtras;itemConcat<contI;itemConcat++){
                        String item=result.get(itemConcat);
                        String[] numerosDeLasX=item.split("x");
                        int lastI=Integer.parseInt(numerosDeLasX[numerosDeLasX.length-1]);
                        for(int p=lastI+1;p<=n;p++)
                        {
                            result.add(item+"x"+p);
                            cont++;
                        }
                    }
                    
                }
                
          
       }

        return result;
    }
    public int Combinacion(int n, int i)
    {
        /*
                int termA=factorial(n);
        int termB=factorial(n-i);
        int termC=factorial(i);
        int result=termA/(termB*termC);
        return result;
                */
        int result=0;
        long temp=1;
        for(int j=n;j>n-i;j--)
        {
            temp*=j;
        }
        long termC=factorial(i);
        result=(int)(temp/termC);
        return result;
    }
    public long factorial(int n)
    {
       return ((n==1 || n==0)?1:n*factorial(n-1));
    }
    public double[] Walsh(int n,String ref)
    {
        double[] result=new double[n+1];
        double limite=Math.floor((n-1)/2);
        double v1,v2,p,q,r;
        for(int k=0;k<limite;k++)
        {
            v1=Math.pow(-1,Double.parseDouble(ref.substring(0,1)))+Math.pow(-1,Double.parseDouble(ref.substring(n,n+1))+k);
            v2=Math.pow(-1,Double.parseDouble(ref.substring(0,1)))+Math.pow(-1,Double.parseDouble(ref.substring(n,n+1))+n-k);
            p=n-(2*k);
            q=1;
            for(int i=0;i<limite;i++)
            {
                v1=v1+(Math.pow(-1,Double.parseDouble(ref.substring(0,1)))+Math.pow(-1,Double.parseDouble(ref.substring(n-i,n-i+1))+k))*p;
                v2=v2+(Math.pow(-1,Double.parseDouble(ref.substring(0,1)))+Math.pow(-1,Double.parseDouble(ref.substring(n-i,n-i+1))+i+n-k))*p;
                r=((n-2+k)*p + (n-i+1)*q)/(i+1);
                q=p;
                p=r;
            }
            if(n%2==0)
            {
                //ejecuta caso de n par
               int i=n/2;
               v1=v1+Math.pow(-1,Double.parseDouble(ref.substring(i,i+1)))*p;
               v2=v2+Math.pow(-1,Double.parseDouble(ref.substring(i,i+1))+i)*p;
            }
            result[k]=v1;
            result[n-k]=v2;
        }
        if(n%2==0)
        {
            int k=n/2;
            v1=Math.pow(-1,Double.parseDouble(ref.substring(0,1)))+Math.pow(-1,Double.parseDouble(ref.substring(n,n+1))+k);
            p=n-2*k;
            q=1;
            for(int i=1;i<limite;i++)
            {
                v1=v1+(Math.pow(-1,Double.parseDouble(ref.substring(i,i+1)))+Math.pow(-1,Double.parseDouble(ref.substring(n-i,n-i+1))+k))*p;
                r=((n-2*k)*p-(n-i+1)*q)/(i+1);
                q=p;
                p=r;
            }
            int i=n/2;
            v1=v1+Math.pow(-1,Double.parseDouble(ref.substring(i,i+1)))*p;
            result[k]=v1;
        }
        return result;
    }
    public int[] xor(int[] a,int[] b)
    {
        int[] result;
        if(a.length!=b.length)
        {
            int[] terminoMayor=(a.length>=b.length)?a:b;
            int[] terminoMenor=(a.length<b.length)?a:b;
            result= new int[terminoMayor.length];
            int limite=terminoMayor.length-terminoMenor.length;
            for(int i=terminoMayor.length-1;i>limite-1;i--)
            {
                result[i]=((terminoMayor[i]==terminoMenor[i-(terminoMayor.length-terminoMenor.length)])?0:1);
            }
            for(int i=terminoMenor.length;i>=0;i--)
            {
                result[i]=(terminoMayor[i]);
            }
        }else{
                result= new int[a.length];
                for(int i=0;i<a.length;i++)
                {
                    result[i]=((a[i]==b[i])?0:1);
                }
              }
        return result;
    }
    public String xor(String a,String b)
    {
        String result="";
        if(a.length()!=b.length())
        {
            String terminoMayor=(a.length()>=b.length())?a:b;
            String terminoMenor=(a.length()<b.length())?a:b;
            result= terminoMayor;
            int limite=terminoMayor.length()-terminoMenor.length();
            String sXorTemp="";
            for(int i=terminoMayor.length()-1;i>limite-1;i--)
            {
                sXorTemp=((terminoMayor.substring(i, i+1).equals(terminoMenor.substring(i-(terminoMayor.length()-terminoMenor.length()),i-(terminoMayor.length()-terminoMenor.length())+1)))?"0":"1")+sXorTemp;
            }
            result=result.substring(0, terminoMenor.length())+sXorTemp;
        }else{
                for(int i=0;i<a.length();i++)
                {
                    result=((a.substring(i, i+1).equals(b.substring(i, i+1)))?"0":"1");
                }
              }
        return result;
    }
    public int[] stringToIntArray(String item)
    {
        int[] result= new int[item.length()];
        for(int i=0;i<item.length();i++)
        {
           result[i]=Integer.parseInt(item.substring(i,i+1));
        }
        return result;
    }
    public String intArrayToString(int[] item)
    {
        String result= "";
        for(int i=0;i<item.length;i++)
        {
           result+=item[i]+"";
        }
        return result;
    }
}