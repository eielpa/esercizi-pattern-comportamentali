public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();


        // Test completo
        System.out.println("Insert a coin");
        vendingMachine.insertCoin();     // Inserisce una moneta
        vendingMachine.selectProduct();  // Seleziona un prodotto
        vendingMachine.dispense();       // Eroga il prodotto
        vendingMachine.complete();       // Finalizza le operazioni

        System.out.println("\n--- Nuovo ciclo ---\n");

        vendingMachine.selectProduct();  // Prova a selezionare senza moneta
        vendingMachine.insertCoin();     // Inserisce una moneta
        vendingMachine.cancel();         // Annulla l'operazione
    }
}