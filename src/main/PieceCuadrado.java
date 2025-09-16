public class PieceCuadrado extends Piece {
    public PieceCuadrado() {
        super();
        formas = new int[4][4][4];

        int[][] formaCuadrado = {
            {0,0,0,0},
            {0,1,1,0},
            {0,1,1,0},
            {0,0,0,0}
        };
        // Las orientaciones mantienen la misma forma
    }
}