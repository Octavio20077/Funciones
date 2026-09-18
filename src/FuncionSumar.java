public class FuncionSumar {
    //definimos la funcion sumar
    static int sumar(int a, int b ){
        int resultado = a + b;
        return resultado;
    }



    public static void main(String[] args) {
    int arg1 = 3, arg2 = 8;
    int resultado_funcion = sumar(arg1, arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);
    }

}
