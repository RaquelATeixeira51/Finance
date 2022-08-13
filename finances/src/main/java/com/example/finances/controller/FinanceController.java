package com.example.finances.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.finances.entities.FinanceD;
import com.example.finances.entities.FinanceR;
import com.example.finances.repository.FinanceRepository;

@RestController
@RequestMapping(value = "/financeiro")
public class FinanceController {

    @Autowired
    private FinanceRepository financeRepository;

    @GetMapping("/init")
    public String init(){
        return String.format("Bem vindo ao seu controle de despesas, seu saldo atual é de %.2f", financeRepository.getSaldo());
    }

    @GetMapping("/allDespesas")
    public List<FinanceD> getHistoryD(){
        return financeRepository.getHistoryD();
    }

    @GetMapping("/allReceitas")
    public List<FinanceR> getHistoryR(){
        return financeRepository.getHistoryR();
    }

    @GetMapping("/saldo")
    public double saldo(){
        return financeRepository.getSaldo();
    }

    @GetMapping("/getDespesaByNome")
    public FinanceD despesaByNome(String nome){
        return financeRepository.getFinanceDByName(nome);
    }

    @GetMapping("/getReceitaByNome")
    public FinanceR receitaByNome(String nome){
        return financeRepository.getFinanceRByName(nome);
    }

    @PostMapping("/addDespesa")
    public FinanceD addFinanceD(@RequestBody FinanceD fd){
        financeRepository.addDespesa(fd);
        return fd;
    }

    @PostMapping("/addReceita")
    public FinanceR addFinanceR(@RequestBody FinanceR fr){
        financeRepository.addReceita(fr);
        return fr;
    }

    @PutMapping("/updateDespesa")
    public FinanceD updFinanceD(@RequestBody FinanceD fd){
        financeRepository.updateFinanceD(fd);
        return fd;
    }

    @PutMapping("/updateReceita")
    public FinanceR updFinanceR(@RequestBody FinanceR fr){
        financeRepository.updateFinanceR(fr);
        return fr;
    }

    @DeleteMapping("/removeDespesa")
    public void removeD(@RequestBody FinanceD fd){
        financeRepository.removeD(fd);
    }

    @DeleteMapping("/removeReceita")
    public void removeR(@RequestBody FinanceR fr){
        financeRepository.removeR(fr);
    }
}
