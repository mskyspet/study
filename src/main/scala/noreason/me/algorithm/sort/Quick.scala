package noreason.me.algorithm.sort

import scala.collection.mutable.ListBuffer

/**
Created on 2015-09-19

@author : MSK
description :
  */
object Quick extends Sort{
  override def sort(data: Array[Int]): Array[Int] = {
    quickSort(data, 0, data.length-1)
  }

  def quickSort(data: Array[Int], startIndex: Int, endIndex:Int): Array[Int] = {
    if (startIndex >= endIndex)
      return data

    val middleValue = data(startIndex)
    var i = startIndex
    var j = endIndex

    while(i != j){
      while (i < j && data(j) >= middleValue){
        j -= 1
      }
      data(i) = data(j)
      while (i < j && data(i) <= middleValue){
        i += 1
      }
      data(j) = data(i)
    }
    data(i) = middleValue
    quickSort(data, startIndex, i-1)
    quickSort(data, j+1, endIndex)
    data
  }
}
