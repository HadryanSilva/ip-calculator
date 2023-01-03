package br.com.ipcalculator.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import br.com.ipcalculator.model.Ip;
import br.com.ipcalculator.utils.IpUtils;

@Service
public class CalculoService {    

    public Ip validarDadosRecebidos(Map<String, String> payload) {
        String adress = payload.get("ip");
        String mask = payload.get("mask");
        Ip ip = new Ip(adress, mask);
        ip.setMaskBinarie(convertToBinary(mask));
        ip.setClasse(IpUtils.validateIpClass(ip));

        return ip;

        //System.out.println(ip + "\nMascara Binaria: " + maskBinarieString);
    }

    private String convertToBinary(String mask) {
        String [] maskOctets = mask.split("\\.");
        List<Integer> maskOctetsDecimal = new ArrayList<>();
        Arrays.asList(maskOctets).forEach(octet -> maskOctetsDecimal.add(Integer.parseInt(octet)));
        return tratarConversaoDecimal(maskOctetsDecimal);
    }

    private String tratarConversaoDecimal(List<Integer> maskOctetsDecimal) {
        List<String> maskOctetsBinarie = new ArrayList<>();
        maskOctetsDecimal.forEach(octet -> maskOctetsBinarie.add(Integer.toBinaryString(octet)));

        StringBuilder sb = new StringBuilder();

        maskOctetsBinarie.forEach(octet -> sb.append(octet + "."));
        sb.deleteCharAt(sb.length() - 1);
        return sb.toString();
    }
    
}
