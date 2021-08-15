package day17;

public enum ChessPiece {
    KING_WHITE(100,"king white"), KING_BLACK(100,"king black"),
    QUEEN_WHITE(9,"queen white"),QUEEN_BLACK(9,"queen black"),
    ROOK_WHITE(5,"rook white"), ROOK_BLACK(5, "rook black"),
    BISHOP_WHITE(3.5, "bishop white"), BISHOP_BLACK(3.5, "bishop black"),
    KNIGHT_WHITE(3, "knight white"), KNIGHT_BLACK(3, "knight black"),
    PAWN_WHITE(1, "pawn white"), PAWN_BLACK(1,"pawn black"),
    EMPTY(-1, "_");

    private double value;
    private String representation;

    ChessPiece(double value, String representation) {
        this.value = value;
        this.representation = representation;
    }

    public String getRepresentation() {
        return representation;
    }
}
