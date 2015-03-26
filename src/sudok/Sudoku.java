package sudok;

import java.awt.Color;

public class Sudoku {

    

    MiSudoku msud;
    MetodosRequeridos mr;
    public Sudoku() {
        msud = new MiSudoku(this);
        mr= new MetodosRequeridos(this);
        msud.setVisible(true);
        mr.crearSudoku();
        mr.cargarMatriz();
        
        msud.setLocationRelativeTo(null);
        msud.setTitle("Sudoku");
  
    }

    public static void main(String[] args) {
        new Sudoku();
    }

}
