package jetbrains.mps.samples.matrixLanguage.runtime;

/*Generated by MPS */


public class Matrix<ScalarType> {
  private ScalarType[][] values;
  private FieldOperations<ScalarType> operations;

  public Matrix(ScalarType[][] values, FieldOperations<ScalarType> operations) {
    this.values = values;
    this.operations = operations;
  }

  public ScalarType getValueAt(int row, int column) {
    return this.values[row][column];
  }

  public Matrix clone() {
    ScalarType[][] copy = ((ScalarType[][]) new Object[this.values.length][this.values[0].length]);
    for (int i = 0; i < this.values.length; i++) {
      for (int j = 0; j < this.values[0].length; j++) {
        copy[i][j] = this.values[i][j];
      }
    }
    return new Matrix<ScalarType>(copy, this.operations);
  }

  public Matrix<ScalarType> mult(ScalarType v) {
    ScalarType[][] result = ((ScalarType[][]) new Object[this.values.length][this.values[0].length]);
    for (int i = 0; i < this.values.length; i++) {
      for (int j = 0; j < this.values[i].length; j++) {
        result[i][j] = this.operations.mult(this.values[i][j], v);
      }
    }
    return new Matrix<ScalarType>(result, this.operations);
  }

  public Matrix<ScalarType> div(ScalarType v) {
    ScalarType[][] result = ((ScalarType[][]) new Object[this.values.length][this.values[0].length]);
    v = this.operations.multiplicativeInverse(v);
    for (int i = 0; i < this.values.length; i++) {
      for (int j = 0; j < this.values[i].length; j++) {
        result[i][j] = this.operations.mult(this.values[i][j], v);
      }
    }
    return new Matrix<ScalarType>(result, this.operations);
  }

  public Matrix<ScalarType> add(Matrix<ScalarType> m) {
    this.ChechSizeEquals(m);
    ScalarType[][] result = ((ScalarType[][]) new Object[this.values.length][this.values[0].length]);
    for (int i = 0; i < this.values.length; i++) {
      for (int j = 0; j < this.values[i].length; j++) {
        result[i][j] = this.operations.add(this.values[i][j], m.values[i][j]);
      }
    }
    return new Matrix<ScalarType>(result, this.operations);
  }

  public Matrix<ScalarType> sub(Matrix<ScalarType> m) {
    this.ChechSizeEquals(m);
    ScalarType[][] result = ((ScalarType[][]) new Object[this.values.length][this.values[0].length]);
    for (int i = 0; i < this.values.length; i++) {
      for (int j = 0; j < this.values[i].length; j++) {
        result[i][j] = this.operations.add(this.values[i][j], this.operations.addittiveInverse(m.values[i][j]));
      }
    }
    return new Matrix<ScalarType>(result, this.operations);
  }

  private void ChechSizeEquals(Matrix<ScalarType> m) {
    if (this.getRowsNumber() != m.getRowsNumber()) {
      throw new BadMatrixDimensionException();
    }
    if (this.getColumnsNumber() != m.getColumnsNumber()) {
      throw new BadMatrixDimensionException();
    }
  }

  public Matrix<ScalarType> mult(Matrix<ScalarType> m) {
    if (this.getColumnsNumber() != m.getRowsNumber()) {
      throw new BadMatrixDimensionException();
    }
    ScalarType[][] result = ((ScalarType[][]) new Object[this.getRowsNumber()][m.getColumnsNumber()]);
    for (int i = 0; i < this.getRowsNumber(); i++) {
      for (int j = 0; j < m.getColumnsNumber(); j++) {
        ScalarType sum = null;
        for (int k = 0; k < this.getColumnsNumber(); k++) {
          ScalarType tmp = this.operations.mult(this.values[i][k], m.values[k][j]);
          if (sum == null) {
            sum = tmp;
          } else {
            sum = this.operations.add(sum, tmp);
          }
        }
        result[i][j] = sum;
      }
    }
    return new Matrix<ScalarType>(result, this.operations);
  }

  public Matrix<ScalarType> transpose() {
    ScalarType[][] result = ((ScalarType[][]) new Object[this.values[0].length][this.values.length]);
    for (int i = 0; i < this.values.length; i++) {
      for (int j = 0; j < this.values[i].length; j++) {
        result[j][i] = this.values[i][j];
      }
    }
    return new Matrix<ScalarType>(result, this.operations);
  }

  public ScalarType determinant() {
    if (this.getRowsNumber() != this.getColumnsNumber()) {
      throw new BadMatrixDimensionException();
    }
    return this.determinant(0, new boolean[this.values.length]);
  }

  private ScalarType determinant(int row, boolean[] notFree) {
    if (row == this.getColumnsNumber() - 1) {
      for (int i = 0; i < this.getRowsNumber(); i++) {
        if (!(notFree[i])) {
          return this.getValueAt(row, i);
        }
      }
    }
    int signum = 1;
    ScalarType sum = null;
    for (int i = 0; i < this.values.length; i++) {
      if (!(notFree[i])) {
        notFree[i] = true;
        ScalarType tmp = this.operations.mult(this.determinant(row + 1, notFree), this.values[row][i]);
        if (signum == -1) {
          tmp = this.operations.addittiveInverse(tmp);
        }
        if (sum == null) {
          sum = tmp;
        } else {
          sum = this.operations.add(sum, tmp);
        }
        signum = 0 - signum;
        notFree[i] = false;
      }
    }
    return sum;
  }

  public int getRowsNumber() {
    return this.values.length;
  }

  public int getColumnsNumber() {
    return this.values[0].length;
  }
}
