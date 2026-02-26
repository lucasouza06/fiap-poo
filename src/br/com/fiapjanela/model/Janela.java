package br.com.fiapjanela.model;

public class Janela {
    // Atributos que você já tinha
    public String material;
    public String acabamento;
    public double altura;
    public double largura;

    // NOVOS Atributos (Estado)
    public boolean estaAberta; // Começa como false (fechada) por padrão
    public boolean temCadeado; // Se for true, impede de abrir

    // MÉTODO ABRIR
    public void abrir() {
        if (temCadeado == true) {
            System.out.println("Erro: Não é possível abrir. A janela está com cadeado!");
        } else {
            estaAberta = true;
            System.out.println("A janela foi aberta com sucesso.");
        }
    }

    // MÉTODO FECHAR
    public void fechar() {
        estaAberta = false;
        System.out.println("A janela foi fechada.");
    }
}
