package br.com.ipcalculator.utils;

import java.util.ArrayList;
import java.util.List;

import br.com.ipcalculator.model.Ip;

public class IpUtils {

    public static List<String> convertToBinary(Ip ip) {
        List<String> ipBinary = new ArrayList<>();
        ip.getDecimals().forEach(session -> ipBinary.add(Integer.toBinaryString(session)));
        return ipBinary;
    }

}
