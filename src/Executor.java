import Game.Game;

public class Executor {
        public static void main(String[] args) {
            Game mafiya = new Game();
            Game football = new Game();

            System.out.print(mafiya.getNumberofplayers());
            System.out.print(football.getNumberofplayers());

            System.out.print(mafiya.numberofjudges);
            System.out.print(football.numberofjudges);
        }
}
