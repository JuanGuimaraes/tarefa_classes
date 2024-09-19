public class PrimeiraClasse {
    /**
     * Adicionando os valores as variaveis e imprimindo.
     *
     * @param args
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setCor("Branco");
        System.out.println(carro.getCor());
        carro.setMarca("Ford");
        System.out.println(carro.getMarca());
        carro.setModelo("KA");
        System.out.println(carro.getModelo());
        carro.setVelocidadeMaxima(220);
        System.out.println(carro.getVelocidadeMaxima());
        carro.setPlaca("Teste123");
        System.out.println(carro.getPlaca());

    }
}
