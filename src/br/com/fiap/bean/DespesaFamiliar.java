package br.com.fiap.bean;

public class DespesaFamiliar {
    //rm572019 Miguel Silva
//atributos
    public double rendaFamiliar;
    public int numeroDeMoradores;
    public double gastoComLuz;
    public double gastoComAgua;
    public double gastoComInternet;
    public double valorMensalidadeDaAcademia;
    //metodos
    public double calcularTotalDeDespesas(){
        //calculo 1
        double total;

        total = gastoComLuz + gastoComAgua + gastoComInternet + (valorMensalidadeDaAcademia * numeroDeMoradores);

        return total;
    }
    //metodo 2
    public double calcularRendaFamiliarLiquida(){
        //calculo 2
        double rendaLiquida;
        rendaLiquida = rendaFamiliar - calcularTotalDeDespesas();

        return rendaLiquida;
    }
}
