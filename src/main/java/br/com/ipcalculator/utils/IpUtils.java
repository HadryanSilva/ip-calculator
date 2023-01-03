package br.com.ipcalculator.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.ipcalculator.model.Ip;

public class IpUtils {

    private static int classCounter = 0;

    public static List<String> convertToBinary(Ip ip) {
        List<String> ipBinary = new ArrayList<>();
        ip.getDecimals().forEach(octet -> ipBinary.add(Integer.toBinaryString(octet)));
        return ipBinary;
    }

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
                System.out.println("Class A");
                result = "A";
                break;
            case 2:
                System.out.println("Class B");
                result = "B";
                break;
            case 3:
                System.out.println("Class C");
                result = "C";
                break;
            default:
                throw new RuntimeException("Não foi possível identificar a classe do IP");
        }
        classCounter = 0;
        return "Class: " + result;
    }

}
