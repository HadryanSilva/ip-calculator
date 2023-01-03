package br.com.ipcalculator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ip {
    private String ipNumbers;
    private List<Integer> ipDecimals;
    private String mask;

    public Ip() {}

    public Ip(String ipNumbers, String mask) {
        this.ipNumbers = ipNumbers;
        this.mask = mask;
    }

    public String getIpNumbers() {
        return ipNumbers;
    }

    public void setIpNumbers(String ipNumbers) {
        this.ipNumbers = ipNumbers;
    }

    public List<Integer> getDecimals() {
        final String[] ipOctets = ipNumbers.split("\\.");
        ipDecimals = new ArrayList<>();
        Arrays.asList(ipOctets).forEach(octet -> ipDecimals.add(Integer.parseInt(octet)));
        return ipDecimals;
    }

    public void setDecimals(List<Integer> ipDecimals) {
        this.ipDecimals = ipDecimals;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
    
}
