abstract class EntityOnMap {
    //abstract for 3 player types
    protected int coordinateX;
    protected int coordinateY;
    private Team teamBelong;
    public Team getTeamBelong(){
        return this.teamBelong;
    }

    public int getCoordinateX(){
        return this.coordinateX;
    }

    public int getCoordinateY(){
        return this.coordinateY;
    }

}
