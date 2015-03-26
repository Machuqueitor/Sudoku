package sudok;

import javax.swing.JOptionPane;

public class MetodosRequeridos {

    int matriz[][] = new int[9][9];
    public Sudoku sk;

    public MetodosRequeridos(Sudoku sk) {
        this.sk = sk;
    }

    public void crearSudoku() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = 0;
            }
        }
        matriz[0][4] = 8;
        matriz[1][3] = 3;
        matriz[1][7] = 4;
        matriz[2][0] = 4;
        matriz[2][2] = 9;
        matriz[2][4] = 7;
        matriz[2][6] = 2;
        matriz[2][8] = 6;

        matriz[3][1] = 2;
        matriz[3][5] = 6;
        matriz[4][0] = 5;
        matriz[4][2] = 3;
        matriz[4][6] = 4;
        matriz[4][8] = 8;
        matriz[5][3] = 8;
        matriz[5][7] = 7;

        matriz[6][0] = 6;
        matriz[6][2] = 8;
        matriz[6][4] = 4;
        matriz[6][6] = 5;
        matriz[6][8] = 9;
        matriz[7][1] = 5;
        matriz[7][5] = 3;
        matriz[8][4] = 2;
    }

    public void cargarMatriz() {
        sk.msud.c5.setText(Integer.toString(matriz[0][4]));
        sk.msud.c13.setText(Integer.toString(matriz[1][3]));
        sk.msud.c17.setText(Integer.toString(matriz[1][7]));
        sk.msud.c19.setText(Integer.toString(matriz[2][0]));
        sk.msud.c21.setText(Integer.toString(matriz[2][2]));
        sk.msud.c23.setText(Integer.toString(matriz[2][4]));
        sk.msud.c25.setText(Integer.toString(matriz[2][6]));
        sk.msud.c27.setText(Integer.toString(matriz[2][8]));

        sk.msud.c29.setText(Integer.toString(matriz[3][1]));
        sk.msud.c33.setText(Integer.toString(matriz[3][5]));
        sk.msud.c37.setText(Integer.toString(matriz[4][0]));
        sk.msud.c39.setText(Integer.toString(matriz[4][2]));
        sk.msud.c43.setText(Integer.toString(matriz[4][6]));
        sk.msud.c45.setText(Integer.toString(matriz[4][8]));
        sk.msud.c49.setText(Integer.toString(matriz[5][3]));
        sk.msud.c53.setText(Integer.toString(matriz[5][7]));

        sk.msud.c55.setText(Integer.toString(matriz[6][0]));
        sk.msud.c57.setText(Integer.toString(matriz[6][2]));
        sk.msud.c59.setText(Integer.toString(matriz[6][4]));
        sk.msud.c61.setText(Integer.toString(matriz[6][6]));
        sk.msud.c63.setText(Integer.toString(matriz[6][8]));
        sk.msud.c65.setText(Integer.toString(matriz[7][1]));
        sk.msud.c69.setText(Integer.toString(matriz[7][5]));
        sk.msud.c77.setText(Integer.toString(matriz[8][4]));

    }

    public boolean repetidosFila(int numero, int fila) {
        boolean validar = true;
        for (int i = 0; i < matriz.length; i++) {
            if (numero == matriz[fila][i]) {
                JOptionPane.showMessageDialog(null, "Digito repetido en Fila");

                validar = true;
                break;
            } else {
                validar = false;
            }
        }
        return validar;
    }

    public boolean repetidosColumna(int numero, int columna) {
        boolean validar = true;
        for (int i = 0; i < matriz.length; i++) {
            if (numero == matriz[i][columna]) {
                JOptionPane.showMessageDialog(null, "Digito repetido en columna");
                validar = true;
                break;
            } else {
                validar = false;
            }
        }
        return validar;
    }

    public boolean repetidosCuadrante(int fila, int columna, int elemento) { //Sacado de http://www.dudasprogramacion.com/topic/ayuda-con-sudoku-para-java/

        int subTableroX = 3;
        int subTableroY = 3;

        int cuadroX = fila / subTableroX;     //Busca iniciar en la primera casilla de los distintos subcuadrados
        int cuadroY = columna / subTableroY;  // solo toma la parte entera

        int posIniX = cuadroX * subTableroX;//calculo la posicion inicial del subtablero en la fila
        int posIniY = cuadroY * subTableroY;//posicion inicial del subtablero en la columna
        //recorremos el  subtablero en busca de algun elemento repetido
        for (int h = posIniX; h < posIniX + subTableroX; h++) {
            for (int n = posIniY; n < posIniY + subTableroY; n++) {
                if (matriz[h][n] == elemento) {
                    JOptionPane.showMessageDialog(null, "Digito repetido en cuadrante");
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarFilasColumnas() {

        int contador1 = 0, contador2 = 0;
        for (int j = 0; j < matriz.length; j++) { //verfico filas
            for (int i = 0; i < matriz.length; i++) {
                contador1 += matriz[j][i];// suma filas
                contador2 += matriz[i][j];// suma columnas
            }
            if (contador1 != 49 || contador2 != 49) {
                return true;
            }
        }
        return false;
    }
//

    public boolean verificarCuadrante() {
        //////////////////////////////////////////////
        for (int j = 0; j < matriz.length; j++) { //verifico columnas
            for (int i = 0; i < matriz.length; i++) {
                int x = j / 3;
                int y = i / 3;
                int posIniX = x * 3;//calculo la posicion inicial del subtablero en la fila
                int posIniY = y * 3;//posicion inicial del subtablero en la columna     
                int c = 0;

                for (int h = posIniX; h < posIniX + 3; h++) {
                    for (int n = posIniY; n < posIniY + 3; n++) {
                        c += (matriz[h][n]);
                        if (c != 49) {
                            return true;
                        }

                    }
                }
            }

        }
        return false;
    }
}
