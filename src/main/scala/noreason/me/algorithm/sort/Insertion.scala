package noreason.me.algorithm.sort

/**
Created on 2015-09-08

@author : MSK
description :
  basic insert sort
*/
class Insertion extends Sort{
  override def sort(data: Array[Integer]): Unit = {
    val max_index = data.length - 1
    for (i <- 1 to max_index){
      val start_index = i
      for (j <- start_index to 1 by -1){
        if (data(j) < data(j-1)){
          swap(data, j, j-1)
        }
      }
    }
  }
}
