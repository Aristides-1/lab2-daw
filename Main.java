public class Main {
    public static void main(String[] args) {
        Calculator calculadora = new Calculator();
        int a = 6;
        int b = 4;
        System.out.printf("La suma de %d + %d = %d\n",a,b, calculadora.add(a, b));
        System.out.printf("La resta de %d - %d = %d\n",a,b, calculadora.sub(a, b));
        System.out.printf("La multiplicación de %d * %d = %d\n",a,b, calculadora.mul(a, b));
        System.out.printf("La división de %d / %d = %d\n",a,b, calculadora.div(a, b));
        System.out.printf("El módulo de %d y %d = %d\n",a,b, calculadora.mod(a, b));
    }
}
