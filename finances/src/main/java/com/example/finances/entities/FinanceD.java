package com.example.finances.entities;

public class FinanceD{
    private String nomeDespesa;
    private double valorDespesa;
    private String descricao;
    private Categoria categoria;

    public FinanceD() {
    }
    
    public FinanceD(String nomeDespesa, double valorDespesa, String descricao, Categoria categoria) {
        this.nomeDespesa = nomeDespesa;
        this.valorDespesa = valorDespesa;
        this.descricao = descricao;
        this.categoria = categoria;
    }
    public String getNomeDespesa() {
        return nomeDespesa;
    }
    public void setNomeDespesa(String nomeDespesa) {
        this.nomeDespesa = nomeDespesa;
    }
    public double getValorDespesa() {
        return valorDespesa;
    }
    public void setValorDespesa(double valorDespesa) {
        this.valorDespesa = valorDespesa;
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


    @Override
    public String toString() {
        return "FinanceD [categoria=" + categoria + ", descricao=" + descricao + ", nomeDespesa=" + nomeDespesa
                + ", valorDespesa=" + valorDespesa + "]";
    }

   

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((descricao == null) ? 0 : descricao.hashCode());
        result = prime * result + ((nomeDespesa == null) ? 0 : nomeDespesa.hashCode());
        long temp;
        temp = Double.doubleToLongBits(valorDespesa);
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
        FinanceD other = (FinanceD) obj;
        if (categoria != other.categoria)
            return false;
        if (descricao == null) {
            if (other.descricao != null)
                return false;
        } else if (!descricao.equals(other.descricao))
            return false;
        if (nomeDespesa == null) {
            if (other.nomeDespesa != null)
                return false;
        } else if (!nomeDespesa.equals(other.nomeDespesa))
            return false;
        if (Double.doubleToLongBits(valorDespesa) != Double.doubleToLongBits(other.valorDespesa))
            return false;
        return true;
    }

    
}
