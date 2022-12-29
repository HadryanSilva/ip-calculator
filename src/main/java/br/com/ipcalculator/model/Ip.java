package br.com.ipcalculator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ip {
    private String ipNumbers;
    private List<Integer> decimals;

    public Ip() {}

    public Ip(String ipNumbers) {
        this.ipNumbers = ipNumbers;
    }

    public String getIpNumbers() {
        return ipNumbers;
    }

    public void setIpNumbers(String ipNumbers) {
        this.ipNumbers = ipNumbers;
    }

    public List<Integer> getDecimals() {
        String[] ipSessions = getIpNumbers().split("\\.");
        decimals = new ArrayList<>();
        Arrays.asList(ipSessions).forEach(session -> decimals.add(Integer.parseInt(session)));
        return decimals;
    }

    
}
