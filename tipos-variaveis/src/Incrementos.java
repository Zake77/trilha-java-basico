public record Incrementos() {
    
    public static void main(String[] args) {
        
        int numero = 5;
        numero++;

        System.out.println(numero ++);
        System.out.println(numero);
        System.out.println(-- numero);
        /*incrementos */

        boolean variavel = true;
        System.out.println(variavel);
        System.out.println(!variavel);

        variavel = !variavel;
        System.out.println(variavel);
    }
}
