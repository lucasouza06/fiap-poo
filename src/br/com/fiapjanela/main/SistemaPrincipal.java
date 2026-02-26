package br.com.fiapjanela.main;

import br.com.fiapjanela.model.Janela;

public class SistemaPrincipal {

    public static void main(String[] args) {
        // --- Criando a Janela 1 ---
        Janela janela1 = new Janela();
        janela1.material = "Alumínio";
        janela1.acabamento = "Anodização";
        janela1.altura = 40.0;
        janela1.largura = 50.0;
        janela1.temCadeado = true; // Esta janela começa trancada

        // --- Criando a Janela 2 ---
        Janela janela2 = new Janela();
        janela2.material = "PVC";
        janela2.acabamento = "PVC Branco";
        janela2.altura = 60.0;
        janela2.largura = 70.0;
        janela2.temCadeado = false; // Esta janela não tem cadeado

        // Exibindo os dados iniciais no Console 
        System.out.println("--- Sistema FiapJanela ---");
        System.out.println("Material: " + janela1.material + " | Acabamento: " + janela1.acabamento + " | Altura: " + janela1.altura + " cm | Largura: " + janela1.largura + " cm");
        System.out.println("Material: " + janela2.material + " | Acabamento: " + janela2.acabamento + " | Altura: " + janela2.altura + " cm | Largura: " + janela2.largura + " cm");

        System.out.println("\n--- Testando Ações (Métodos) ---");

        // Teste Janela 1 (Com cadeado)
        System.out.print("Tentando abrir janela 1: ");
        janela1.abrir(); 

        // Teste Janela 2 (Sem cadeado)
        System.out.print("Tentando abrir janela 2: ");
        janela2.abrir();

        // Fechando a janela 2
        janela2.fechar();
        
        System.out.println("\nEstado Final - Janela 1 Aberta: " + janela1.estaAberta + " | Janela 2 Aberta: " + janela2.estaAberta);
    }
}
