package com.github.eirslett.sc8

import com.twitter.util.Future


object Transformers {
  def stringProcessor(input: String, processor: (String => Int)) = processor(input)

  def performCalculation(a: Int, b: Int, c: Int, operation: (Int,Int,Int) => Int) = operation(a,b,c)

  def somethingInTheFuture = Future { "hello" }
}
