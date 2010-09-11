package jetbrains.mps.graphLayout.util;

/*Generated by MPS */


public enum Direction2D {
  RIGHT(),
  DOWN(),
  LEFT(),
  UP();

  Direction2D() {
  }

  public Direction2D turnClockwise(int angle) {
    int dir = ordinal() + angle;
    if (dir > 3) {
      dir -= 4;
    }
    return get(dir);
  }

  public Direction2D opposite() {
    return turnClockwise(2);
  }

  public int getTurn(Direction2D dir) {
    int turn = dir.ordinal() - ordinal();
    if (turn == 2) {
      return -2;
    }
    if (turn == 3) {
      return -1;
    }
    if (turn == -3) {
      return 1;
    }
    return turn;
  }

  public boolean isHorizontal() {
    return this == Direction2D.RIGHT || this == Direction2D.LEFT;
  }

  public static Direction2D get(int intDirection) {
    return Direction2D.values()[intDirection];
  }

  static {
  }
}
