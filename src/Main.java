//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    int a, b, c, d;
    int resultado;

    a = 2;
    b = 6;
    c = 3;
    resultado = a * b / c;
    System.out.println("Resultado 1: " + resultado);

    a = 3;
    b = 2;
    c = 4;
    resultado = a + b * c;
    System.out.println("Resultado 2: " + resultado);

    a = 3;
    b = 2;
    c = 4;
    resultado = (a + b) * c;
    System.out.println("Resultado 3: " + resultado);

    a = 60;
    b = 3;
    c = 2;
    d = 4;
    resultado = a / (b + c) * d;
    System.out.println("Resultado 4: " + resultado);

    a = 60;
    b = 3;
    c = 2;
    d = 4;
    resultado = a / ((b + c) * d);
    System.out.println("Resultado 5: " + resultado);
}