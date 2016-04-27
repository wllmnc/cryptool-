/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utileria.Maple;

import com.maplesoft.externalcall.MapleException;
import com.maplesoft.openmaple.Algebraic;
import com.maplesoft.openmaple.Engine;
import com.maplesoft.openmaple.EngineCallBacksDefault;

/**
 *
 * @author EndUser
 */
public class HerramientaMaple {
    private final String mapleArgs[] = new String[]{"java"};
    static Engine engine;

    public HerramientaMaple() throws MapleException {
        if(engine==null){
        String mapleArgs[] = new String[1];
        mapleArgs[0] = "java";
        engine = new Engine( mapleArgs, new EngineCallBacksDefault(), null, null );
        }else
        {
            engine.stop();
            engine=null;
        }
    }
    
    /**Funcion que regresa el objeto Algebraic de com.maplesoft.openMaple de una
     * consulta especificada en @param queryAMaple, para cada consulta a Maple
     * se debe tener al final un ";"
     * @param queryAMaple Query a realizar con maple
     * @return Regresa el valor Alebraic del query realizado a maple
     * @throws com.maplesoft.externalcall.MapleException*/
    public static Algebraic regresaAlgebraic(String queryAMaple) throws MapleException{
        Algebraic alg = HerramientaMaple.engine.evaluate(queryAMaple);
        return alg;
    }
      public static Algebraic regresaAlgebraic(String queryAMaple,HerramientaMaple mapleEngine) throws MapleException{
        Algebraic alg = mapleEngine.engine.evaluate(queryAMaple);
        return alg;
    }
    public static void closeEngine() throws MapleException
    {
        engine.stop();
        engine=null;
    }
    /**Funcion que convierte un numero en decimal a binario, indicandole cual es 
     * la longitud deseada del numero en binario
     * @param numero Numero decimal a transformar en binario
     * @param numeroDeLongitud numero que la longitud del numero binario debe tener
     * @return cadena con el numero en binario con la longitud indicada
     * @throws com.maplesoft.externalcall.MapleException
     **/
    public static String convertirDecimalABinario(double numero, int numeroDeLongitud) throws MapleException{
        String numeroValor = String.valueOf(numero);
        numeroValor = numeroValor.substring(0, numeroValor.indexOf("."));
        Algebraic alg = HerramientaMaple.regresaAlgebraic("convert(" + numeroValor + ",binary);");
        String val = alg.toString().replace('.',' ').trim();
            if(val.length() < numeroDeLongitud){
                int n = numeroDeLongitud - val.length();
                String repeated = new String(new char[n]).replace('\0', '0');
                val = repeated + val;
            }
        return val;
    }
}
