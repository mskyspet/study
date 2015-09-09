package noreason.me.algorithm.sort

/**
Created on 2015-09-09

@author : MSK
description :
  */
object Merge extends Sort{

  def sort(data: Array[Int]): Array[Int] = {
    sort(data, 0, data.length-1)
    data
  }

  def sort(data: Array[Int], lo:Int, hi:Int): Unit = {
    if (lo >= hi){
      return
    }
    val mid = lo + (hi - lo) / 2
    sort(data, lo, mid)
    sort(data, mid+1, hi)
    merge(data, lo, mid, hi)
  }

  def merge(data: Array[Int], lo:Int, mid:Int, hi:Int):Unit = {
    var i = lo
    var j = mid + 1
    val size = hi - lo + 1
    val values = Array.ofDim[Int](size)
    for (cursor <- 0 to size-1) {
      if (i > mid || ( j<= hi && data(j) < data(i) ) ){
        values(cursor) = data(j)
        j += 1
      } else if (j > hi || data(i) < data(j)) {
        values(cursor) = data(i)
        i += 1
      }
    }
    for (cursor <- 0 to size-1) {
      data(lo + cursor) = values(cursor)
    }
  }

}