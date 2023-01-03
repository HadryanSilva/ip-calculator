package br.com.ipcalculator.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ipcalculator.model.Ip;
import br.com.ipcalculator.utils.IpUtils;


@RestController
@RequestMapping("/api")
public class CalculoController {

    private Ip ip = new Ip();

    @GetMapping("/teste")
    public HttpStatus home() {
        return HttpStatus.OK;
    }

    @PostMapping("/calcular")
    public void recebeIp(@RequestBody Map<String, String> payload) {
        ip.setIpNumbers(payload.get("ip"));
        ip.setMask(payload.get("mask"));
        IpUtils.convertToBinary(ip);
        IpUtils.validateIpClass(ip);
    }

    
}