package noreason.me.algorithm.sort

import scala.util.control.Breaks._
/**
Created on 2015-09-08

@author : MSK
description :
  */
class InsertionAd extends Sort {

  def find_position(data: Array[Integer], i: Int): Int = {
    val this_value = data(i)
    val start_index = i - 1
    for (j <- start_index to 0 by -1){
      if (data(j) < this_value){
        return j + 1
      }
    }
    return i
  }

  def loop_swap(data: Array[Integer], this_index:Int, position:Int): Unit = {
    val this_value = data(this_index)
    for (i <- this_index to position+1 by -1) {
      data(i) = data(i-1)
    }
    data(position) = this_value
  }
  override def sort(data: Array[Integer]): Unit = {
    val max_index = data.length - 1
    for (i <- 1 to max_index){
      val position = find_position(data, i)
      if (position != i){
        loop_swap(data, i, position)
      }
    }
  }
}
