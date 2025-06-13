//trabalho realizado em dupla por Gustavo Murai e Igor Murai

public class Main {
    public static void main(String[] args) {
        
        Data data1 = new Data();
        System.out.println("Formato 1: " + data1.mostra1());
        System.out.println("Formato 2: " + data1.mostra2());
        System.out.println("É bissexto? " + data1.bissexto());
        System.out.println("Dias transcorridos: " + data1.diasTranscorridos());
        data1.apresentaDataAtual();

        System.out.println("\n---\n");

        
        Data data2 = new Data(15, 6, 2024);
        System.out.println("Formato 1: " + data2.mostra1());
        System.out.println("Formato 2: " + data2.mostra2());
        System.out.println("É bissexto? " + data2.bissexto());
        System.out.println("Dias transcorridos: " + data2.diasTranscorridos());
        data2.apresentaDataAtual();
    }
}
