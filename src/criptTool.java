
import java.util.HashMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author william
 */
public class criptTool {
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
        return reducirPolinomiosGenericosGF2(result);
    }
    public String multiplicarArrayPolinomiosGenericos(String[] polinomios)
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
     private String reducirPolinomiosGenericosGF2(String polinomio)
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
      private int getHashCode(String monomio)
     {
         int result=0;
         String[] aItemsMonomio=monomio.split("\\*");
         for(String itemsMonomio:aItemsMonomio)
         {
             result+=((!itemsMonomio.equals(""))?itemsMonomio.hashCode():0);
         }
         return result;
     }
}
