package EdificioApartamentos;

public class TestaEdificioApartamento {
    static void main(String[] args){
        Edificio ed1 = new Edificio("Pontal do Sauípe", "Rua João Fonseca dos Santos - 60");

        ed1.criaApartamento(153, 15);
        ed1.criaApartamento(69, 6);

        System.out.println(ed1.toString());
    }
}
