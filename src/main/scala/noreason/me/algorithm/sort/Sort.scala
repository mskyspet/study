package noreason.me.algorithm.sort


/**
Created on 2015-09-08

@author : MSK
description :
  */
abstract class Sort {
  def sort(data: Array[Int]): Array[Int]

  def swap(data: Array[Int], i:Int, j:Int) = {
      val temp = data(i)
      data(i) = data(j)
      data(j) = temp
  }

}
