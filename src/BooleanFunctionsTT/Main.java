/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BooleanFunctionsTT;

import com.maplesoft.externalcall.MapleException;
import utileria.Maple.HerramientaMaple;
import utileria.Maple.HerramientaMaple2;
/**
 *
 * @author william
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws MapleException {
        //HerramientaMaple2 eng = new HerramientaMaple2();
         //new HerramientaMaple();
        // TODO code application logic here
          // TODO code application logic here
       
        //new HerramientaMaple();
         /*int n=7;
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
             */   
        booleanFunctions ventana = new booleanFunctions();
        ventana.show();
    }
    
}
