package br.com.ipcalculator.utils;

import java.util.Arrays;

import br.com.ipcalculator.enums.IP_ENUM;
import br.com.ipcalculator.model.Ip;

public class IpUtils {

    private static int classCounter = 0;

    public static String validateIpClass(Ip ip) {
        String [] maskOctets = ip.getMask().split("\\.");
        String result = null;
        
        Arrays.asList(maskOctets).forEach(octet ->  {
            if(octet.equals("255")) {
                classCounter++;
            }
        });

        switch(classCounter) {
            case 1:
                System.out.println("IP de classe A");
                result = IP_ENUM.CLASSE_A.getDescricao();
                break;
            case 2:
                System.out.println("IP de classe B");
                result = IP_ENUM.CLASSE_B.getDescricao();
                break;
            case 3:
                System.out.println("IP de classe C");
                result = IP_ENUM.CLASSE_C.getDescricao();
                break;
            default:
                throw new RuntimeException("Não foi possível identificar a classe do IP");
        }
        classCounter = 0;
        return result;
    }

}
