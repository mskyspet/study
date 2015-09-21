package noreason.me.algorithm.sort


import org.joda.time._
import org.scalatest.{BeforeAndAfter, FunSuite}

import scala.collection.mutable.ListBuffer
import scala.io.Source

/**
Created on 2015-09-09

@author : MSK
description :
  */
class SortTest extends FunSuite with BeforeAndAfter{

  var dataArray:Array[Int] = _

  var sourceDataArray:Array[Int] = getSourceValues

  var startTime:Instant = _

  before {
    dataArray = sourceDataArray.clone()
    startTime =  new Instant
  }

  after {
    val duration = new Duration(startTime, new Instant)
    info(duration.getMillis.toString)
  }

  def getSourceValues: Array[Int] = {
    val sortList:ListBuffer[Int] = ListBuffer()
    for ( line <- Source.fromURL(getClass.getResource("/sort.data")).getLines() ){
      sortList += Integer.parseInt(line)
    }
    sortList.toArray
  }

  def assertSortResult(values: Array[Int]): Unit = {
    val max_index = values.length - 1
    for ((value, i) <- values.zipWithIndex){
      if (i != max_index) {
        assert(value < values(i+1))
      }
    }
  }

//  test("Selection sort should be OK") {
//    assertSortResult(Selection.sort(dataArray))
//  }

  test("Insertion sort should be OK") {
    assertSortResult(Insertion.sort(dataArray))
  }

  test("Merge sort should be OK") {
    assertSortResult(Merge.sort(dataArray))
  }

  test("Shell sort should be OK") {
    assertSortResult(Shell.sort(dataArray))
  }

  test("Quick sort should be OK") {
    assertSortResult(Quick.sort(dataArray))
  }

}
