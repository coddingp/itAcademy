package polymorphism;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        WhiteBoard whiteBoard = new WhiteBoard("Wellcome to IT Academy", 265, "WhiteBoard\n");
        BlackBoard blackBoard = new BlackBoard("Wellcome to IT Academy here", 265, "BlackBoard\n");
        WhiteBoard whiteBoard2 = new WhiteBoard("Wellcome to IT Academy again", 265, "WhiteBoard\n");

        System.out.println(whiteBoard);
        whiteBoard.write();

        System.out.println(whiteBoard2);
        whiteBoard2.write();

        System.out.println(blackBoard);
        blackBoard.write();


        Eggable tortle = new Tortle("Dirby\n", 56);
        System.out.println(tortle);

        Swimable tortle2 = new Tortle("Drusty\n", 56);
        System.out.println(tortle2);

        Eggable chicken= new Chicken("Daffy");
        Eggable[] ChikenAndTortles = new Eggable[2];



        ChikenAndTortles[0]=chicken;
        ChikenAndTortles[1]=tortle;


        System.out.println(Arrays.toString(ChikenAndTortles));

        System.out.println(Swimable.swimsOrNot);
        System.out.println(Eggable.laysEggsOrNot);
    }
}
