public class Main{

           public static void main(String args[]) {
             Nave n1 = new Nave("maria");
              Nave n2 = new Nave("joao");
              Nave n3 = new Nave();
               Nave n4 = new Nave();
              n3.setVida(250);
               n2 = n1;
               System.out.println("Nome n2: "+n2);
               System.out.println("Nome n2: "+n1);
               if(n1 != n2){
                   System.out.println("diferente");
               }else{
                   System.out.println("somos iguais");
               }
               System.out.println("oooo vida"+ n1.vida);
              n2.trocaVida(n3);
              System.out.println(n2.cont);
              n1.mostraInfo();
              n2.mostraInfo();
         }
 }

