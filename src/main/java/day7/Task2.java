package day7;

public class Task2 {
    public static void main(String[] args) {
        Player player1 = new Player(90);
        System.out.println(Player.getCountPlayers());
        Player player2 = new Player(95);
        System.out.println(Player.getCountPlayers());
        Player player3 = new Player(91);
        System.out.println(Player.getCountPlayers());

        Player.info();
        Player player4 = new Player(93);
        System.out.println(Player.getCountPlayers());
        Player player5 = new Player(100);
        System.out.println(Player.getCountPlayers());
        Player player6 = new Player(98);
        System.out.println(Player.getCountPlayers());

        Player.info();

        Player player7=new Player(90);
        System.out.println(Player.getCountPlayers());

        Player.info();
        for (int i=0; i<91; i++)
        player3.run();
        Player.info();
    }
}
