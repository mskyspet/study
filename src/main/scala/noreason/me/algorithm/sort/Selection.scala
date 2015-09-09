package noreason.me.algorithm.sort
/**
Created on 2015-09-08

@author : MSK
description :
  选择排序
  */
object Selection extends Sort{
  override def sort(data :Array[Int]): Array[Int] = {
    val end_index = data.length - 1
    for (i <- 0 to end_index ){
      val start_index = i+1
      var min_value = data.apply(i)
      var min_index = i
      for (j <- start_index to end_index){
        if (data(j).compareTo(min_value) < 0){
          min_value = data.apply(j)
          min_index = j
        }
      }
      if (min_index != i){
        swap(data, min_index, i)
      }
    }
    data
  }
}
