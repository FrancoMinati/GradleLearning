package proyectoimportar;

import com.google.common.base.Strings;
import org.apache.commons.lang3.StringUtils;

public class ClasePrueba {

    public String abreviarCadena(String cadena,int maxWidth){
        if(maxWidth>4 && cadena.length()>maxWidth){
            return StringUtils.abbreviate(cadena,maxWidth);
        }else{
            return "";
        }
    }
}
