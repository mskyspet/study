package noreason.me.algorithm.sort
/**
Created on 2015-09-08

@author : MSK
description :
  插入排序
  最后将所有大的元素向右移动， 而非一对一对挪动
*/
object InsertionAd extends Sort {

  def find_position(data: Array[Int], i: Int): Int = {
    val this_value = data(i)
    val start_index = i - 1
    for (j <- start_index to 0 by -1){
      if (data(j) < this_value){
        return j + 1
      }
    }
    i
  }

  def loop_swap(data: Array[Int], this_index:Int, position:Int): Unit = {
    val this_value = data(this_index)
    for (i <- this_index to position+1 by -1) {
      data(i) = data(i-1)
    }
    data(position) = this_value
  }
  override def sort(data: Array[Int]): Array[Int] = {
    val max_index = data.length - 1
    for (i <- 1 to max_index){
      val position = find_position(data, i)
      if (position != i){
        loop_swap(data, i, position)
      }
    }
    data
  }
}
