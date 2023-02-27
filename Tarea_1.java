importar java.util.Scanner;
principal de clase pública{
    public static void main(String[] args){
        Scanner teclado=nuevo Scanner(System.in);
        System.out.println("Introduce tu Nombre, Profesión y País: ");
        String entrada=teclado.nextLine();
        String[]salida=entrada.split(" ");
        System.out.println("Nombre:"+salida[0].toUpperCase());
        System.out.println("Profesión:"+salida[1].toUpperCase());
        System.out.println("País:"+salida[2].toUpperCase());
        }
        }