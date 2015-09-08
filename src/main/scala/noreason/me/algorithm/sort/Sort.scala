package noreason.me.algorithm.sort


/**
Created on 2015-09-08

@author : MSK
description :
  */
abstract class Sort {
  def sort(data: Array[Integer])

  def swap(data: Array[Integer], i:Int, j:Int) = {
      val temp = data(j-1)
      data(j-1) = data(j)
      data(j) = temp
  }

}
