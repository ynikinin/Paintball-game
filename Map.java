public class Map {
    private int width;
    private int height;
    private Bunker[] bunkersInGame;
    private RedPlayer[] redPlayersInGame;
    private BluePlayer[] bluePlayersInGame;
    private GreenPlayer[] greenPlayersInGame;
    public Map(int width, int height, Bunker[] bunkers){
        this.width = width;
        this.height = height;
        this.bunkersInGame = bunkers;
    }
}
