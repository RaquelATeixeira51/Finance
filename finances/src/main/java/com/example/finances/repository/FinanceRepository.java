package com.example.finances.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.finances.models.ActualFinance;
import com.example.finances.models.FinanceD;
import com.example.finances.models.FinanceR;

@Repository
public class FinanceRepository {
    private List<FinanceD> listD  = new ArrayList<FinanceD>();
    private List<FinanceR> listR = new ArrayList<FinanceR>();

    ActualFinance saldo = new ActualFinance();

    public List<FinanceD> getHistoryD(){
        return listD;
    }

    public List<FinanceR> getHistoryR(){
        return listR;
    }

    public void addDespesa(FinanceD d){
        listD.add(d);
        saldo.setSaldo(saldo.getSaldo() - d.getValorDespesa());
    }

    public void addReceita(FinanceR r){
        listR.add(r);
        saldo.setSaldo(saldo.getSaldo() + r.getValorReceita());
    }

    public double getSaldo(){
        return saldo.getSaldo();
    }

    public FinanceD getFinanceDByName(String nome){
        for(FinanceD financeD : listD){
            if(nome.equals(financeD.getNomeDespesa())){
                return financeD;
            }
        }
        return null;
    }

    public FinanceR getFinanceRByName(String nome){
        for(FinanceR financeR : listR){
            if(nome.equals(financeR.getNomeReceita())){
                return financeR;
            }
        }
        return null;
    }

    public void updateFinanceD(FinanceD fd){
        for(FinanceD financeD : listD){
            if(fd.getNomeDespesa().equals(financeD.getNomeDespesa())){
                listD.set(listD.indexOf(financeD), fd);
                if(fd.getValorDespesa() > financeD.getValorDespesa()){
                    saldo.setSaldo(saldo.getSaldo() - (fd.getValorDespesa() - financeD.getValorDespesa()));
                } else if(fd.getValorDespesa() < fd.getValorDespesa()){
                    saldo.setSaldo(saldo.getSaldo() + (financeD.getValorDespesa() - fd.getValorDespesa()));
                }
            }
        }
    }

    public void updateFinanceR(FinanceR fr){
        for(FinanceR financeR : listR){
            if(fr.getNomeReceita().equals(financeR.getNomeReceita())){
                listR.set(listR.indexOf(financeR), fr);
                if(fr.getValorReceita() > financeR.getValorReceita()){
                    saldo.setSaldo(saldo.getSaldo() - (fr.getValorReceita() - financeR.getValorReceita()));
                } else if(fr.getValorReceita() < financeR.getValorReceita()){
                    saldo.setSaldo(saldo.getSaldo() + (financeR.getValorReceita() - fr.getValorReceita()));
                }
            }
        }
    }
    
    public void removeD(FinanceD fd){
        listD.remove(fd);
        saldo.setSaldo(saldo.getSaldo() + fd.getValorDespesa());
    }

    public void removeR(FinanceR fr){
        listR.remove(fr);
        saldo.setSaldo(saldo.getSaldo() - fr.getValorReceita());
    }

}
