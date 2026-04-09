package br.com.fiap.main;

import br.com.fiap.bean.DespesaFamiliar;

import java.util.Scanner;

public class Main {
    //rm572019 Miguel Silva
    public static void main(String[] args) {
    //instanciação
        Scanner scan = new Scanner(System.in);
        DespesaFamiliar despesa = new DespesaFamiliar();
        // parte do print da entrada
        System.out.printf("Digite o valor da renda familiar: ");
        despesa.rendaFamiliar = scan. nextDouble();
        System.out.printf("Digite o número de moradores: ");
        despesa.numeroDeMoradores = scan. nextInt();
        System.out.printf("Digite o valor da despesa de luz: ");
        despesa.gastoComLuz = scan. nextDouble();
        System.out.printf("Digite o valor da despesa de água: ");
        despesa.gastoComAgua = scan. nextDouble();
        System.out.printf("Digite o valor da despesa da internet: ");
        despesa.gastoComInternet = scan. nextDouble();
        System.out.printf("Digite o valor da despesa da mensalidade da academia: ");
        despesa.valorMensalidadeDaAcademia = scan. nextDouble();
        //parte do print das respostas
        System.out.printf("\nA renda familiar é: R$ %.3f\nO número de moradores é: %d\nO valor da despesa de luz é: R$ %.3f\nO valor da despesa de agua é: R$ %.3f\nO valor da despesa da internet é: R$ %.3f\nO valor da despesa da mensalidade da academia é: R$ %.3f\n", despesa.rendaFamiliar, despesa.numeroDeMoradores, despesa.gastoComLuz, despesa.gastoComAgua, despesa.gastoComInternet, despesa.valorMensalidadeDaAcademia);
        double total = despesa.calcularTotalDeDespesas();
        double rendaLiquida = despesa.calcularRendaFamiliarLiquida();
        System.out.printf("Total de despesas: R$ %.3f\n", total);
        System.out.printf("Renda Familiar Líquida: R$ %.3f\n", rendaLiquida );




    }

}
