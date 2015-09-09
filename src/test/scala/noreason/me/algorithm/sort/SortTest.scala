package noreason.me.algorithm.sort

import org.scalatest._

/**
Created on 2015-09-09

@author : MSK
description :
  */
class SortTest extends FunSuite {

  def getSourceValues = Array(5,4,3,2,1)

  def assertSortResult(values: Array[Int]): Unit = {
    val max_index = values.length - 1
    for ((value, i) <- values.zipWithIndex){
      if (i != max_index) {
        assert(value < values(i+1))
      }
    }
  }

  test("Selection sort should be OK") {
    assertSortResult(Selection.sort(getSourceValues))
  }

  test("Insertion sort should be OK") {
    assertSortResult(Insertion.sort(getSourceValues))
  }

}
