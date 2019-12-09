public class Launcher {

    public static void main(String[] args) {
        Figure_printer figure_printer= new Figure_printer();

        figure_printer.printTriangle(6);
        figure_printer.printSlash(3);
        figure_printer.printSquare(5);
        figure_printer.printX(6);
        figure_printer.printRectangle(25,5,'?');

        figure_printer.printTriangle(7, 31, '$');

        int a=5;
        int b=3;

        System.out.println(a/b);
        System.out.println(Math.round(a/b));

        System.out.println((float)a/b); //niejawne rzutowanie do floata zmiennej b
        System.out.println(Math.round((float)a/(float)b));

        figure_printer.printSlash(7, 31, '$');

        figure_printer.printChessBoard(8,8);

        ChristmasTreePrinter ctp= new ChristmasTreePrinter();
        ctp.printChristmasTree();
        ctp.printFilledChristmasTree();

        Graphical_letters gl=new Graphical_letters();

        gl.init();

    }
}
