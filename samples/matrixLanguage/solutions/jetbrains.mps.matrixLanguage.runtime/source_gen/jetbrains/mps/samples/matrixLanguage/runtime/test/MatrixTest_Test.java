package jetbrains.mps.samples.matrixLanguage.runtime.test;

/*Generated by MPS */

import junit.framework.TestCase;
import jetbrains.mps.samples.matrixLanguage.runtime.Matrix;
import junit.framework.Assert;
import jetbrains.mps.samples.matrixLanguage.runtime.DoubleFieldOperations;
import jetbrains.mps.samples.matrixLanguage.runtime.MatrixIterator;

public class MatrixTest_Test extends TestCase {
  private static double EPSILON = 0.00001;

  public void test_matixCreation() throws Exception {
    Matrix<Double> m = this.makeMatrix();
    Assert.assertEquals(10.0, m.getValueAt(0, 0).doubleValue());
    Assert.assertEquals(20.0, m.getValueAt(1, 0).doubleValue());
  }

  public void test_matrixCopy() throws Exception {
    Matrix m = this.makeMatrix();
    Matrix c = m.clone();
    Assert.assertEquals(10.0, c.getValueAt(0, 0));
  }

  public void test_multiplicationByDouble() throws Exception {
    Matrix m = this.makeMatrix();
    Matrix result = m.mult(2.0);
    Assert.assertEquals(20.0, result.getValueAt(0, 0));
  }

  public void test_matrixAddition() throws Exception {
    Matrix m = this.makeMatrix();
    Matrix d = m.add(m);
    Assert.assertEquals(20.0, d.getValueAt(0, 0));
  }

  public void test_matrixDeterminant2() throws Exception {
    Matrix<Double> m = new Matrix<Double>(new Double[][]{{1.0 ,2.0},{3.0 ,4.0}}, new DoubleFieldOperations());
    Assert.assertTrue(m.determinant() + 2 < EPSILON);
  }

  public void test_matrixTranspose() throws Exception {
    Matrix m = this.makeMatrix();
    Matrix t = m.transpose();
    Assert.assertEquals(20.0, t.getValueAt(0, 1));
  }

  public void test_matrixMultiplication() throws Exception {
    Matrix m = this.makeMatrix();
    Matrix t = m.transpose();
    Assert.assertEquals(500.0, t.mult(m).getValueAt(0, 0));
  }

  public void test_iteratorTest() throws Exception {
    Matrix<Double> m = this.makeMatrix();
    MatrixIterator i = new MatrixIterator(m);
    Assert.assertEquals(10.0, i.getNext());
    Assert.assertEquals(20.0, i.getNext());
  }

  public Matrix<Double> makeMatrix() {
    return new Matrix<Double>(new Double[][]{{10.0},{20.0}}, new DoubleFieldOperations());
  }
}
