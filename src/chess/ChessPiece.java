package chess;

public class ChessPiece {
    private final PieceType type;
    private final Team team;

    //TODO Potencijalno dodati koordinate

    public ChessPiece(PieceType type, Team team) {
        this.type = type;
        this.team = team;
    }

    public PieceType getType() {
        return type;
    }

    public Team getTeam() {
        return team;
    }
}
