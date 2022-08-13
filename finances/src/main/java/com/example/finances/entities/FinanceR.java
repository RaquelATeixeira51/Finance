package com.example.finances.entities;


public class FinanceR {
    private String nomeReceita;
    private double valorReceita;
    private String descricao;
    private Categoria categoria;
    
    public String getNomeReceita() {
        return nomeReceita;
    }
    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }
    public double getValorReceita() {
        return valorReceita;
    }
    public void setValorReceita(double valorReceita) {
        this.valorReceita = valorReceita;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public FinanceR() {
    }
    public FinanceR(String nomeReceita, double valorReceita, String descricao, Categoria categoria) {
        this.nomeReceita = nomeReceita;
        this.valorReceita = valorReceita;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    @Override
    public String toString() {
        return "FinanceR [categoria=" + categoria + ", descricao=" + descricao + ", nomeReceita=" + nomeReceita
                + ", valorReceita=" + valorReceita + "]";
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((nomeReceita == null) ? 0 : nomeReceita.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valorReceita);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FinanceR other = (FinanceR) obj;
        if (categoria != other.categoria)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (nomeReceita == null) {
            if (other.nomeReceita != null)
                return false;
        } else if (!nomeReceita.equals(other.nomeReceita))
            return false;
        if (Double.doubleToLongBits(valorReceita) != Double.doubleToLongBits(other.valorReceita))
            return false;
        return true;
    }

    
}
