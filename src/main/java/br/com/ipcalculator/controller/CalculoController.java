package br.com.ipcalculator.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.ipcalculator.services.CalculoService;


@RestController
@RequestMapping("/api")
public class CalculoController {
    
    @Autowired
    private CalculoService calculoService;

    @GetMapping("/teste")
    public HttpStatus home() {
        return HttpStatus.OK;
    }

    @PostMapping("/calcular")
    public ResponseEntity recebeIp(@RequestBody Map<String, String> payload) {
        return new ResponseEntity<>(calculoService.validarDadosRecebidos(payload), HttpStatus.OK);
    }

    
}