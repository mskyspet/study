package noreason.me.algorithm.sort

/**
Created on 2015-09-19

@author : MSK
description :
  */
object Shell extends Sort{

  override def sort(data :Array[Int]): Array[Int] = {
    val N = data.length
    var k:Int = 1
    while (k < N / 3) {
      k = 3 * k + 1
    }

    while (k >= 1) {
      for (i <- k to N-1) {
        var j = i
        while (j >=k && data(j) < data(j-k)) {
          swap(data, j, j-k)
          j -= k
        }
      }
      k = k/3
    }
    data
  }
}
