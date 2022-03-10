# POO-Java  <img align="center" alt="Joao-Csharp" height="50" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg">

Estudos sobre progamação orientados a objetos utilizando java, realizada no curso de Engenharia de Software 

## **Variaveis**
Variáveis são contêineres para armazenar valores de dados
```
String- armazena texto como mais de um caracter
int- armazena números inteiros
float- armazena números de ponto flutuante
char- armazena caracteres únicos
boolean- armazena valores com dois estados: verdadeiro ou falso
```

## **if else**
Usado para realizar condiçoes no codigo  
```
if (condição) {
  // Ação caso a condição for verdadeira
} else if(condição){
  // Ação caso a primeira condição for falsa e essa verdadeira
}else {
  // Ação caso todas as condiçoes anteriores forem falsas
}
```

Operador ternário usando quando se deseja atribuir um valor a uma variável dependendo de uma condição ou seja substitui o if else 
```
condição ? ação casso a condição e verdadeira : ação casso a condição e falsa ;
}
```

Tipos de condiçoes
```
Menor que: a < b
Menor ou igual: a <= b
Maior que: a > b
Maior ou igual: a >= b
igual: a == b
Diferente de: a != b
```

## **Switch**
Usando switch podera cirar case que se forem igual a expresão realizam uma ação
```
switch(expression) {
  case x:
    // Executar ação
    break;
  case y:
    // Executar ação
    break;
  default:
    // Executar ação
}
```

## **For loop**
Usando como estutura de repetição, podemos definir quantas vezes será repetido
```
for (int i = 0; i < 6; i++) {
  // Ação que vai repetir
}
```

## **While loop**
Usando como estutura de repetição que se repete quando a condição for verdadeira
```
while (condição) {
  // Bloco de codigo 
}
```
Do while, ele executa pelo menos uma vez e verifica a condição
```
do {
  // Bloco de codigo
}
while (condição);
```

## **Entrada de dados**
Para realizar uma entrada de dados você prescisa importar a biblioteca java.util.Scanner 
```
import java.util.Scanner;

Scanner teclado = new Scanner (System.in);

byte b = teclado.nextByte ();

short s = teclado.nextShort ();

int i = teclado.nextInt ();

long l = teclado.nextLong ();

float f = teclado.nextFloat ();

double d = teclado.nextDouble ();

String texto = teclado.nextLine ();
 int i
}
```

## **Classe e objetos**
Uma forma de criar um objeto e pela criando uma class
```
// ex:
public class Funcionario {
    int idade;
    int cpf;
    float salario;
    String nome;
}
```

O construtor tem o mesmo nome da class e serve para criar o objeto
```
// ex:

public class Funcionario {
    int idade;
    int cpf;
    float salario;
    String nome;

    Funcionario(int idade, int cpf, float salario, String nome){
        this.idade = idade;
        this.cpf = cpf;
        this.salario = salario;
        this.nome = nome;
    }
}
```

## **Operador ternário**
Tipos de array
```
// Array primitivos 
byte[] arrayBytes;
short[] arrayShorts;
long[] arrayLongs;
float[] arrayFloat;
double[] arrauDouble;
boolean[] arrayBooleans;
char[] arrayChars;

// Array referencia
String[] arrayNomes;
Cliente[] arrayCliente;

// Array multidimensionais
int[][] matriz;
String[][] nomes;
}
```






