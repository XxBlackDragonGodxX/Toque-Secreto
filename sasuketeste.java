public class sasuketeste {

 public static void main(String[] args) {
  // Definindo o tamanho da matriz
  int linhas = 5;
  int colunas = 5;

  // Criando a matriz com espaços vazios
  char[][] matriz = new char[linhas][colunas];

  // Preenchendo a matriz com espaços
  for (int i = 0; i < linhas; i++) {
   for (int j = 0; j < colunas; j++) {
    matriz[i][j] = ' ';
   }
  }

  // Colocando a palavra "LINO" na linha do meio (índice 2)
  String palavra = "LINO";
  for (int i = 0; i < palavra.length(); i++) {
   matriz[2][i] = palavra.charAt(i);
  }

  // Exibindo a matriz
  for (int i = 0; i < linhas; i++) {
   for (int j = 0; j < colunas; j++) {
    System.out.print(matriz[i][j] + " ");
   }
   System.out.println();
  }
 }
}

























































