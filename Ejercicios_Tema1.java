public class Ejercicios_Tema1{
public static void main(String args[]){
//Ej1

// variables = dias en un año, minutos en hora, segundo minuto

int dias_anio = 365;
int minutos_hora = 60;
int segundo_minutos = 60;

//Numero de segundos de un año almacenar en otra variable
int segundo_anio = dias_anio * 24 * minutos_hora * segundo_minutos;
System.out.println("los segundos de un año son --> " + segundo_anio);

//funcion parametros(años,meses,dias) --> segundos de parametros recibidos
int segundo = Ejercicios_Tema1.dameSegundos(0,0,1);
System.out.println(segundo);

//Ej 2

// Programa muestra mayor entero representable por char,short e int

//Ej 3

// Calcula multiplos de 5 entre 1 y 100
int i = 1;
int contador = 0;
int [] multiplos_5 = new int[100];
while(i <= 100){

    if (i%5 == 0){
        
        multiplos_5[contador] = i;
        contador++;
    }

    i++;
}

//Cuantos hay y visulaizalos(arrays)

int numero_multiplos5 = contador;
System.out.println("Numero de primos:" + numero_multiplos5 + "Son:");
for(i=0 ; i <= contador ; i++){
    System.out.println(multiplos_5[i]);
    }

//Funcion reciba (numeros entre) --> array contenga los multiplos de 5 dentro parametros
int[] multiplos_1_50 = contador_multiplos(50, 1);

//funcion recorra un array y devuelve suma(funcion utilice la longitud real de los multiplos)

int suma_multiplos_50 = suma_array(multiplos_1_50);
System.out.println(suma_multiplos_50);

//Ej 4

// Programa calcule maximo y minimos lista numeros por usuario
//finaliza con un negativo

//introducir valores y guardarlos en array
//funcion maximo 
//funcion minimo

}

public static int dameSegundos(int dias,int meses,int anios){

    dias = dias * 60 * 60;
    meses = meses * 30 * 24 * 60 * 60;
    anios = anios * 365 * 24 * 60 * 60;
    int sum = dias + meses + anios; 
    return (sum);

    }

public static int[] contador_multiplos (int max,int min){

    int i = min;
int contador = 0;
int [] multiplos_5 = new int[max];
while(i <= max){

    if (i%5 == 0){
        
        multiplos_5[contador] = i;
        contador++;
    }

    i++;
}

//Copinadolo en un array de tamaño real
int [] multiplos_5return = new int[contador];
for (i = 0; i<= contador-1; i++){
    multiplos_5return[i] = multiplos_5[i];
}
//imprimimos por pantalla
int numero_multiplos5 = contador;
System.out.println("Numero de primos: " + numero_multiplos5 + "  Son:");
for(i=0 ; i <= contador-1 ; i++){
    System.out.println(multiplos_5return[i]);
    }

return(multiplos_5return);

}


public static int suma_array(int[] myArray){
    int i = 0;
    int sum = 0;
    for(i=0;i<=myArray.length-1;i++){

        sum = sum + myArray[i];
    }
    return sum;
}
}


