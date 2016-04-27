/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BooleanFunctionsTT;
import booleantools.AnalisysBF;
import booleantools.fileManagement;
import com.maplesoft.externalcall.*;
import com.maplesoft.openmaple.Algebraic;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import utileria.Maple.HerramientaMaple;

/**
 *
 * @author wllmNunez
 */
public class AnalisysBFLocal extends AnalisysBF
{
    public AnalisysBFLocal(){    
    }
    
    public String getANF(String funcion, int degree,List<List> lstOnSet,javax.swing.JProgressBar proggresbar, double dIncrement, int iInitValue)
    {
        String sResult=getANF(degree,lstOnSet,true);
        return sResult;
    }
    
    public String getANF(int iDegree,List<List> lstOnSet,javax.swing.JProgressBar proggresbar, double dIncrement, int iInitValue)
    {
        String sResult="";
        for(List<Integer> thao:lstOnSet)
        {
            sResult="+"+sResult+"+"+getPolinomy(thao,iDegree); 
            sResult=reduceF2(sResult.substring(1, sResult.length()));
            //System.out.println(i+"/"+lstOnSet.size());
            proggresbar.setValue(iInitValue+(int)dIncrement);
        }
       
        sResult=orderGF2(iDegree,sResult);
        return sResult;
    }
    
    public void saveWalshSpectra(List<Integer> lstWalshSpectra,String sNameFile) throws IOException
    {
        String sContent="";
        for(int value:lstWalshSpectra)
        {
            sContent+=value+",\n";
        }
        fileManagement fmItem=new fileManagement();
        fmItem.saveFile(sNameFile, "", sContent,false);
    }
    
    public void saveEquationsSystemComandsMaple(String sEquationsSystemComandsMaple, String sNameFile) throws IOException
    {
        fileManagement fmItem=new fileManagement();
        String sContent=sEquationsSystemComandsMaple.replaceAll(";",";\n");
        fmItem.saveFile(sNameFile, "", sContent,false);
    }
}